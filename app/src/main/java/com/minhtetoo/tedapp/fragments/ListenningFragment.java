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
import com.minhtetoo.tedapp.adapters.ListenningRecyclerAdapter;

/**
 * Created by min on 1/24/2018.
 */

public class ListenningFragment extends Fragment {
    public ListenningFragment() {
    }

    public static ListenningFragment getListenningFragInstance(){
        ListenningFragment listenningFragment = new ListenningFragment();
        return listenningFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View listenningFragment =inflater.inflate(R.layout.fragment_listenning,container,false);

        RecyclerView listenningRecyclerView = listenningFragment.findViewById(R.id.rv_listenning);
        listenningRecyclerView.setAdapter(new ListenningRecyclerAdapter(getActivity()));
        listenningRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

        return listenningFragment;
    }
}
