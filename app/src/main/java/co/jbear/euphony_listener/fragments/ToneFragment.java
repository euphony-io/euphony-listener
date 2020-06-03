package co.jbear.euphony_listener.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.jbear.euphony_listener.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ToneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ToneFragment extends Fragment {

    public ToneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ToneFragment.
     */
    // TODO: Rename and change types and number of parameters
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
        return v;
    }
}