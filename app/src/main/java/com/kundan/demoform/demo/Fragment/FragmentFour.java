package com.kundan.demoform.demo.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.kundan.demoform.R;

public class FragmentFour extends Fragment {

	private Context mContext;
	private View rootView;
	private static int position=0;
	private RelativeLayout fragmentOneRl;
	public FragmentFour() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_four, container, false);
		mContext = getActivity();
		fragmentOneRl= (RelativeLayout) rootView.findViewById(R.id.fragmentOneRl);
		fragmentOneRl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(mContext,"Fragment:"+position,Toast.LENGTH_SHORT).show();
			}
		});
		return rootView;

	}





	public static Fragment newInstance(String text, int pos) {

		FragmentFour f = new FragmentFour();
		Bundle b = new Bundle();
		b.putString("msg", text);
		f.setArguments(b);
		position=pos+1;
		return f;
	}



}
