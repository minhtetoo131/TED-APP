package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

/**
 * Created by min on 1/25/2018.
 */
@Entity(tableName = TedTalkConstants.TED_TALK_TAG_TABLE_NAME)
public class TagVO {

    @PrimaryKey(autoGenerate = true)
    private long tag_primary_id;

    @SerializedName("tag_id")
    private int tagId;

    @SerializedName("tag")
    private String tag;

    @SerializedName("description")
    private String tagDescription;

    public void setTag_primary_id(long tag_primary_id) {
        this.tag_primary_id = tag_primary_id;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public long getTag_primary_id() {
        return tag_primary_id;
    }

    public int getTagId() {
        return tagId;
    }

    public String getTag() {
        return tag;
    }

    public String getTagDescription() {
        return tagDescription;
    }
}
