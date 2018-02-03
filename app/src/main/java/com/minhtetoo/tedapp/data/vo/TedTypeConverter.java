package com.minhtetoo.tedapp.data.vo;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;



public class TedTypeConverter {

    @TypeConverter
    public String listToString(List<TagVO> tags) {
        Gson gson = new Gson();
        return gson.toJson(tags);
    }

    @TypeConverter
    public List<TagVO> stringToList(String tagStr )  {

        return new Gson().fromJson(tagStr, new TypeToken<List<TagVO>>(){}.getType());

    }

}
