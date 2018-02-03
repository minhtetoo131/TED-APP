package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

/**
 * Created by min on 1/26/2018.
 */
@Entity(tableName = TedTalkConstants.TED_SEGMENT_TABLE_NAME)
public class SegmentVO {

    @PrimaryKey(autoGenerate = true)
    private long segment_primary_id;

    @SerializedName("segment_id")
    private int segmentId;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String image;

    public long getSegment_primary_id() {
        return segment_primary_id;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setSegment_primary_id(long segment_primary_id) {
        this.segment_primary_id = segment_primary_id;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
