package com.udacity.firebase.shoppinglistplusplus.utils;

import android.content.Context;

import com.udacity.firebase.shoppinglistplusplus.BuildConfig;

import java.text.SimpleDateFormat;

/**
 * Utility class
 */
public class Utils {
    /**
     * Format the timestamp with SimpleDateFormat
     */
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private Context mContext = null;
    public static final String FIREBASE_URL = BuildConfig.UNIQUE_FIREBASE_ROOT_URL;


    /**
     * Public constructor that takes mContext for later use
     */
    public Utils(Context con) {
        mContext = con;
    }

}
