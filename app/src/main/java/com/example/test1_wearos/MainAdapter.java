package com.example.test1_wearos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.test1_wearos.ListDetails;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    private Context context;
    ViewGroup.LayoutParams l;

    public MainAdapter(Context context,  ArrayList<ListDetails> headingArrayList) {
        this.context = context;

        HeadingArrayList = headingArrayList;
    }

    private ArrayList<ListDetails> HeadingArrayList;
    @Override
    public int getCount() {
        return HeadingArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return HeadingArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.design,parent, false);
            convertView.setMinimumHeight(90);


        }
        TextView rowHeading = convertView.findViewById(R.id.TextView);


        ListDetails items = (ListDetails) getItem(position);
        if(items.getDialogHeader() !=null) {
            rowHeading.setText(String.valueOf(items.getDialogHeader()));
        }else {  }
        return convertView;
    }
    }
