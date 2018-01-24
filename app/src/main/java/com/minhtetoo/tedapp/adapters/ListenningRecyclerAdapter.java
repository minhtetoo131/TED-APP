package com.minhtetoo.tedapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.tedapp.R;
import com.minhtetoo.tedapp.viewholders.ListenningViewHolder;

/**
 * Created by min on 1/24/2018.
 */

public class ListenningRecyclerAdapter extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public ListenningRecyclerAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listenningItemView = mLayoutInflater.inflate(R.layout.view_item_listenning,parent,false);

        ListenningViewHolder listenningViewHolder = new ListenningViewHolder(listenningItemView);
        return listenningViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
