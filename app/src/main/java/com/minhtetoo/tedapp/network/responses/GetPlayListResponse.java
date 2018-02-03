package com.minhtetoo.tedapp.network.responses;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.data.vo.TedPlayListVO;

import java.util.List;

/**
 * Created by min on 1/26/2018.
 */

public class GetPlayListResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int pageNo;

    @SerializedName("ted_playlists")
    private List<TedPlayListVO> tedPlayListVOList;

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

    public List<TedPlayListVO> getTedPlayListVOList() {
        return tedPlayListVOList;
    }
}
