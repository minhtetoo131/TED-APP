package com.minhtetoo.tedapp.data.db;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.minhtetoo.tedapp.data.vo.ResultVO;
import com.minhtetoo.tedapp.data.vo.TedPlayListVO;
import com.minhtetoo.tedapp.data.vo.TedPodCastVO;
import com.minhtetoo.tedapp.data.vo.TedTalkVO;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

import java.util.List;


@Dao
public interface TedTalkDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertTedTalks(TedTalkVO tedTalkVO);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertTedTalks(TedTalkVO... tedTalkVOS);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertTedPlayList(TedPlayListVO... tedPlaylistVOS);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertTedPodCast(TedPodCastVO... tedPodcastsVOS);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertTedSearch(ResultVO... resultsVO);


    @Query("SELECT * FROM "+ TedTalkConstants.TED_TALK_TABLE_NAME)
    LiveData<List<TedTalkVO>> getAllTedTalks();

    @Query("SELECT * FROM "+ TedTalkConstants.TED_SEARCH_TABLE_NAME+" WHERE mTitle LIKE :searchValue OR mResultType LIKE :resultType" )
    LiveData<List<ResultVO>> getSearchDataByValue(String searchValue, String resultType);

    @Query("SELECT * FROM "+ TedTalkConstants.TED_TALK_TABLE_NAME+" WHERE mTalkId = :tedTalkId LIMIT 1" )
    TedTalkVO getTedTalksById(long tedTalkId);

    @Query("SELECT * FROM "+ TedTalkConstants.TED_PLAY_LIST_TABLE_NAME+" WHERE mPlaylistId = :tedPlayListId LIMIT 1" )
    TedPlayListVO getTedPlayListById(long tedPlayListId);

    @Query("SELECT * FROM "+ TedTalkConstants.TED_POD_CAST_TABLE_NAME+" WHERE mPodcastId = :tedPodCastId LIMIT 1" )
    TedPodCastVO getTedPodCastById(long tedPodCastId);

    @Query("SELECT * FROM "+ TedTalkConstants.TED_PLAY_LIST_TABLE_NAME)
    LiveData<List<TedPlayListVO>> getAllTedPlayList();

    @Query("SELECT * FROM "+ TedTalkConstants.TED_POD_CAST_TABLE_NAME)
    LiveData<List<TedPodCastVO>> getAllTedPodCast();

    @Query("DELETE FROM "+TedTalkConstants.TED_TALK_TABLE_NAME)
    void deleteTedTalk();

    @Query("DELETE FROM "+TedTalkConstants.TED_PLAY_LIST_TABLE_NAME)
    void deleteTedPlaylist();

    @Query("DELETE FROM "+TedTalkConstants.TED_POD_CAST_TABLE_NAME)
    void deleteTedPodCast();

    @Query("DELETE FROM "+TedTalkConstants.TED_SEARCH_TABLE_NAME)
    void deleteTedSearch();


}
