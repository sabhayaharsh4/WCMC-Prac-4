package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSignUp(View view){
        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }

    public void onLogin(View view){
        startActivity(new Intent(getApplicationContext(), Login.class));
    }
}