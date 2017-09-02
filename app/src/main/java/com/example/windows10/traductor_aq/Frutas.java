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
 * Created by WINDOWS 10 on 22/05/2017.
 */

public class Frutas extends AppCompatActivity {

    Spinner Fruta;
    String [] datosFrutas = {"manzana", "platano", "uva","durazno","sandia","naranja"};
    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView frutitas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frutas);

        Fruta = (Spinner)findViewById(R.id.sp_frutas);

        ArrayAdapter<String> frutasadapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosFrutas);
        Fruta.setAdapter(frutasadapter);

        Fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Nasa";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Puka";
                        tv_quechua1.setText(nombreAplicacion2);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.nariz);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Nayra";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = " Ñawi ";
                        tv_quechua1.setText(nombreAplicacion4);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.ojo);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Jinchu";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "Ninri, rinri  ";
                        tv_quechua1.setText(nombreAplicacion6);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.oreja);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "Laka";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "Simi ";
                        tv_quechua1.setText(nombreAplicacion8);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.boca);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = "P'iqi";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "Uma ";
                        tv_quechua1.setText(nombreAplicacion10);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.cabeza);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "Ampara";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "Maki";
                        tv_quechua1.setText(nombreAplicacion12);

                       frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.manos);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "Kayu";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "Chaki ";
                        tv_quechua1.setText(nombreAplicacion14);

                        frutitas = (ImageView) findViewById(R.id.img_fruta);
                        frutitas.setImageResource(R.drawable.pies);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
