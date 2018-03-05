package com.prayertimeapp.zahidhasan.prayertime.Common;

import android.support.annotation.NonNull;

/**
 * Created by DarkzGothic on 8/16/2017.
 */

public class Common {

    public static String API_LINK = "http://api.aladhan.com/timings/1502898252?latitude=23.811062&longitude=90.397751&timezonestring=Asia/Dhaka&method=1";

    @NonNull
    public static String apiRequest(){
        StringBuilder sb = new StringBuilder(API_LINK);

        return sb.toString();
    }
}
