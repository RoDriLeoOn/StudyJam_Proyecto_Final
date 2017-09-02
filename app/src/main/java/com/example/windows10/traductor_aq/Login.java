package com.example.windows10.traductor_aq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

/**
 * Created by WINDOWS 10 on 06/06/2017.
 */

public class Login  extends AppCompatActivity {

    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        ingresar = (Button)findViewById(R.id.btn_ingresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario =((EditText)findViewById(R.id.edt_usuario)).getText().toString();
                String password =((EditText)findViewById(R.id.edt_pass)).getText().toString();
                if (usuario.equals("admin")&&password.equals("admin"))
                {
                    Intent menu = new Intent(getApplicationContext(), Menu.class);
                    startActivity(menu);


                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña incorecta",Toast.LENGTH_SHORT).show();


                }

            }
        });


    }


    public void salir(View v) {
        finish();
    }

}
