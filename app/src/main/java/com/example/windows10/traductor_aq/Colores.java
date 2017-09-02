package com.example.windows10.traductor_aq;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by WINDOWS 10 on 30/05/2017.
 */

public class Colores extends AppCompatActivity {

    Spinner Color;
    String [] datosColores = {"selecciona opcion","rojo", "amarillo", "verde","azul","negro","blanco","naranjado"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView colorcito;
    Button animales_aymara;
    Button animales_quechua;

    private Animation animacion;

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_colores);

        createSoundPool();

        Color = (Spinner)findViewById(R.id.sp_colores);

        ArrayAdapter<String> colorsadapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosColores);
        Color.setAdapter(colorsadapter);

        Color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Wila";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Puka";
                        tv_quechua1.setText(nombreAplicacion2);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.rojo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);



                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Q'ellu";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Q'ellu";
                        tv_quechua1.setText(nombreAplicacion4);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.amarillo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Ch'uxña";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "Q'umir";
                        tv_quechua1.setText(nombreAplicacion6);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.verde2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "Sajuma";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "Sut'l-anqas";
                        tv_quechua1.setText(nombreAplicacion8);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.azul2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = "Chiyara";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "Yana";
                        tv_quechua1.setText(nombreAplicacion10);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.negro2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "Jhanqu";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "Yurajh";
                        tv_quechua1.setText(nombreAplicacion12);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.blanco2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "Arumi";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "Churqilla";
                        tv_quechua1.setText(nombreAplicacion14);

                        colorcito = (ImageView) findViewById(R.id.img_color);
                        colorcito.setImageResource(R.drawable.naaranja2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        colorcito.startAnimation(animacion);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }

    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        spIdiota = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spCallate = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spVeteAlDiablo = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        spIdiota = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spCallate = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spVeteAlDiablo = new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        chargeSoundPool();
    }

    public void chargeSoundPool() {
        resIdiota = spIdiota.load(
                getApplicationContext(),
                R.raw.wila1, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.puka1, 1);
        resVeteAlDiablo = spVeteAlDiablo.load(
                getApplicationContext(),
                R.raw.vete_al_diablo, 1);
    }

    public void idiota(View v) {
        if(resIdiota != 0){
            spIdiota.play(resIdiota, 1, 1, 0, 0, 1);
        }
    }

    public void callate(View v) {
        if(resCallate != 0){
            spCallate.play(resCallate, 1, 1, 0, 0, 1);
        }
    }

    public void veteAlDiablo(View v) {
        if(resVeteAlDiablo != 0){
            spVeteAlDiablo.play(resVeteAlDiablo, 1, 1, 0, 0, 1);
        }
    }

    public void salir(View v) {
        finish();
    }

}