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
@Entity(tableName = TedTalkConstants.TED_POD_CAST_TABLE_NAME)
@TypeConverters(SegmentTypeConverter.class)
public class TedPodCastVO {

    @PrimaryKey(autoGenerate = true)
    private long ted_podcast_primary_id;

    @SerializedName("podcast_id")
    private int podcastId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String image;

    @SerializedName("description")
    private String description;

    @SerializedName("segments")
    private List<SegmentVO> segmentVOList;

    public void setTed_podcast_primary_id(long ted_podcast_primary_id) {
        this.ted_podcast_primary_id = ted_podcast_primary_id;
    }

    public void setPodcastId(int podcastId) {
        this.podcastId = podcastId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSegmentVOList(List<SegmentVO> segmentVOList) {
        this.segmentVOList = segmentVOList;
    }

    public long getTed_podcast_primary_id() {
        return ted_podcast_primary_id;
    }

    public int getPodcastId() {
        return podcastId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public List<SegmentVO> getSegmentVOList() {
        return segmentVOList;
    }
}
