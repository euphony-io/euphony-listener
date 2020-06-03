package co.jbear.euphony_listener.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.jbear.euphony_listener.R;
import euphony.lib.receiver.EuRxManager;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ToneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ToneFragment extends Fragment {

    TextView freqView = null;
    TextView freqStatusView = null;

    EuRxManager mRxManager = new EuRxManager();

    public ToneFragment() {
        // Required empty public constructor
    }

    public static ToneFragment newInstance(String param1, String param2) {
        ToneFragment fragment = new ToneFragment();
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
        View v = inflater.inflate(R.layout.fragment_tone, container, false);

        freqView = v.findViewById(R.id.frequency_view);
        freqStatusView = v.findViewById(R.id.frequency_status);

        Button listenBtn = v.findViewById(R.id.tone_listen_btn);
        listenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }
}