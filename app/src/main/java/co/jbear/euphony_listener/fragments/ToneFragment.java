package co.jbear.euphony_listener.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import co.euphony.rx.EuRxManager;
import co.euphony.rx.FrequencyDetector;
import co.euphony.util.EuOption;
import co.euphony.util.EuSetting;
import co.jbear.euphony_listener.R;


public class ToneFragment extends Fragment {

    TextView freqView = null;
    TextView freqStatusView = null;
    SeekBar mFrequencySeekBar = null;
    Button mListenBtn = null;
    boolean isListenBtnClicked = false;

    EuRxManager mRxManager = null;

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

        /*
        EuSetting setting = EuSetting.builder()
                .encodingWith(EuSetting.CodingType.BASE16)
                .modeWith(EuSetting.ModeType.DETECT)
                .build();
                */
        //EuOption option = new EuOption();
        //option.setMode(EuOption.CommunicationMode.DETECT);

        mRxManager = new EuRxManager(EuSetting.ModeType.DETECT);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tone, container, false);

        freqView = v.findViewById(R.id.frequency_view);
        freqStatusView = v.findViewById(R.id.frequency_status);

        mRxManager.setFrequencyDetector(new FrequencyDetector() {
            @Override
            public void detect(float amplitude) {
                String dBspl = Double.toString(20 * Math.log10(amplitude / 0.00002));
                freqView.setText(amplitude + "dBspl");
            }
        });

        mFrequencySeekBar = v.findViewById(R.id.frequencyBar);
        mFrequencySeekBar.incrementProgressBy(10);
        mFrequencySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                freqStatusView.setText("" + progress + "hz");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(isListenBtnClicked) {
                    switch (mRxManager.getStatus()) {
                        case RUNNING:
                            mRxManager.setFrequencyForDetect(seekBar.getProgress());
                            break;
                        case STOP:
                            mRxManager.listen(seekBar.getProgress());
                            break;
                    }
                }
            }
        });

        freqStatusView.setText("" + mFrequencySeekBar.getProgress() + "hz");

        mListenBtn = v.findViewById(R.id.tone_listen_btn);
        mListenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isListenBtnClicked ^= true;
                if(isListenBtnClicked) {
                    mListenBtn.setText("STOP");
                    mRxManager.listen(mFrequencySeekBar.getProgress());
                }
                else {
                    mListenBtn.setText("START");
                    mRxManager.finish();
                }
            }
        });

        return v;
    }
}