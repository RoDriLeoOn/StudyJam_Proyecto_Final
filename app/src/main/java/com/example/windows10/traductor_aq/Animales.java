package com.example.windows10.traductor_aq;
import android.annotation.TargetApi;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
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
 * Created by WINDOWS 10 on 22/05/2017.
 */

public class Animales extends AppCompatActivity {

    Spinner Animal;
    String [] datosAnimales = {"Selecciona una opcion","perro","gato", "raton","gallina","pez","cerdo","sapo","mosca","condor"};

    TextView tv_aymara1;
    TextView tv_quechua1;
    ImageView animalito;
    Button animales_aymara;
    Button animales_quechua;

    private Animation animacion;


    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_animales);

        createSoundPool();


        animalito = (ImageView) findViewById(R.id.img_animal);

        Animal = (Spinner)findViewById(R.id.sp_animales);

        ArrayAdapter<String> animaladapter  = new ArrayAdapter <String>(this,  android.R.layout.simple_spinner_item, datosAnimales);
        Animal.setAdapter(animaladapter);


        Animal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                        break;

                    case 1:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion1 = "Anu";
                        tv_aymara1.setText(nombreAplicacion1);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion2 = "Allqo";
                        tv_quechua1.setText(nombreAplicacion2);

                        //animales_aymara = (Button)findViewById(R.id.btn_aymara);
                       // spIdiota.play(resIdiota, 1, 1, 0, 0, 1);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.perro2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;

                    case 2:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion3 = "Phisi";
                        tv_aymara1.setText(nombreAplicacion3);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion4 = "Michi";
                        tv_quechua1.setText(nombreAplicacion4);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.gato2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;

                    case 3:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion5 = "Achaku";
                        tv_aymara1.setText(nombreAplicacion5);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion6 = "huk'ucha";
                        tv_quechua1.setText(nombreAplicacion6);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.raton2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;

                    case 4:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion7 = "wuallpa";
                        tv_aymara1.setText(nombreAplicacion7);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion8 = "wuallpa";
                        tv_quechua1.setText(nombreAplicacion8);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.gallina2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;

                    case 5:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion9 = "Challwa";
                        tv_aymara1.setText(nombreAplicacion9);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion10 = "Challwa";
                        tv_quechua1.setText(nombreAplicacion10);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.pez2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;

                    case 6:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion11 = "Khuchi";
                        tv_aymara1.setText(nombreAplicacion11);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion12 = "Khuchi";
                        tv_quechua1.setText(nombreAplicacion12);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.cerdo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;
                    case 7:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion13 = "jamp'atu";
                        tv_aymara1.setText(nombreAplicacion13);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion14 = "jamp'atu";
                        tv_quechua1.setText(nombreAplicacion14);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.sapo2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);
                        break;
                    case 8:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion15 = "Chhichhillankha";
                        tv_aymara1.setText(nombreAplicacion15);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion16 = "Chuspi";
                        tv_quechua1.setText(nombreAplicacion16);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.mosca2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

                        break;


                    case 9:
                        tv_aymara1 = (TextView) findViewById(R.id.tv_aymara);
                        String nombreAplicacion17 = "Mallku";
                        tv_aymara1.setText(nombreAplicacion17);

                        tv_quechua1 = (TextView) findViewById(R.id.tv_quechua);
                        String nombreAplicacion18 = "Kuntur";
                        tv_quechua1.setText(nombreAplicacion18);

                        animalito = (ImageView) findViewById(R.id.img_animal);
                        animalito.setImageResource(R.drawable.condor2);

                        animacion = AnimationUtils.loadAnimation(
                                getApplicationContext(),
                                R.anim.zoom_in);
                        animalito.startAnimation(animacion);

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
                R.raw.anu, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.allco, 1);
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
        animalito.startAnimation(animacion);
    }

    public void salir(View v) {
        finish();
    }

}
