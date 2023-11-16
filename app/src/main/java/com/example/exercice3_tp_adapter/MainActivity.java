package com.example.exercice3_tp_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listpays;
    ArrayList<pays> paysArrayList=new ArrayList<>();
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listpays=findViewById(R.id.listlv);

        paysArrayList.add(new pays(R.drawable.maroc,"maroc","mm"));
        paysArrayList.add(new pays(R.drawable.algeria,"algerien","aa"));
        paysArrayList.add(new pays(R.drawable.tunisia,"tunssia","tt"));
        paysArrayList.add(new pays(R.drawable.iraq,"iraq","ii"));


        MyAdapter a=new MyAdapter(paysArrayList,this);
        listpays.setAdapter(a);




    }
}