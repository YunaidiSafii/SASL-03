package com.example.sasl_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tambah, kurang, kali, bagi;
    EditText pertama, kedua;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        pertama = findViewById(R.id.pertama);
        kedua = findViewById(R.id.kedua);
        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pertama.getText().toString().equals("") || kedua.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Harap Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf((Integer.parseInt(pertama.getText().toString())) + (Integer.parseInt(kedua.getText().toString()))));
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pertama.getText().toString().equals("") || kedua.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Harap Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf((Integer.parseInt(pertama.getText().toString())) - (Integer.parseInt(kedua.getText().toString()))));
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pertama.getText().toString().equals("") || kedua.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Harap Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf((Integer.parseInt(pertama.getText().toString())) * (Integer.parseInt(kedua.getText().toString()))));
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pertama.getText().toString().equals("") || kedua.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Harap Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else if (kedua.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "Angka Tidak Bisa DiBagi Nol", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf((Double.parseDouble(pertama.getText().toString())) / (Double.parseDouble(kedua.getText().toString()))));
                }
            }
        });
    }
}