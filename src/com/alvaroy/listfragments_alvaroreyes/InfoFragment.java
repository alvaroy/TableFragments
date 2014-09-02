package com.alvaroy.listfragments_alvaroreyes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoFragment extends Fragment {
	
	private TextView name;
	private TextView phone;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.showres, container, false);
		name = (TextView) rootView.findViewById(R.id.nameView);
		name.setText(this.getArguments().getString("Name"));
		phone = (TextView) rootView.findViewById(R.id.phoneView);
		phone.setText(this.getArguments().getString("Phone"));
		return rootView;
	}
}
