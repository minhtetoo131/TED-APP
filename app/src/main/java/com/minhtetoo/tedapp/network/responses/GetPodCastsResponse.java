package com.minhtetoo.tedapp.network.responses;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.data.vo.TedPodCastVO;

import java.util.List;

/**
 * Created by min on 1/26/2018.
 */

public class GetPodCastsResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int pageNo;

    @SerializedName("ted_podcasts")
    private List<TedPodCastVO> tedPodCastVOList;

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

    public List<TedPodCastVO> getTedPodCastVOList() {
        return tedPodCastVOList;
    }
}
