package com.example.wojtek.nauka_pa;

/**
 * Created by Wojtek on 05.01.2018.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class bazadanych  extends SQLiteOpenHelper{

    public bazadanych(Context context){

        super(context, "Quiz.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(
                "create table Pytania(" +
                "nr integer primary key autoincrement," +
                "Pytanie text," +
                "Odp_A text," +
                "Odp_B text," +
                "Odp_C text," +
                "Odp_D text," +
                "Poprawna text," +
                "Poprawna2 text," +
                "Poprawna3 text,"+
                "Liczba_Poprawnych int);"+
                "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    public void dodajPytanie(Pytanie pytanie){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues wartosci = new ContentValues();
        wartosci.put("Pytanie",pytanie.getPytanie());
        wartosci.put("Odp_A",pytanie.getOdp_A());
        wartosci.put("Odp_B",pytanie.getOdp_B());
        wartosci.put("Odp_C",pytanie.getOdp_C());
        wartosci.put("Odp_D",pytanie.getOdp_D());
        wartosci.put("Poprawna",pytanie.getPoprawna());
        wartosci.put("Poprawna2",pytanie.getPoprawna2());
        wartosci.put("Poprawna3",pytanie.getPoprawna3());
        wartosci.put("Liczba_Poprawnych",pytanie.getLiczba_poprawnych());
        db.insertOrThrow("pytania",null,wartosci);
    }

    public Cursor wszystkie(){
        String[] kolumny={"nr","Pytanie","Odp_A","Odp_B","Odp_C","Odp_D","Poprawna","Poprawna2","Poprawna3","Liczba_Poprawnych"};
        SQLiteDatabase db = getReadableDatabase();
        Cursor kursor = db.query("Pytania",kolumny,null,null,null,null,null);
        return kursor;
        }

    public void czyscbaze(){
        SQLiteDatabase db = getWritableDatabase();
        db.delete("Pytania",null,null);
    }
}

