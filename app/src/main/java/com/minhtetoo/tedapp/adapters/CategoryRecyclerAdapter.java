package com.minhtetoo.tedapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.tedapp.R;
import com.minhtetoo.tedapp.viewholders.CategoryViewHolder;

/**
 * Created by min on 1/24/2018.
 */

public class CategoryRecyclerAdapter extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public CategoryRecyclerAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View categoryItemView = mLayoutInflater.inflate(R.layout.view_item_categories,parent,false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(categoryItemView);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
