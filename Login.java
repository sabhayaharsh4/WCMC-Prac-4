package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void onClick(View view){
        EditText userEmail, userPassword;
        userEmail = findViewById(R.id.editTextEmail2);
        userPassword = findViewById(R.id.editTextPassword2);
        Log.v("Data",Data.toStringData());
        if(Data.checkUserCredentials(userEmail.getText().toString(), userPassword.getText().toString())){
            startActivity(new Intent(getApplicationContext(), Welcome.class));
        }else{
            Toast.makeText(getApplicationContext(), "User does not exist...", Toast.LENGTH_SHORT).show();
        }
    }
}