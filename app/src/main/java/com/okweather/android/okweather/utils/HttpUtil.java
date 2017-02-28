package com.okweather.android.okweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hlk on 2017/3/1.
 */

public class HttpUtil {

    public static void sendOKHttpRequest(String address ,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
