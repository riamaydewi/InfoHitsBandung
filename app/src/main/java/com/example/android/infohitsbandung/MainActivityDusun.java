package com.example.android.infohitsbandung;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ria May Dewi on 5/18/2017.
 */

public class MainActivityDusun extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dusun);
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
