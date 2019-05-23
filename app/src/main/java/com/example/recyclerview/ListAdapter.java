package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListAdapter extends RecyclerView.Adapter <ListAdapter.ListView>{
    private ArrayList <String> mData;
    private Context mContext;

    ListAdapter(Context pContext, ArrayList<String> list){
        this.mData = list;
        mContext = pContext;
    }

    @NonNull
    @Override
    public ListView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflator = LayoutInflater.from(this.mContext);
        View rowView = inflator.inflate(R.layout.list_item,null);
        ListView listView = new ListView(rowView);
        return listView;

    }

    @Override
    public void onBindViewHolder(@NonNull ListView viewHolder, int i) {
        String data = this.mData.get(i);
        viewHolder.tvListItems.setText(data);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ListView extends RecyclerView.ViewHolder{
        TextView tvListItems;
        public ListView(View v){
            super(v);
            tvListItems = v.findViewById(R.id.list_items);

        }
    }
}
