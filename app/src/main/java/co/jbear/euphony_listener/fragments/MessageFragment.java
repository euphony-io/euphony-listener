package co.jbear.euphony_listener.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.euphony.rx.AcousticSensor;
import co.euphony.rx.EuRxManager;
import co.jbear.euphony_listener.R;


public class MessageFragment extends Fragment {

    private boolean mode = false;
    private Context mContext;
    private View mainLayout;
    private TextView listenView;
    private Button listenBtn;

    EuRxManager mRxManager = new EuRxManager();

    public MessageFragment() {
        // Required empty public constructor
    }

    public static MessageFragment newInstance() {
        return new MessageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_message, container, false);
        mContext = this.getActivity();
        mainLayout = v.findViewById(R.id.mainLayout);
        listenView = v.findViewById(R.id.listenView);
        listenBtn = v.findViewById(R.id.button);

        mRxManager.setAcousticSensor(new AcousticSensor() {
            @Override
            public void notify(String letters) {
                listenView.setText(letters);
                listenBtn.setText("Listen");
                mode = false;
            }
        });

        listenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mode) {
                    mRxManager.finish();
                    listenBtn.setText("Listen");
                    mode = false;
                } else {
                    mRxManager.listen();  //Listening Start
                    listenBtn.setText("Stop");
                    mode = true;
                }
            }
        });

        return v;
    }
}