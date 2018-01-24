package com.minhtetoo.tedapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.tedapp.R;
import com.minhtetoo.tedapp.viewholders.CategoryViewHolder;
import com.minhtetoo.tedapp.viewholders.PlayListViewHolder;

/**
 * Created by min on 1/24/2018.
 */

public class PlayListRecyclerAdapter extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public PlayListRecyclerAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View playlistItemView = mLayoutInflater.inflate(R.layout.view_item_play_list,parent,false);
        PlayListViewHolder playListViewHolder= new PlayListViewHolder(playlistItemView);
        return playListViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
