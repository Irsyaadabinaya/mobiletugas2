package com.irsyaad.mobiletugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static String EXTRA_PERSON = "extra_person";
    private TextView tvObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = findViewById(R.id.tv_object_received);
        Person user = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Nama : "+user.getNama()+", Umur : "+user.getUmur()+", Jenis Kelamin : "+user.getJenis()+", Alamat : "+user.getAlamat();
        tvObject.setText(text);
    }
}