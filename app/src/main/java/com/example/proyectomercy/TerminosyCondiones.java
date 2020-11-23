package com.example.proyectomercy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerminosyCondiones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminosy_condiones);
    }

    public void regresar(View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void aceptar(View view){
        Intent i =new Intent(this, menuPrincipal.class);
        startActivity(i);
    }
}