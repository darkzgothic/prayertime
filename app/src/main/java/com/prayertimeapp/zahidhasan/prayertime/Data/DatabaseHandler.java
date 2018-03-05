package com.prayertimeapp.zahidhasan.prayertime.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.prayertimeapp.zahidhasan.prayertime.Model.Hadith;

import java.util.ArrayList;

/**
 * Created by DarkzGothic on 8/18/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private final ArrayList<Hadith> hadiths = new ArrayList<>();

    public DatabaseHandler(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_HADITH_TABLE = "CREATE TABLE " + Constants.TABLE_NAME + "("
                + Constants.KEY_ID + " INTEGER PRIMARY KEY, "
                + Constants.IN_BANGLA + " TEXT, "
                + Constants.IN_ENGLISH + " TEXT, "
                + Constants.IN_ARABIC + " TEXT);";

        db.execSQL(CREATE_HADITH_TABLE);

        Log.e("myLog1", "Database Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Constants.TABLE_NAME);

        Log.e("myLog2", "Database Upgraded");
    }

    public void addHadith(Hadith hadith){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Constants.IN_BANGLA, hadith.getInBangla());
        values.put(Constants.IN_ENGLISH, hadith.getInEnglish());
        values.put(Constants.IN_ARABIC, hadith.getInArabic());

        db.insert(Constants.TABLE_NAME, null, values);
        db.close();
        Log.e("myLog3", "Added");
    }
}
