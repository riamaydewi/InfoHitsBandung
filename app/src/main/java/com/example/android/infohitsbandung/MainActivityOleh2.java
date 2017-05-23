package com.example.android.infohitsbandung;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Ria May Dewi on 5/17/2017.
 */

public class MainActivityOleh2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oleh2);

        LinearLayout btn_bolen = (LinearLayout) findViewById(R.id.bolen);
        btn_bolen.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityOleh2.this, MainActivityBolen.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_gepuk = (LinearLayout) findViewById(R.id.gepuk);
        btn_gepuk.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityOleh2.this, MainActivityGepuk.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_borondong = (LinearLayout) findViewById(R.id.borondong);
        btn_borondong.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityOleh2.this, MainActivityBorondong.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_peuyeum = (LinearLayout) findViewById(R.id.peuyeum);
        btn_peuyeum.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityOleh2.this, MainActivityPeuyeum.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_cilembu = (LinearLayout) findViewById(R.id.cilembu);
        btn_cilembu.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityOleh2.this, MainActivityCilembu.class);
                startActivityForResult(i, 0);
            }
        });
    }

    public void Home(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityHome.class);
        startActivity(i);
    }

    public void Info(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityInfo.class);
        startActivity(i);
    }

    public void Exit(View view) {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit this application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}
