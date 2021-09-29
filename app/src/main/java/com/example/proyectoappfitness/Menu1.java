package com.example.proyectoappfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Menu1 extends AppCompatActivity {

    ImageButton irAP2;
    ImageButton irAP8;
    ImageButton irAP5;
    Button irAP7;
    FloatingActionButton irAP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1_main);
        irAP2 = (ImageButton) findViewById(R.id.imgP2Btn);
        irAP8 = (ImageButton) findViewById(R.id.imgP8Btn);
        irAP5 = (ImageButton) findViewById(R.id.imgP5Btn);
        irAP7 = (Button) findViewById(R.id.valoranosBtn);
        irAP4 = (FloatingActionButton) findViewById(R.id.notasFab);


        irAP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu1.this, P2.class);
                startActivity(intent);
            }
        });

        irAP8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu1.this, P8.class);
                startActivity(intent);
            }
        });

        irAP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu1.this, P8.class);
                startActivity(intent);
            }
        });

        irAP7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu1.this, P7.class);
                startActivity(intent);
            }
        });

        irAP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu1.this, P4.class);
                startActivity(intent);
            }
        });
    }
}