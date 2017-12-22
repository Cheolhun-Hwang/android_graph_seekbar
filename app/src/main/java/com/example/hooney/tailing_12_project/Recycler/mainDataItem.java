package com.example.hooney.tailing_12_project.Recycler;

/**
 * Created by hooney on 2017. 12. 8..
 */

public class mainDataItem {
    private String ImageUrl;
    private String Context;
    private String SendMag;

    public mainDataItem() {
        ImageUrl = "";
        Context = "";
        SendMag = "";
    }

    public mainDataItem(String imageUrl, String context, String sendMag) {
        ImageUrl = imageUrl;
        Context = context;
        SendMag = sendMag;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    public String getSendMag() {
        return SendMag;
    }

    public void setSendMag(String sendMag) {
        SendMag = sendMag;
    }
}
