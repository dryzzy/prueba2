package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText clave;
    Button conectar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.usuario);
        clave = (EditText)  findViewById(R.id.clave);
        conectar = (Button) findViewById(R.id.conectar);
        conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contraseñita = clave.getText().toString();
                String Usuarito = usuario.getText().toString();
                if (Usuarito.equals("adm123")&& contraseñita.equals("adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),controlcenso.class);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"ingreso incorrecto", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}