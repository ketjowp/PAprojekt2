package com.example.wojtek.nauka_pa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondbtn = findViewById(R.id.secondbtn);
        secondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Start = new Intent(getApplicationContext(), com.example.wojtek.nauka_pa.PytaniaActivity.class);

                startActivity(Start);


            }
        });

        Button strona = findViewById(R.id.strona);
        strona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strona = "http://www.wemif.net/pa";
                Uri adreswww = Uri.parse(strona);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, adreswww);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });

    }
}
