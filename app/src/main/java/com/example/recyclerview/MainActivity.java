package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList <String> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference of recyclerview
        RecyclerView rvList = findViewById(R.id.rv_list);
        LinearLayoutManager recyclerViewManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(recyclerViewManager);
        mData = new ArrayList<String>();
        for (int index = 0; index < 50; index++)
            mData.add("User "+index);
        //create reference of Adapter class
        ListAdapter listAdapter = new ListAdapter(this,mData);

        //set adapter
        rvList.setAdapter(listAdapter);
    }
}
