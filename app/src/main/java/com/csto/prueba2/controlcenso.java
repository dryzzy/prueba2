package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class controlcenso extends AppCompatActivity {

    ImageButton botonimagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlcenso);
        botonimagen = (ImageButton) findViewById(R.id.imagenboton);
        botonimagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(), ventana3.class);
                startActivity(I);
            }
        });


    }
}