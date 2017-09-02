package com.example.windows10.traductor_aq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by WINDOWS 10 on 30/05/2017.
 */

public class Menu extends AppCompatActivity {

    Button animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);
        animales = (Button)findViewById(R.id.btn_animal);

    }

    public void diccionario(View v) {
        Intent animal = new Intent(getApplicationContext(), Diccionario.class);
        startActivity(animal);
    }

    public void conver(View v) {
        Intent animal = new Intent(getApplicationContext(), Conversacion.class);
        startActivity(animal);
    }

    public void animal(View v) {
        Intent animal = new Intent(getApplicationContext(), Animales.class);
        startActivity(animal);
    }

    public void familia(View v) {
        Intent animal = new Intent(getApplicationContext(), Familia.class);
        startActivity(animal);
    }

    public void cuerpo(View v) {
        Intent animal = new Intent(getApplicationContext(), Cuerpo.class);
        startActivity(animal);
    }

    public void colores(View v) {
        Intent animal = new Intent(getApplicationContext(), Colores.class);
        startActivity(animal);
    }

    public void numero(View v) {
        Intent animal = new Intent(getApplicationContext(), Numeros.class);
        startActivity(animal);
    }

    public void salir(View v) {
        finish();
    }


}
