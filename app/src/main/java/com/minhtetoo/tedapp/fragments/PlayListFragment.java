package com.minhtetoo.tedapp.fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
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
import com.minhtetoo.tedapp.data.model.ViewModel;
import com.minhtetoo.tedapp.data.vo.TedPlayListVO;

import java.util.List;

/**
 * Created by min on 1/24/2018.
 */

public class PlayListFragment extends Fragment {

    private ViewModel mTedModel;

    private PlayListRecyclerAdapter mPlaylistRecyclerAdapter;

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
        playListRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        mPlaylistRecyclerAdapter = new PlayListRecyclerAdapter(getContext());
        playListRecyclerView.setAdapter(mPlaylistRecyclerAdapter);


        mTedModel = ViewModelProviders.of(this).get(ViewModel.class);
        mTedModel.loadTedPlayList();
        mTedModel.initDatabase(getContext());
        mTedModel.getTedPlayList().observe(this, new Observer<List<TedPlayListVO>>() {
            @Override
            public void onChanged(@Nullable List<TedPlayListVO> tedPlaylistVOS) {

            }
        });


        return playlistFragment ;
    }



}
