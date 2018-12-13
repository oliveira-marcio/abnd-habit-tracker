package com.basics.android.udacity.habittracker.data;

import android.provider.BaseColumns;

public final class HabitContract {

    private HabitContract(){}

    public static final class HabitEntry implements BaseColumns {

        public static final String TABLE_NAME = "habits";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_HABIT_NAME = "name";
        public static final String COLUMN_HABIT_TYPE = "type";
        public static final String COLUMN_HABIT_DATE_START = "date_start";
        public static final String COLUMN_HABIT_DATE_END = "date_end";
        public static final String COLUMN_HABIT_NOTES = "notes";

        public static final int TYPE_EDUCATION = 0;
        public static final int TYPE_SOCIAL = 1;
        public static final int TYPE_HEALTH = 2;
        public static final int TYPE_ALIMENTATION = 3;
        public static final int TYPE_PERSONAL = 4;
        public static final int TYPE_HOBBIE = 5;
        public static final int TYPE_PROFESSIONAL = 6;
        public static final int TYPE_FAMILY = 7;
    }
}