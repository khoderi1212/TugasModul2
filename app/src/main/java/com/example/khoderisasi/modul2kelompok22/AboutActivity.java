package com.example.khoderisasi.modul2kelompok22;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public void onBackPressed() {
        back();
    }

    private void back() {
        Intent reg = new Intent(this, MainActivity.class);
        startActivity(reg);
        finish();
    }
}
