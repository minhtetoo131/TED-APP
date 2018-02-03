package com.minhtetoo.tedapp.data.model;




import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.minhtetoo.tedapp.data.db.AppDatabase;
import com.minhtetoo.tedapp.data.vo.ResultVO;
import com.minhtetoo.tedapp.data.vo.TedPlayListVO;
import com.minhtetoo.tedapp.data.vo.TedPodCastVO;
import com.minhtetoo.tedapp.data.vo.TedTalkVO;
import com.minhtetoo.tedapp.network.api.TedApi;
import com.minhtetoo.tedapp.network.responses.GetPlayListResponse;
import com.minhtetoo.tedapp.network.responses.GetPodCastsResponse;
import com.minhtetoo.tedapp.network.responses.GetSearchTedResponse;
import com.minhtetoo.tedapp.network.responses.GetTedTalksResponse;
import com.minhtetoo.tedapp.utils.TedConstants;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by min on 1/25/2018.
 */

public class ViewModel extends android.arch.lifecycle.ViewModel {


    private AppDatabase mAppDatabase;
    private TedApi theApi;


    public ViewModel() {
        initTedApi();
    }

    public void loadTedTalkList() {
        theApi.getTedTalkList(TedConstants.ACCESS_TOKEN,TedConstants.PAGE)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetTedTalksResponse>() {
                    @Override
                    public void accept(GetTedTalksResponse talksResponse) throws Exception {
                        mAppDatabase.tedTalksDao().deleteTedTalk();
                        long[] insertedIds = mAppDatabase.tedTalksDao().insertTedTalks(talksResponse.getTalksList().toArray(new TedTalkVO[0]));
                    }
                });
    }

    public void loadTedPlayList() {
        theApi.getTedPlayList(TedConstants.ACCESS_TOKEN,TedConstants.PAGE)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//
                .subscribe(new Consumer<GetPlayListResponse>() {
                    @Override
                    public void accept(GetPlayListResponse playlistResponse) throws Exception {
                        mAppDatabase.tedTalksDao().deleteTedPlaylist();
                        long[] insertedIds = mAppDatabase.tedTalksDao().insertTedPlayList(playlistResponse.getTedPlayListVOList().toArray(new TedPlayListVO[0]));
                    }
                });
    }

    public void loadTedPodCast() {
        theApi.getTedPodCast(TedConstants.ACCESS_TOKEN,TedConstants.PAGE)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//
                .subscribe(new Consumer<GetPodCastsResponse>() {
                    @Override
                    public void accept(GetPodCastsResponse tedPodCastsResponse) throws Exception {
                        mAppDatabase.tedTalksDao().deleteTedPodCast();
                        long[] insertedIds = mAppDatabase.tedTalksDao().insertTedPodCast(tedPodCastsResponse.getTedPodCastVOList().toArray(new TedPodCastVO[0]));

                    }
                });
    }

    public void loadTedSearch() {
        theApi.getTedSearch(TedConstants.ACCESS_TOKEN,TedConstants.PAGE)
                .subscribeOn(Schedulers.io())//observer ka koe srr pyu ml data ko create lot py ml method yl thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetSearchTedResponse>() {
                    @Override
                    public void accept(GetSearchTedResponse searchResponse) throws Exception {
                        mAppDatabase.tedTalksDao().deleteTedSearch();
                        long[] insertedIds = mAppDatabase.tedTalksDao().insertTedSearch(searchResponse.getResultVOList().toArray(new ResultVO[0]));
                    }
                });
    }

    private void initTedApi() {

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TedConstants.TED_TALK_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        theApi = retrofit.create(TedApi.class);

    }

    public void initDatabase(Context context) {
        mAppDatabase = AppDatabase.getInMemoryDatabase(context);
    }

    public LiveData<List<TedTalkVO>> getTedTalks() {
        return mAppDatabase.tedTalksDao().getAllTedTalks();
    }

    public LiveData<List<TedPlayListVO>> getTedPlayList() {
        return mAppDatabase.tedTalksDao().getAllTedPlayList();
    }

    public LiveData<List<TedPodCastVO>> getTedPodCast() {
        return mAppDatabase.tedTalksDao().getAllTedPodCast();
    }

    public TedTalkVO getTedTalkByID(long tedTalkId) {
        return mAppDatabase.tedTalksDao().getTedTalksById(tedTalkId);
    }

    public TedPlayListVO getTedPlayListByID(long tedPlayListId) {
        return mAppDatabase.tedTalksDao().getTedPlayListById(tedPlayListId);
    }

    public TedPodCastVO getTedPodCastByID(long tedPodCastId) {
        return mAppDatabase.tedTalksDao().getTedPodCastById(tedPodCastId);
    }

    public LiveData<List<ResultVO>> getSearchDataByValue(String searchValue, String resultType)
    {
        return mAppDatabase.tedTalksDao().getSearchDataByValue(searchValue,resultType);
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        AppDatabase.destroyInstance();
    }

}