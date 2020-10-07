package com.example.intentwpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;

import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvNama, tvInstitusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama : ");
        }
        else {
            tvInstitusi.setText("Asal Institusi :"+ institusi);
        }
    }
}