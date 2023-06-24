package com.example.ejercicio_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();

        Intent intentGet =getIntent();
        int idImage = intentGet.getIntExtra("clave",0);
        Log.d("SecondActivity",String.valueOf(idImage));

        ImageView imageView = findViewById(R.id.imageView);

        imageView.setImageResource(idImage);


    }

    private void initListeners() {
        Button volver = findViewById(R.id.volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}