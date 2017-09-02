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
 * Created by WINDOWS 10 on 08/06/2017.
 */

public class Conversacion extends AppCompatActivity {

    Spinner Conver;
    String [] datosConver = {"selecciona opcion","¿Cómo estás?","Buenos dias", "buenas tardes", "buenas noches","hola","así es,","hoy día"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView convers;
    Button animales_aymara;
    Button animales_quechua;

    private Animation animacion;

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conversacion);

        createSoundPool();

        convers = (ImageView) findViewById(R.id.img_conver);

        Conver = (Spinner)findViewById(R.id.sp_conver);

        ArrayAdapter<String> animaladapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosConver);
        Conver.setAdapter(animaladapter);

        Conver.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "kunamastasa";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Imaynalla";
                        tv_quechua1.setText(nombreAplicacion2);

                        //animales_aymara = (Button)findViewById(R.id.btn_aymara);
                        // spIdiota.play(resIdiota, 1, 1, 0, 0, 1);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.como);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "suma uru";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Sumaj p'unchay";
                        tv_quechua1.setText(nombreAplicacion4);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.buenos_dias);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "suma jayp'u";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "Ancha sukha";
                        tv_quechua1.setText(nombreAplicacion6);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.tarde);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "suma aruma";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "Sumaj ch'isi";
                        tv_quechua1.setText(nombreAplicacion8);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.buenas_noches);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = " kamisaki";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "Yaw, Chuy";
                        tv_quechua1.setText(nombreAplicacion10);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.hola1);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "ukhamawa";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "ari kay";
                        tv_quechua1.setText(nombreAplicacion12);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.asi_es);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "jichhuru";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "Kay p'unchay";
                        tv_quechua1.setText(nombreAplicacion14);

                        convers = (ImageView) findViewById(R.id.img_conver);
                        convers.setImageResource(R.drawable.hoy);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        convers.startAnimation(animacion);
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
                R.raw.kuna, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.ima, 1);
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



    public void zoomin(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_in);
        Conver.startAnimation(animacion);
    }

    public void salir(View v) {
        finish();
    }

}
