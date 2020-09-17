package co.jbear.euphony_listener.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import co.jbear.euphony_listener.R;
import euphony.lib.receiver.APICallDetector;
import euphony.lib.receiver.EuRxManager;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link APICallFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class APICallFragment extends Fragment {

    int api_1_count = 0;
    int api_2_count = 0;
    int api_3_count = 0;

    TextView API_1_COUNT, API_2_COUNT, API_3_COUNT;


    EuRxManager mRxManager = new EuRxManager();
    public APICallFragment() {
        // Required empty public constructor
    }

    public static APICallFragment newInstance(String param1, String param2) {
        APICallFragment fragment = new APICallFragment();
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
        View v = inflater.inflate(R.layout.fragment_api_call, container, false);

        API_1_COUNT = v.findViewById(R.id.frequency_count_1);
        API_2_COUNT = v.findViewById(R.id.frequency_count_2);
        API_3_COUNT = v.findViewById(R.id.frequency_count_3);

        mRxManager.setOnAPICalled(18500, new APICallDetector() {
            @Override
            public void call() {
                api_1_count++;
                API_1_COUNT.setText("" + api_1_count);
            }
        });

        mRxManager.setOnAPICalled(19000, new APICallDetector() {
            @Override
            public void call() {
                api_2_count++;
                API_2_COUNT.setText("" + api_2_count);
            }
        });

        mRxManager.setOnAPICalled(20000, new APICallDetector() {
            @Override
            public void call() {
                api_3_count++;
                API_3_COUNT.setText("" + api_3_count);
            }
        });

        return v;

    }
}