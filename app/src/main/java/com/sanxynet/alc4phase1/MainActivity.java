package com.sanxynet.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AboutAlc(View view) {
        Intent aboutAlc = new Intent(MainActivity.this, AboutAlcActivity.class);
        startActivity(aboutAlc);
    }

    public void MyProfile(View view) {
        Intent aboutAlc = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(aboutAlc);
    }
}
