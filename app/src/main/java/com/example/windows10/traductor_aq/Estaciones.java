package com.example.windows10.traductor_aq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by WINDOWS 10 on 30/05/2017.
 */

public class Estaciones extends AppCompatActivity {

    Spinner Stacion;
    String [] datosEstacion = {"selecciona opcion","primavera", "verano", "otoño","invierno"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView estacioness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_estaciones);

        Stacion = (Spinner)findViewById(R.id.sp_estacion);

        ArrayAdapter<String> estacionsadapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosEstacion);
        Stacion.setAdapter(estacionsadapter);

        Stacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Lapakpacha";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "chirawmit'a";
                        tv_quechua1.setText(nombreAplicacion2);

                        estacioness = (ImageView) findViewById(R.id.img_estacion);
                        estacioness.setImageResource(R.drawable.primavera);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Jallupacha";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Ruphaypacha";
                        tv_quechua1.setText(nombreAplicacion4);

                        estacioness = (ImageView) findViewById(R.id.img_estacion);
                        estacioness.setImageResource(R.drawable.verano);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Awtipacha";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "Jwkaymit'a";
                        tv_quechua1.setText(nombreAplicacion6);

                        estacioness = (ImageView) findViewById(R.id.img_estacion);
                        estacioness.setImageResource(R.drawable.otono);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "Thayapacha";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "chirimit's";
                        tv_quechua1.setText(nombreAplicacion8);

                        estacioness = (ImageView) findViewById(R.id.img_estacion);
                        estacioness.setImageResource(R.drawable.invierno);

                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}