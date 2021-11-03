package com.example.appme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    // Deklarasi variable
    TextView tvNamaValue, tvNimValue, tvProdiValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // inisialisasi variable
        tvNamaValue = findViewById(R.id.tvNamaValue);
        tvNimValue = findViewById(R.id.tvNimValue);
        tvProdiValue = findViewById(R.id.tvProdiValue);

        // opsi 1
        Bundle bundle = getIntent().getExtras();
        tvNamaValue.setText(bundle.getString("keyNama"));
        tvNimValue.setText(bundle.getString("keyNim"));
        tvProdiValue.setText(bundle.getString("keyProdi"));
    }
}