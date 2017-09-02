package com.example.windows10.traductor_aq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animales = (Button)findViewById(R.id.btn_animal);
    }

    public void ingresa(View v) {
        Intent animal = new Intent(getApplicationContext(), Login.class);
        startActivity(animal);
    }

    public void salir(View v) {
        finish();
    }
}
