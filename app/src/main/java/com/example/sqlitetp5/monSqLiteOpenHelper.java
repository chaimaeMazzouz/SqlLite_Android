package com.example.sqlitetp5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class monSqLiteOpenHelper extends SQLiteOpenHelper {
    private final String dbName="data.db";
    private final int version=1;

    public monSqLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String req="create table produit(code integer primary key autoincrement," + "description text,prix real);"; db.execSQL(req);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists produit"); onCreate(db);
    }
}
