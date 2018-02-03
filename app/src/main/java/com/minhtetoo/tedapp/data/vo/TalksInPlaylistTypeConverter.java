package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;


public class TalksInPlaylistTypeConverter {

    @TypeConverter
    public String listToString(List<TalksInPlaylistVO> tags) {
        Gson gson = new Gson();
        return gson.toJson(tags);
    }

    @TypeConverter
    public List<TalksInPlaylistVO> stringToList(String tagStr )  {

        return new Gson().fromJson(tagStr, new TypeToken<List<TalksInPlaylistVO>>(){}.getType());

    }
}
