package com.kundan.demoform.demo.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kundan.demoform.R;
import com.kundan.demoform.demo.adapter.TestFragmentAdapter;
import com.viewpagerindicator.CirclePageIndicator;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private TestFragmentAdapter mAdapter;
    private ViewPager mPager;
    private CirclePageIndicator mIndicator;
    private Context mContext;
    private Button redBtn, greenBtn, blueBtn;
    private LinearLayout bottomLayout;
    private TextView textViewDisplay;
    private Button button1, button2, button3, button4, button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        mContext = getActivity();
        initializeComponent(v);

        return v;
    }

    private void initializeComponent(View v) {
        mAdapter = new TestFragmentAdapter(getChildFragmentManager());
        mPager = (ViewPager) v.findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator) v.findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

        redBtn = (Button) v.findViewById(R.id.buttonRed);
        greenBtn = (Button) v.findViewById(R.id.buttonGreen);
        blueBtn = (Button) v.findViewById(R.id.buttonBlue);
        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);
        bottomLayout = (LinearLayout) v.findViewById(R.id.bottomLayout);
        textViewDisplay = (TextView) v.findViewById(R.id.textViewDisplay);
        button1 = (Button) v.findViewById(R.id.button1);
        button2 = (Button) v.findViewById(R.id.button2);
        button3 = (Button) v.findViewById(R.id.button3);
        button4 = (Button) v.findViewById(R.id.button4);
        button5 = (Button) v.findViewById(R.id.button5);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRed:
                bottomLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonGreen:
                bottomLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.buttonBlue:
                bottomLayout.setBackgroundColor(Color.BLUE);
                break;

            case R.id.button1:
                textViewDisplay.setText(button1.getText());
                break;
            case R.id.button2:
                textViewDisplay.setText(button2.getText());
                break;
            case R.id.button3:
                textViewDisplay.setText(button3.getText());
                break;
            case R.id.button4:
                textViewDisplay.setText(button4.getText());
                break;
            case R.id.button5:
                textViewDisplay.setText(button5.getText());
                break;
        }
    }
}
