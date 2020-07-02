package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Validasi2Activity extends AppCompatActivity {

    EditText edtName,edtAlamat,edtKelamin;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi2);

        edtName = findViewById(R.id.edt_nama);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtKelamin = findViewById(R.id.edt_kelamin);
        btnSimpan = findViewById(R.id.btn_simpan);
        validasi();
    }

    private void validasi() {
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtName.getText().toString().isEmpty() || edtAlamat.getText().toString().isEmpty() || edtKelamin.getText().toString().isEmpty()){
                    Toast.makeText(Validasi2Activity.this, "Fild Harus Diisi Semua !", Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = edtName.getText().toString();
                    String alamat = edtAlamat.getText().toString();
                    String kelamin = edtKelamin.getText().toString();
                    Toast.makeText(Validasi2Activity.this, "Hallo "+name+" Alamt mu di "+" ber Kelamin "+kelamin, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
