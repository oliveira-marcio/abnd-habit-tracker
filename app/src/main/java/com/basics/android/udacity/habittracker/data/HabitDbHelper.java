package com.basics.android.udacity.habittracker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.basics.android.udacity.habittracker.data.HabitContract.HabitEntry;

import java.util.Date;

public class HabitDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "habits.db";
    private static final int DATABASE_VERSION = 1;

    public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_HABITS_TABLE =  "CREATE TABLE " + HabitEntry.TABLE_NAME + " ("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.COLUMN_HABIT_NAME + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_HABIT_TYPE + " INTEGER NOT NULL, "
                + HabitEntry.COLUMN_HABIT_DATE_START + " INTEGER NOT NULL, "
                + HabitEntry.COLUMN_HABIT_DATE_END + " INTEGER NOT NULL, "
                + HabitEntry.COLUMN_HABIT_NOTES + " TEXT);";

        db.execSQL(SQL_CREATE_HABITS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

    public long insertHabit(String name, int type, Date date_start, Date date_end, String notes){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_HABIT_NAME, name);
        values.put(HabitEntry.COLUMN_HABIT_TYPE, type);
        values.put(HabitEntry.COLUMN_HABIT_DATE_START, date_start.getTime());
        values.put(HabitEntry.COLUMN_HABIT_DATE_END, date_end.getTime());
        values.put(HabitEntry.COLUMN_HABIT_NOTES, notes);

        return db.insert(HabitEntry.TABLE_NAME, null, values);
    }

    public Cursor readHabitById(int id){
        SQLiteDatabase db = getReadableDatabase();

        String[] projection = {
                HabitEntry.COLUMN_HABIT_NAME,
                HabitEntry.COLUMN_HABIT_TYPE,
                HabitEntry.COLUMN_HABIT_DATE_START,
                HabitEntry.COLUMN_HABIT_DATE_END,
                HabitEntry.COLUMN_HABIT_NOTES };

        String selection = HabitEntry._ID + " == ?";
        String[] selectionArgs = { "" + id };

        return db.query(HabitEntry.TABLE_NAME, projection, selection, selectionArgs, null, null, null);
    }
}