package com.minhtetoo.tedapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.tedapp.R;
import com.minhtetoo.tedapp.adapters.CategoryRecyclerAdapter;
import com.minhtetoo.tedapp.adapters.PlayListRecyclerAdapter;

/**
 * Created by min on 1/24/2018.
 */

public class PlayListFragment extends Fragment {

    public PlayListFragment() {
    }

    public static PlayListFragment getPlayListFragInstance(){
        PlayListFragment playListFragment = new PlayListFragment();
        return playListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View playlistFragment = inflater.inflate(R.layout.fragment_playlist,container,false);

        RecyclerView playListRecyclerView = playlistFragment.findViewById(R.id.rv_play_list);
        playListRecyclerView.setAdapter(new PlayListRecyclerAdapter(getActivity()));
        playListRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));


        return playlistFragment ;
    }



}
