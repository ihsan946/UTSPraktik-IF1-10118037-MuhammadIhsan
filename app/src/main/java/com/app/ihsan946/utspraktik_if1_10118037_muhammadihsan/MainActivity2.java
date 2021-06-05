package com.app.ihsan946.utspraktik_if1_10118037_muhammadihsan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //
        Intent intent = getIntent();
        String NIK = intent.getStringExtra("nik");
        String Nama = intent.getStringExtra("nama");
        String TTl = intent.getStringExtra("ttl");
        String jenisKelamin = intent.getStringExtra("jk");
        String hubungan = intent.getStringExtra("hubungan");

        TextView nik,nama,TanggalLahir,jk,hubungan1;
        nik = findViewById(R.id.textview_nik);
        nama = findViewById(R.id.textview_nama);
        TanggalLahir = findViewById(R.id.textview_ttl);
        jk = findViewById(R.id.textview_jeniskelamin);
        hubungan1 = findViewById(R.id.textview_hubungananda);


        nik.setText(NIK);
        nama.setText(Nama);
        TanggalLahir.setText(TTl);
        jk.setText(jenisKelamin);
        hubungan1.setText(hubungan);

        //

        Button ubah;
        ubah = findViewById(R.id.btn_ubah);
        ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahUtama(v);
            }
        });


        //


    }

    public void pindahUtama(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }


}