package com.okweather.android.okweather.utils;

/**
 * Created by hlk on 2017/3/1.
 */

import android.text.TextUtils;

import com.okweather.android.okweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * JSON数据解析工具
 */
public class Utilty {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvindeResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray provinceAll = new JSONArray(response);
                for (int i = 0; i < provinceAll.length(); i++) {
                    JSONObject provinceObject = provinceAll.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handlecityResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++) {
                    
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


}
