package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    @SerializedName("url")
    String url = null;

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }


}
