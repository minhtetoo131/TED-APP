
package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.utils.TedTalkConstants;


import java.util.List;

@Entity(tableName = TedTalkConstants.TALK_PLAY_LIST_TABLE_NAME)
public class TalksInPlaylistVO {

    @PrimaryKey(autoGenerate = true)
    private long talk_in_playlist_primary_id;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("durationInSec")
    private Long mDurationInSec;

    @SerializedName("imageUrl")
    private String mImageUrl;

    @SerializedName("speaker")
    @Embedded
    private SpeakerVO mSpeaker;

    @SerializedName("tag")
    private List<TagVO> mTag;

    @SerializedName("talk_id")
    private Long mTalkId;

    @SerializedName("title")
    private String mTitle;

    public void setTalk_in_playlist_primary_id(long talk_in_playlist_primary_id) {
        this.talk_in_playlist_primary_id = talk_in_playlist_primary_id;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmDurationInSec(Long mDurationInSec) {
        this.mDurationInSec = mDurationInSec;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public void setmSpeaker(SpeakerVO mSpeaker) {
        this.mSpeaker = mSpeaker;
    }

    public void setmTag(List<TagVO> mTag) {
        this.mTag = mTag;
    }

    public void setmTalkId(Long mTalkId) {
        this.mTalkId = mTalkId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public long getTalk_in_playlist_primary_id() {
        return talk_in_playlist_primary_id;
    }

    public String getmDescription() {
        return mDescription;
    }

    public Long getmDurationInSec() {
        return mDurationInSec;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public SpeakerVO getmSpeaker() {
        return mSpeaker;
    }

    public List<TagVO> getmTag() {
        return mTag;
    }

    public Long getmTalkId() {
        return mTalkId;
    }

    public String getmTitle() {
        return mTitle;
    }
}
