package com.codecollection.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codecollection.toaster.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleToast.showMsg(this, "Please visit to CodeCollection");
    }
}