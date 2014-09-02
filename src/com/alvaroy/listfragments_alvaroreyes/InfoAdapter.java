package com.alvaroy.listfragments_alvaroreyes;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class InfoAdapter extends BaseAdapter {

	private Context context;
	private List<Info> listInfo;
	
	public InfoAdapter (Context context, List<Info> listInfo)
	{
		this.context = context;
		this.listInfo = listInfo;
	}
	
	@Override
	public int getCount() {
		return listInfo.size();
	}

	@Override
	public Object getItem(int position) {
		return listInfo.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup viewGroup) {
		Info entry = listInfo.get(position);
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.info, null);
		}
		TextView tvName = (TextView) convertView.findViewById(R.id.nameText);
		tvName.setText(entry.getName());
		
		TextView tvPhone = (TextView) convertView.findViewById(R.id.phoneText);
		tvPhone.setText(entry.getPhone());
		
		return convertView;
	}
	
}

