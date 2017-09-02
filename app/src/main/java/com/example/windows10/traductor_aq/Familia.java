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

public class Familia extends AppCompatActivity {

    Spinner Family;
    String [] datosFamily = {"Selecciona opcion","papa", "mama", "hijo","hija","hermano","hermana","esposo","esposa"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView familias;
    Button animales_aymara;
    Button animales_quechua;

    private Animation animacion;

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_familia);

        createSoundPool();

        Family = (Spinner)findViewById(R.id.sp_familia);

        ArrayAdapter<String> colorsadapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosFamily);
        Family.setAdapter(colorsadapter);

        Family.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Awki";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Tata";
                        tv_quechua1.setText(nombreAplicacion2);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.papa2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Taika";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Mama";
                        tv_quechua1.setText(nombreAplicacion4);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.mama2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Yuqa";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "Qari waw";
                        tv_quechua1.setText(nombreAplicacion6);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.hijo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "Puccha";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "warmi wawa";
                        tv_quechua1.setText(nombreAplicacion8);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.hija2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = "Jila";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "qhari-Wanqui";
                        tv_quechua1.setText(nombreAplicacion10);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.hermano2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "Kullaka";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "warmi.kullaka";
                        tv_quechua1.setText(nombreAplicacion12);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.hermana2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "Chacha";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "Qhari";
                        tv_quechua1.setText(nombreAplicacion14);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.esposo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);
                        break;

                    case 8:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion15 = "Warmi";
                        tv_aymara1.setText(nombreAplicacion15);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion16 = "Warmi";
                        tv_quechua1.setText(nombreAplicacion16);

                        familias = (ImageView) findViewById(R.id.img_familia);
                        familias.setImageResource(R.drawable.esposa2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        familias.startAnimation(animacion);

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
                R.raw.awqui1, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.tata1, 1);
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
