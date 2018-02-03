package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

import java.util.List;

/**
 * Created by min on 1/26/2018.
 */
@Entity(tableName = TedTalkConstants.TED_PLAY_LIST_TABLE_NAME)
@TypeConverters(TalksInPlaylistTypeConverter.class)
public class TedPlayListVO {

    @PrimaryKey(autoGenerate = true)
    private long playlist_primary_id;

    @SerializedName("playlist_id")
    private int playListId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String image;

    @SerializedName("totalTalks")
    private int talksInPlaylist;

    @SerializedName("description")
    private String description;

    @SerializedName("talksInPlaylist")
    private List<TalksInPlaylistVO> talksInPlayList;

    public void setPlayListId(int playListId) {
        this.playListId = playListId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTalksInPlaylist(int talksInPlaylist) {
        this.talksInPlaylist = talksInPlaylist;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTalksInPlayList(List<TalksInPlaylistVO> talksInPlayList) {
        this.talksInPlayList = talksInPlayList;
    }

    public int getPlayListId() {
        return playListId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getTalksInPlaylist() {
        return talksInPlaylist;
    }

    public String getDescription() {
        return description;
    }

    public List<TalksInPlaylistVO> getTalksInPlayList() {
        return talksInPlayList;
    }

    public void setPlaylist_primary_id(long playlist_primary_id) {
        this.playlist_primary_id = playlist_primary_id;
    }

    public long getPlaylist_primary_id() {
        return playlist_primary_id;
    }
}
