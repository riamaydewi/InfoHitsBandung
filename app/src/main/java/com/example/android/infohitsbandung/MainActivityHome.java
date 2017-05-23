package com.example.android.infohitsbandung;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
    }


    public void Wisata(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityWisata.class);
        startActivity(i);
    }

    public void Jajanan(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityJajanan.class);
        startActivity(i);
    }

    public void Belanja(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityBelanja.class);
        startActivity(i);
    }

    public void Oleh2(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivityOleh2.class);
        startActivity(i);
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
