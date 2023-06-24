package com.example.ejercicio_9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int image1 = R.drawable._517090__1_;
    int image2 = R.drawable.e_learning_svgrepo_com;
    int image3 = R.drawable.drawing_svgrepo_com;
    int image4 = R.drawable._056977;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlisteners();


    }

    private void initlisteners() {
        ImageButton boton1 = findViewById(R.id.boton1);
        ImageButton boton2 = findViewById(R.id.boton2);
        ImageButton boton3 = findViewById(R.id.boton3);
        ImageButton boton4 = findViewById(R.id.boton4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivity2(image1);

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivity2(image2);

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivity2(image3);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivity2(image4);

            }



        });
    }

    public void moveToActivity2(int image) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("clave", image);
        startActivity(intent);
    }




}


