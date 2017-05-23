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

public class MainActivityBelanja extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_belanja);

        LinearLayout btn_baru = (LinearLayout) findViewById(R.id.baru);
        btn_baru.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityBelanja.this, MainActivityPasarBaru.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_cibaduyut = (LinearLayout) findViewById(R.id.cibaduyut);
        btn_cibaduyut.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityBelanja.this, MainActivityCibaduyut.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_gedebage = (LinearLayout) findViewById(R.id.gedebage);
        btn_gedebage.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityBelanja.this, MainActivityGedebage.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_cihampelas = (LinearLayout) findViewById(R.id.cihampelas);
        btn_cihampelas.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityBelanja.this, MainActivityCihampelas.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_dago = (LinearLayout) findViewById(R.id.dago);
        btn_dago.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityBelanja.this, MainActivityDago.class);
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
