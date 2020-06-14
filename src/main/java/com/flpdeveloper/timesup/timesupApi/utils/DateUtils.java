package com.flpdeveloper.timesup.timesupApi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {

    public static Date dateFromString(String dateStr, String format) {
        SimpleDateFormat spf = new SimpleDateFormat(format);
        try {
            return spf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static java.sql.Date getSQLDate(java.util.Date javaDate) {
        return new java.sql.Date(javaDate.getTime());
    }

    public static java.util.Date getSQLDate(java.sql.Date sqlDate) {
        return new java.util.Date(sqlDate.getTime());
    }

}
