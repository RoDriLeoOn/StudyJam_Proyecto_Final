package com.example.windows10.traductor_aq;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WINDOWS 10 on 22/05/2017.
 */

public class Diccionario extends AppCompatActivity {

    TextView tv_aymara1;
    TextView tv_quechua1;
    EditText edt_dic;
    Button btn_diccionarios;

    ImageView diccio;


    private Animation animacion;

    private SoundPool spIdiota, spCallate, spVeteAlDiablo;
    private int resIdiota, resCallate, resVeteAlDiablo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_diccionario);

        createSoundPool();

        edt_dic = (EditText)findViewById(R.id.edt_dic);
        btn_diccionarios = (Button)findViewById(R.id.btn1);
        tv_aymara1 = (TextView)findViewById(R.id.tv_aymara);
        tv_quechua1 = (TextView)findViewById(R.id.tv_quechua);

}
    public void traducir(View v) {

        String dato = edt_dic.getText().toString();

        tv_aymara1.setText("munaña" );
        tv_quechua1.setText("munay ");

        diccio = (ImageView) findViewById(R.id.img_diccio);
        diccio.setImageResource(R.drawable.amar);

        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_in);
        diccio.startAnimation(animacion);

    }

    public void acerca(View v) {
        Intent animal = new Intent(getApplicationContext(), AcercaDe.class);
        startActivity(animal);
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
                R.raw.munaya, 1);
        resCallate = spCallate.load(
                getApplicationContext(),
                R.raw.munay, 1);
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
