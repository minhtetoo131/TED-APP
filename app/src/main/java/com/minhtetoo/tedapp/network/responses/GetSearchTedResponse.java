package com.minhtetoo.tedapp.network.responses;

import com.google.gson.annotations.SerializedName;
import com.minhtetoo.tedapp.data.vo.ResultVO;

import java.util.List;

/**
 * Created by min on 1/30/2018.
 */

public class GetSearchTedResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private int pageNo;

    private List<ResultVO> resultVOList;

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

    public List<ResultVO> getResultVOList() {
        return resultVOList;
    }
}
