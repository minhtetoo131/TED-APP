package com.minhtetoo.tedapp.network.responses;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.data.vo.TedTalkVO;

import java.util.List;

/**
 * Created by min on 1/25/2018.
 */

public class GetTedTalksResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int pageNo;

    @SerializedName("ted_talks")
    private List<TedTalkVO> talksList;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public int getPageNo() {
        return pageNo;
    }

    public List<TedTalkVO> getTalksList() {
        return talksList;
    }
}
