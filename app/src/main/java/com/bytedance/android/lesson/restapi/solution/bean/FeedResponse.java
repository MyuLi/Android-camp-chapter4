package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    @SerializedName("feeds")
    private  Feed feeds[] ;
    @SerializedName("success")
    private String success = "";

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Feed[] getFeeds() {
            return feeds;
    }

    public void setFeeds(Feed[] feeds)
        {
            for(int i = 0; i < feeds.length;i++)
            {
                this.feeds[i] = feeds[i];
            }
    }

}
