package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class PrayerDetails {

    private int code;
    private String status;
    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public PrayerDetails(int code, String status, Data data) {

        this.code = code;
        this.status = status;
        this.data = data;
    }

    public PrayerDetails() {

    }
}
