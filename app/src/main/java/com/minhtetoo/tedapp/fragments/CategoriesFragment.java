package com.minhtetoo.tedapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.tedapp.R;
import com.minhtetoo.tedapp.adapters.CategoryRecyclerAdapter;

/**
 * Created by min on 1/24/2018.
 */

public class CategoriesFragment extends Fragment {
    public CategoriesFragment() {
    }

    public static CategoriesFragment getCategoriesFragInstance(){
        CategoriesFragment categoriesFragment = new CategoriesFragment();
        return categoriesFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View categoryFragment = inflater.inflate(R.layout.fragment_categories,container,false);

        RecyclerView categoryRecyclerView = categoryFragment.findViewById(R.id.rv_categories);
        categoryRecyclerView.setAdapter(new CategoryRecyclerAdapter(getActivity()));
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

        return categoryFragment ;
    }
}
