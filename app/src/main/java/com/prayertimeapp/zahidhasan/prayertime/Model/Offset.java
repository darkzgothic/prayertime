package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class Offset {

    private int Imsak;
    private int Fajr;
    private int Sunrise;
    private int Dhuhr;
    private int Asr;
    private int Maghrib;
    private int Sunset;
    private int Isha;
    private int Midnight;

    public int getImsak() {
        return Imsak;
    }

    public void setImsak(int imsak) {
        Imsak = imsak;
    }

    public int getFajr() {
        return Fajr;
    }

    public void setFajr(int fajr) {
        Fajr = fajr;
    }

    public int getSunrise() {
        return Sunrise;
    }

    public void setSunrise(int sunrise) {
        Sunrise = sunrise;
    }

    public int getDhuhr() {
        return Dhuhr;
    }

    public void setDhuhr(int dhuhr) {
        Dhuhr = dhuhr;
    }

    public int getAsr() {
        return Asr;
    }

    public void setAsr(int asr) {
        Asr = asr;
    }

    public int getMaghrib() {
        return Maghrib;
    }

    public void setMaghrib(int maghrib) {
        Maghrib = maghrib;
    }

    public int getSunset() {
        return Sunset;
    }

    public void setSunset(int sunset) {
        Sunset = sunset;
    }

    public int getIsha() {
        return Isha;
    }

    public void setIsha(int isha) {
        Isha = isha;
    }

    public int getMidnight() {
        return Midnight;
    }

    public void setMidnight(int midnight) {
        Midnight = midnight;
    }

    public Offset(int imsak, int fajr, int sunrise, int dhuhr, int asr, int maghrib, int sunset, int isha, int midnight) {
        Imsak = imsak;
        Fajr = fajr;
        Sunrise = sunrise;
        Dhuhr = dhuhr;
        Asr = asr;
        Maghrib = maghrib;
        Sunset = sunset;
        Isha = isha;
        Midnight = midnight;
    }

    public Offset() {

    }
}
