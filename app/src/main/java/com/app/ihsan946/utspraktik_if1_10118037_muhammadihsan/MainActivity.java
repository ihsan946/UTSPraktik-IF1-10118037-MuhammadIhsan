package com.app.ihsan946.utspraktik_if1_10118037_muhammadihsan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private String jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button selanjutnya;
        EditText tanggalLahir;
        //

        tanggalLahir= findViewById(R.id.edittext3);

        tanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });

        //

        //
        RadioGroup jenisKelamin,;

        jenisKelamin = findViewById(R.id.jenis_kelamin);

        jenisKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.laki2:
                        jk = "Laki - Laki";
                        break;
                    case R.id.perempuan:
                        jk = "Perempuan";
                }
            }
        });






        //
        selanjutnya = findViewById(R.id.button_selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahSelanjutnya(v);
            }
        });

    }

    public void pindahSelanjutnya(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        EditText nik,nama,ttl;
        String NIK,Nama,TTl;

        nik = findViewById(R.id.edittext1);
        NIK = nik.getText().toString();
        nama = findViewById(R.id.edittext2);
        Nama = nama.getText().toString();
        ttl = findViewById(R.id.edittext3);
        TTl = ttl.getText().toString();



        intent.putExtra("nik", NIK);
        intent.putExtra("nama", Nama);
        intent.putExtra("ttl", TTl);
        intent.putExtra("jk", jk);
        startActivity(intent);

    }

    public void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        EditText ttl;
        ttl =findViewById(R.id.edittext3);
                datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
//                String bulan = "";
//
//                switch (monthOfYear){
//                    case 1 :
//                        bulan = "Januari";
//                        break;
//                    case 2 :
//                        bulan = "Februari";
//                        break;
//                    case 3 :
//                        bulan = "Maret";
//                        break;
//                    case 4 :
//                        bulan = "April";
//                        break;
//                    case 5 :
//                        bulan = "Mei";
//                        break;
//                    case 6 :
//                        bulan = "Juni";
//                        break;
//                    case 7 :
//                        bulan = "Juli";
//                        break;
//                    case 8 :
//                        bulan = "Agustus";
//                        break;
//                    case 9 :
//                        bulan = "September";
//                        break;
//                    case 10 :
//                        bulan = "Oktober";
//                        break;
//                    case 11 :
//                        bulan = "November";
//                        break;
//                    case 12 :
//                        bulan = "Desember";
//                        break;
//
//                }

                newDate.set(year, monthOfYear, dayOfMonth);


                ttl.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}