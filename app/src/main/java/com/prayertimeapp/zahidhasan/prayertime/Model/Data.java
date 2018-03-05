package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class Data {

    private Timings timings;
    private Date date;
    private Meta meta;

    public Timings getTimings() {
        return timings;
    }

    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Data(Timings timings, Date date, Meta meta) {

        this.timings = timings;
        this.date = date;
        this.meta = meta;
    }

    public Data() {

    }
}
