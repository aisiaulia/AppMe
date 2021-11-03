package com.example.appme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Deklarasi Variable
    TextView tvNama, tvNim;
    EditText etProdi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi variable
        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        etProdi = findViewById(R.id.etProdi);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = tvNama.getText().toString();
                    String nim = tvNim.getText().toString();
                    String prodi = etProdi.getText().toString();

                    // Pengecekan prodi harus diisi
                    if (prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program Studi harus diisi", Toast.LENGTH_SHORT).show();
                    } else {
                        // opsi 1
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNim", nim);
                        bundle.putString("keyProdi", prodi);
                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}