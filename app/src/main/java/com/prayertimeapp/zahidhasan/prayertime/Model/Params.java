package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class Params {

    private int Fajr;
    private int Isha;

    public int getFajr() {
        return Fajr;
    }

    public void setFajr(int fajr) {
        Fajr = fajr;
    }

    public int getIsha() {
        return Isha;
    }

    public void setIsha(int isha) {
        Isha = isha;
    }

    public Params(int fajr, int isha) {

        Fajr = fajr;
        Isha = isha;
    }

    public Params() {

    }
}
