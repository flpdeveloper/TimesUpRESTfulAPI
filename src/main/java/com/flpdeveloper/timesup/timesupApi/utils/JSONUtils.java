package com.flpdeveloper.timesup.timesupApi.utils;

import com.google.gson.Gson;

public abstract class JSONUtils {

     public static <T> T jsonToClass(String json, Class<T> clase) {
         return clase.cast(new Gson().fromJson(json, clase));
     }

     public static String classToJson(IParseable iParseable) {
         return new Gson().toJson(iParseable);
     }
}
