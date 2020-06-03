package co.jbear.euphony_listener.fragments;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.jbear.euphony_listener.R;
import euphony.lib.receiver.AcousticSensor;
import euphony.lib.receiver.EuRxManager;

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

    public static MessageFragment newInstance(String param1, String param2) {
        MessageFragment fragment = new MessageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
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