package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    private EditText email, fullName, password;
    public void onClick(View view){
        email = findViewById(R.id.editTextEmail);
        fullName = findViewById(R.id.editTextName);
        password = findViewById(R.id.editTextPassword);
        if(!Data.checkUser(email.getText().toString())) {
            Users user = new Users(fullName.getText().toString(), email.getText().toString(), password.getText().toString());
            Data.addUser(user);
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Log.v("Data",Data.toStringData());
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "User already exists...", Toast.LENGTH_SHORT).show();
        }
    }
}