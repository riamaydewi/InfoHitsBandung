package com.example.android.infohitsbandung;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Ria May Dewi on 5/16/2017.
 */

public class MainActivityWisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wisata);

        LinearLayout btn_masjid = (LinearLayout) findViewById(R.id.masjid);
        btn_masjid.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityWisata.this, MainActivityMasjid.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_kawah = (LinearLayout) findViewById(R.id.kawah);
        btn_kawah.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityWisata.this, MainActivityKawah.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_tangkuban = (LinearLayout) findViewById(R.id.tangkuban);
        btn_tangkuban.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityWisata.this, MainActivityTangkuban.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_dusun = (LinearLayout) findViewById(R.id.dusun);
        btn_dusun.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityWisata.this, MainActivityDusun.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_deranch = (LinearLayout) findViewById(R.id.deranch);
        btn_deranch.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityWisata.this, MainActivityDeranch.class);
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
