package com.example.exercice3_tp_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    ArrayList<pays> datapays=new ArrayList<>();
    Context context;


    public MyAdapter(ArrayList<pays> datapays,Context context){
        this.datapays=datapays;
        this.context=context;
    }
    @Override
    public int getCount() {
        return datapays.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view=convertView;

        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.view,null);
            ImageView imageview=(ImageView) view.findViewById(R.id.imageView);
            TextView nompays=(TextView) view.findViewById(R.id.textViewtop);
            TextView codepays=(TextView) view.findViewById(R.id.textViewbot);

            imageview.setImageResource(datapays.get(i).getPays());
            nompays.setText(datapays.get(i).getMonnaire());
            codepays.setText(datapays.get(i).getCode());

        }
        return view;
    }
}
