package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.utils.TedTalkConstants;

/**
 * Created by min on 1/25/2018.
 */
@Entity(tableName = TedTalkConstants.TED_TALK_SPEAKER_TABLE_NAME)
public class SpeakerVO {

    @PrimaryKey(autoGenerate = true)
    private long speaker_primary_id;

    @SerializedName("speaker_id")
    private int speakerId;

    @SerializedName("name")
    private String speakerName;


    public long getSpeaker_primary_id() {
        return speaker_primary_id;
    }

    public int getSpeakerId() {
        return speakerId;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeaker_primary_id(long speaker_primary_id) {
        this.speaker_primary_id = speaker_primary_id;
    }

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }
}
