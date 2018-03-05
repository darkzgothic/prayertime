package com.prayertimeapp.zahidhasan.prayertime.Model;

/**
 * Created by DarkzGothic on 8/18/2017.
 */

public class Hadith {

    private int id;
    private String inBangla;
    private String inEnglish;
    private String inArabic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInBangla() {
        return inBangla;
    }

    public void setInBangla(String inBangla) {
        this.inBangla = inBangla;
    }

    public String getInEnglish() {
        return inEnglish;
    }

    public void setInEnglish(String inEnglish) {
        this.inEnglish = inEnglish;
    }

    public String getInArabic() {
        return inArabic;
    }

    public void setInArabic(String inArabic) {
        this.inArabic = inArabic;
    }

    public Hadith(int id, String inBangla, String inEnglish, String inArabic) {

        this.id = id;
        this.inBangla = inBangla;
        this.inEnglish = inEnglish;
        this.inArabic = inArabic;
    }

    public Hadith() {

    }
}
