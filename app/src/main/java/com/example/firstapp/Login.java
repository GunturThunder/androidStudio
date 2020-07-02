package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText inputEmail,inputPassword;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initValue();
        login();

    }

    private void initValue() {
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);
        btnSimpan = findViewById(R.id.btn_simpan);
    }

    private void login() {
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email =  inputEmail.getText().toString();
                String password = inputPassword.getText().toString();

                if(email.isEmpty()){
                    inputEmail.setError("Data tidak boleh kosong");
                }
                else if(password.isEmpty()){
                    inputPassword.setError("Data tidak boleh kosong");
                }
                else{
                    if(email.equals("Guntur")&&password.equals("12345")){
                        Toast.makeText(Login.this, "Berhasi Login", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(Login.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}
