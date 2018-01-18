package com.example.wojtek.nauka_pa;

import android.annotation.TargetApi;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class PytaniaActivity extends AppCompatActivity {
    static int id;
    static int liczba_wylosowanych_pytan=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView pyt1 = findViewById(R.id.pyt1);
        final CheckBox OdpA = findViewById(R.id.OdpA);
        final CheckBox OdpB = findViewById(R.id.OdpB);
        final CheckBox OdpC = findViewById(R.id.OdpC);
        final CheckBox OdpD = findViewById(R.id.OdpD);
        final CheckBox[] listacheckboxow={OdpA,OdpB,OdpC,OdpD};
        Button nextbtn = findViewById(R.id.nextbtn);
        Button menubtn = findViewById(R.id.menubtn);

        pytaniawbazie pytania = new pytaniawbazie();
        final bazadanych baza = new bazadanych(this);
        Cursor c =baza.wszystkie();
       
        if(c.getCount()==0) {
            baza.czyscbaze();
            pytania.kreacja(baza);
        }
        else{
            c.moveToLast();
            if(c.getInt(0)!=zmienneglobalne.LICZBA_PYTAN-1) {
                baza.czyscbaze();
                pytania.kreacja(baza);
            }

        }
        final Cursor k =baza.wszystkie();
        ustawpytanie(k,pyt1,OdpA,OdpB,OdpC,OdpD);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zliczpunkty(k,listacheckboxow);

                if (liczba_wylosowanych_pytan<zmienneglobalne.LICZBA_PYTAN_QUIZ) {
                    ustawpytanie(k,pyt1,OdpA,OdpB,OdpC,OdpD);
                }
                else{
                    liczba_wylosowanych_pytan=0;
                    for(int j=0;j<zmienneglobalne.LICZBA_PYTAN_QUIZ;j++){
                        zmienneglobalne.wylosowane[j]=0;
                    }
                    baza.close();
                    Intent Podsumowanie = new Intent(getApplicationContext(), com.example.wojtek.nauka_pa.FinishActivity.class);
                    startActivity(Podsumowanie);
                    finish();
                }
                }
            });

        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Start = new Intent(getApplicationContext(), com.example.wojtek.nauka_pa.MainActivity.class);
                liczba_wylosowanych_pytan=0;
                zmienneglobalne.punkty=0;
                startActivity(Start);
                finish();

            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent Start = new Intent(getApplicationContext(), com.example.wojtek.nauka_pa.MainActivity.class);
            liczba_wylosowanych_pytan=0;
            zmienneglobalne.punkty=0;
            startActivity(Start);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
    public void ustawpytanie(Cursor k,TextView pyt1,CheckBox OdpA, CheckBox OdpB,CheckBox OdpC,CheckBox OdpD){
        int flaga;
        do {
            flaga=0;
            Random generator = new Random();
            id = generator.nextInt(zmienneglobalne.LICZBA_PYTAN);
            if(id!=0) {
                for (int i = 0; i < zmienneglobalne.wylosowane.length; i++) {
                    if (zmienneglobalne.wylosowane[i] == id) {
                        flaga++;
                    }
                }
            }
            else{
                id=-1;
                for (int i = 0; i < zmienneglobalne.wylosowane.length; i++) {
                    if (zmienneglobalne.wylosowane[i] == id) {
                        flaga++;
                    }
                }
            }
        }
        while(flaga!=0);


        zmienneglobalne.wylosowane[liczba_wylosowanych_pytan] = id;
        liczba_wylosowanych_pytan++;
        if(id==-1){
            id=0;
        }
        k.moveToPosition(id);

        String pytanie = k.getString(1);
        pyt1.setText(pytanie);

        OdpA.setChecked(false);
        String A = k.getString(2);
        OdpA.setText(A);

        OdpB.setChecked(false);
        String B = k.getString(3);
        OdpB.setText(B);

        OdpC.setChecked(false);
        String C = k.getString(4);
        OdpC.setText(C);

        OdpD.setChecked(false);
        String D = k.getString(5);
        OdpD.setText(D);

        zmienneglobalne.max_liczba_punktow+=k.getInt(9);



    }
    @TargetApi(21)
    public void zliczpunkty(Cursor k,CheckBox[] lista){

        k.moveToPosition(id);
        for(int j=0;j<4;j++){
            if(lista[j].isChecked()) {
                if(lista[j].getTransitionName().equals(k.getString(6))||lista[j].getTransitionName().equals(k.getString(7))||lista[j].getTransitionName().equals(k.getString(8))){

                    zmienneglobalne.punkty++;
                }
                else{
                    zmienneglobalne.punkty--;
                }

            }
        }
    }
}

