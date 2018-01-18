package com.example.wojtek.nauka_pa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView wykrzyknik= findViewById(R.id.wykrzykniktextView);
        TextView punktacjatextView = findViewById(R.id.punktacjatextView);
        TextView komentarz = findViewById(R.id.komentarztextView);
        String pkty = Integer.toString(zmienneglobalne.punkty);
        punktacjatextView.setText(pkty+"/"+Integer.toString(zmienneglobalne.max_liczba_punktow));
        if(zmienneglobalne.punkty<Math.round(zmienneglobalne.max_liczba_punktow/2.0)){
            wykrzyknik.setText("Nie za dobrze!");
            wykrzyknik.setTextColor(Color.RED);
            komentarz.setText("Musisz jeszcze powkuwać");
        }
        zmienneglobalne.punkty=0;
        zmienneglobalne.max_liczba_punktow=0;

        Button endbtn = findViewById(R.id.endbtn);
        endbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Start = new Intent(getApplicationContext(), com.example.wojtek.nauka_pa.MainActivity.class);
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
            startActivity(Start);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
