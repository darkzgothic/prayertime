package com.prayertimeapp.zahidhasan.prayertime;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.prayertimeapp.zahidhasan.prayertime.Common.Common;
import com.prayertimeapp.zahidhasan.prayertime.Data.DatabaseHandler;
import com.prayertimeapp.zahidhasan.prayertime.Helper.Helper;
import com.prayertimeapp.zahidhasan.prayertime.Model.Hadith;
import com.prayertimeapp.zahidhasan.prayertime.Model.PrayerDetails;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    PrayerDetails prayerDetails = new PrayerDetails();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Long tsLong = System.currentTimeMillis()/1000;
        //String ts = tsLong.toString();

        Hadith hadith = new Hadith(1, "Anto", "Anto", "Anto");

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addHadith(hadith);

//        new GetPrayerDetails().execute(Common.apiRequest());
    }

    private class GetPrayerDetails extends AsyncTask<String, Void, String>{
        ProgressDialog pd = new ProgressDialog(MainActivity.this);

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd.setTitle("Please wait...");
            pd.show();

        }

        @Override
        protected String doInBackground(String... params) {
            String stream = null;
            String urlString = params[0];

            Helper http = new Helper();
            stream = http.getHTTPData(urlString);
            return stream;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (s.contains("Not Found")){
                pd.dismiss();
                return;
            }
            Gson gson = new Gson();
            Type type = new TypeToken<PrayerDetails>(){}.getType();

            prayerDetails = gson.fromJson(s, type);
            pd.dismiss();

            String status = String.format("%s", prayerDetails.getData().getTimings().getMidnight());

            Log.e("apiReqStatus", status);
        }
    }
}
