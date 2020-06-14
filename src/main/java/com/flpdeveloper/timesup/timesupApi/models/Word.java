package com.flpdeveloper.timesup.timesupApi.models;

import com.flpdeveloper.timesup.timesupApi.utils.JSONUtils;

import java.util.UUID;

public class Word {
    private String uuid = UUID.randomUUID().toString().replace("-", "");
    private String word;

    public static Word parse(String json) {
        return JSONUtils.jsonToClass(json, Word.class);
    }
}
