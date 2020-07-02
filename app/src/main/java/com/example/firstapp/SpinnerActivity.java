package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {

    String name[] = {"Guntur","Angkasa","Putra"};
    Spinner spinnerNama;
    TextView textShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initValue();
        spinner();
    }

    private void initValue() {
        spinnerNama = findViewById(R.id.spinner_nama);
        textShow = findViewById(R.id.textShow);
    }
    private void spinner() {
        ArrayAdapter adapter = new ArrayAdapter(SpinnerActivity.this,android.R.layout.simple_spinner_item,name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNama.setAdapter(adapter);

        spinnerNama.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textShow.setText(name[position].toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
