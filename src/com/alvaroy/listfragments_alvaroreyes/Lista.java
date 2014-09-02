package com.alvaroy.listfragments_alvaroreyes;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Lista extends Fragment {
	
	ListView list;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
    	
        View rootView = inflater.inflate(R.layout.lista, container, false);
        list = (ListView) rootView.findViewById(R.id.listView1);
        list.setClickable(true);
        
        final List<Info> listInfo = new ArrayList<Info>();
        listInfo.add(new Info("Andres","3012345"));
        listInfo.add(new Info("Porfilio","3222222"));
        listInfo.add(new Info("Xavier","3666666"));
        
        InfoAdapter adapter = new InfoAdapter(rootView.getContext(), listInfo);
        
        list.setOnItemClickListener(new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
                Bundle args = new Bundle();
                args.putString("Name", listInfo.get(position).getName());
                args.putString("Phone", listInfo.get(position).getPhone());
                InfoFragment fragment = new InfoFragment();
                fragment.setArguments(args);
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.main, fragment).addToBackStack("Lista").commit();
            }        	
		});
        
        list.setAdapter(adapter);
        return rootView;
    }
}
