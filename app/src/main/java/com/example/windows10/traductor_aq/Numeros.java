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
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by WINDOWS 10 on 22/05/2017.
 */

public class Numeros extends AppCompatActivity {

    Spinner Numeross;
    String [] datosNumero = {"Selecciona opcion","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView numeritoss;
    Button animales_aymara;
    Button animales_quechua;

    private Animation animacion;

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_numeros);

        createSoundPool();

        Numeross = (Spinner)findViewById(R.id.sp_numeros);

        ArrayAdapter<String> animaladapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosNumero);
        Numeross.setAdapter(animaladapter);


        Numeross.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Maya";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Uj'juk";
                        tv_quechua1.setText(nombreAplicacion2);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.uno2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Paya";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Iskay";
                        tv_quechua1.setText(nombreAplicacion4);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.dos2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Kimsa";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "kinsa";
                        tv_quechua1.setText(nombreAplicacion6);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.tres2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "pusi";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "tawa";
                        tv_quechua1.setText(nombreAplicacion8);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.cuatro2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = "Phisqa";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "pichqa";
                        tv_quechua1.setText(nombreAplicacion10);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.cinco2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "Suxta";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "suqta";
                        tv_quechua1.setText(nombreAplicacion12);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.seis2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "paqallqu";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "Qhachis";
                        tv_quechua1.setText(nombreAplicacion14);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.siete2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;
                    case 8:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion15 = "kimsaqallqu";
                        tv_aymara1.setText(nombreAplicacion15);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion16 = "pusaq";
                        tv_quechua1.setText(nombreAplicacion16);

                        numeritoss = (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.ocho2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

                        break;

                    case 9:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion17 = "Laltunka";
                        tv_aymara1.setText(nombreAplicacion17);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion18 = "jisq'un";
                        tv_quechua1.setText(nombreAplicacion18);

                        numeritoss= (ImageView) findViewById(R.id.img_numero);
                        numeritoss.setImageResource(R.drawable.nueve2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        numeritoss.startAnimation(animacion);

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
                R.raw.maya1, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.juj1,1);
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

    public void salir(View v) {
        finish();
    }
}
