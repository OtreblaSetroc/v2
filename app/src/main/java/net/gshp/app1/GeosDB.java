package net.gshp.app1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GeosDB extends SQLiteOpenHelper {
    String sql="Create table geos(idGeos INTEGER PRIMARY KEY  AUTOINCREMENT NOT NULL, latitud double, longitud double,time double)";

    public GeosDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("Drop table IF exists geos");
        sqLiteDatabase.execSQL(sql);

    }
}
