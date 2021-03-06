package com.minhtetoo.tedapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;


import com.minhtetoo.tedapp.viewholders.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;


public abstract class BaseRecyclerAdapter<T extends BaseViewHolder, W>
        extends RecyclerView.Adapter<T> {

    protected List<W> mData;
    protected LayoutInflater mLayoutInflator;
    Context context;

    public BaseRecyclerAdapter(Context context) {
        mData = new ArrayList<>();
        mLayoutInflator = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public void onBindViewHolder(T holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setNewData(List<W> newData) {
        mData = newData;
        notifyDataSetChanged();
    }

    public void appendNewData(List<W> newData) {
        mData.addAll(newData);
        notifyDataSetChanged();
    }

    public W getItemAt(int position) {
        if (position < mData.size() - 1)
            return mData.get(position);

        return null;
    }

    public List<W> getItems() {
        if (mData == null)
            return new ArrayList<>();

        return mData;
    }

    public void removeData(W data) {
        mData.remove(data);
        notifyDataSetChanged();
    }

    public void addNewData(W data) {
        mData.add(data);
        notifyDataSetChanged();
    }

    public void clearData() {
        mData = new ArrayList<>();
        notifyDataSetChanged();
    }
}
