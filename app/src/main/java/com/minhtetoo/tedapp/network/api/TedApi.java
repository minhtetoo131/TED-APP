package com.minhtetoo.tedapp.network.api;



import com.minhtetoo.tedapp.network.responses.GetPlayListResponse;
import com.minhtetoo.tedapp.network.responses.GetPodCastsResponse;
import com.minhtetoo.tedapp.network.responses.GetSearchTedResponse;
import com.minhtetoo.tedapp.network.responses.GetTedTalksResponse;
import com.minhtetoo.tedapp.utils.TedConstants;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by min on 1/25/2018.
 */

public interface TedApi {
    @FormUrlEncoded
    @POST(TedConstants.API_POST_TED_TALK)
    Single<GetTedTalksResponse> getTedTalkList(
            @Field("access_token") String access_token,
            @Field("page") String page
    );

    @FormUrlEncoded
    @POST(TedConstants.API_POST_TED_PLAY_LIST)
    Single<GetPlayListResponse> getTedPlayList(
            @Field("access_token") String access_token,
            @Field("page") String page
    );


    @FormUrlEncoded
    @POST(TedConstants.API_POST_TED_POD_CAST)
    Single<GetPodCastsResponse> getTedPodCast(
            @Field("access_token") String access_token,
            @Field("page") String page
    );

    @FormUrlEncoded
    @POST(TedConstants.API_POST_TED_SEARCH)
    Single<GetSearchTedResponse> getTedSearch(
            @Field("access_token") String access_token,
            @Field("page") String page
    );

}
