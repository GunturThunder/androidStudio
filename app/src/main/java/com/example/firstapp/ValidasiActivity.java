package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ValidasiActivity extends AppCompatActivity {

    EditText edtNama,edtKelamin,edtAlamat;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi);

        edtNama = findViewById(R.id.edt_nama);
        edtKelamin = findViewById(R.id.edt_kelamin);
        edtAlamat = findViewById(R.id.edt_alamat);
        btnSimpan = findViewById(R.id.btn_simpan);

        validasi();


    }

    private void validasi() {
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNama.getText().toString().isEmpty()||edtAlamat.getText().toString().isEmpty()||edtKelamin.getText().toString().isEmpty()) {
                    Toast.makeText(ValidasiActivity.this, "Filed Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
                else{
                    String nama = edtNama.getText().toString();
                    String kelamin = edtKelamin.getText().toString();
                    String alamat = edtAlamat.getText().toString();
                    Toast.makeText(ValidasiActivity.this, "Nama "+nama+" Alamat "+kelamin+" Kelamin "+alamat, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
