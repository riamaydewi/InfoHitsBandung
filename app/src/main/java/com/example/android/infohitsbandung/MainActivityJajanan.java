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

public class MainActivityJajanan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_jajanan);

        LinearLayout btn_seblak = (LinearLayout) findViewById(R.id.seblak);
        btn_seblak.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityJajanan.this, MainActivitySeblak.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_batagor = (LinearLayout) findViewById(R.id.batagor);
        btn_batagor.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityJajanan.this, MainActivityBatagor.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_surabi = (LinearLayout) findViewById(R.id.surabi);
        btn_surabi.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityJajanan.this, MainActivitySurabi.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_cilok = (LinearLayout) findViewById(R.id.cilok);
        btn_cilok.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityJajanan.this, MainActivityCilok.class);
                startActivityForResult(i, 0);
            }
        });

        LinearLayout btn_tahu = (LinearLayout) findViewById(R.id.tahu);
        btn_tahu.setOnClickListener(new LinearLayout.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(MainActivityJajanan.this, MainActivityTahu.class);
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
