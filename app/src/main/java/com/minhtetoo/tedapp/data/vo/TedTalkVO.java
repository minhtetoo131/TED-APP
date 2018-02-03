package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.data.vo.SpeakerVO;
import com.minhtetoo.tedapp.data.vo.TagVO;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

import java.util.List;

/**
 * Created by min on 1/25/2018.
 */
@Entity(tableName = TedTalkConstants.TED_TALK_TABLE_NAME)
@TypeConverters(TedTypeConverter.class)
public class TedTalkVO {


    @PrimaryKey(autoGenerate = true)
    private long talk_primary_id;

    @SerializedName("talk_id")
    private int talkId;

    @SerializedName("title")
    private String title;

    @SerializedName("speaker")
    @Embedded
    private SpeakerVO speakerVO;

    @SerializedName("imageUrl")
    private String imageUrl;

    @SerializedName("durationInSec")
    private int talkDuration;

    @SerializedName("description")
    private String description;

    @SerializedName("tag")
    private List<TagVO>  tagVOList;


    public void setTalk_primary_id(long talk_primary_id) {
        this.talk_primary_id = talk_primary_id;
    }

    public void setTalkId(int talkId) {
        this.talkId = talkId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSpeakerVO(SpeakerVO speakerVO) {
        this.speakerVO = speakerVO;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTalkDuration(int talkDuration) {
        this.talkDuration = talkDuration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTagVOList(List<TagVO> tagVOList) {
        this.tagVOList = tagVOList;
    }

    public long getTalk_primary_id() {
        return talk_primary_id;
    }

    public int getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public SpeakerVO getSpeakerVO() {
        return speakerVO;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getTalkDuration() {
        return talkDuration;
    }

    public String getDescription() {
        return description;
    }

    public List<TagVO> getTagVOList() {
        return tagVOList;
    }
}
