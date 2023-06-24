package com.example.ejercicio_9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int image1 = R.drawable.btn_star_big_on;
    int image2 = R.drawable.ic_launcher_foreground;
    int image3 = R.drawable.btn_dialog;
    int image4 = R.drawable.checkbox_on_background;


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


