package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class Date {

    private String readable;
    private String timestamp;

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Date(String readable, String timestamp) {

        this.readable = readable;
        this.timestamp = timestamp;
    }

    public Date() {

    }
}
