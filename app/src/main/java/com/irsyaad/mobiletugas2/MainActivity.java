package com.irsyaad.mobiletugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.button1);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithObject = findViewById(R.id.button2);
        btnMoveWithObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button1:
                        Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.button2:
                Person user = new Person();
                user.setNama("Irsyaad Abinaya Nabil Hisyam");
                user.setUmur(19);
                user.setJenis("Pria");
                user.setAlamat("Pegangsaan, Menteng, Jakarta Pusat");
                Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithObjectIntent.putExtra(MoveWithDataActivity.EXTRA_PERSON, user);
                startActivity(moveWithObjectIntent);
                break;
        }
    }
}