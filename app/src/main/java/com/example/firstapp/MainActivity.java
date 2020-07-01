package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtHello;
    Button btnClick;
    TextView valueTur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHello = findViewById(R.id.edt_hello);
        btnClick = findViewById(R.id.btn_click);
        valueTur = findViewById(R.id.valueTur);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getValueEditText = edtHello.getText().toString();
                valueTur.setText(getValueEditText);
                Toast.makeText(MainActivity.this, "Nilainya Adalah "+getValueEditText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
