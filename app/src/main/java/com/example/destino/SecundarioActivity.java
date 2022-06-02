package com.example.destino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.net.URISyntaxException;

public class SecundarioActivity extends AppCompatActivity {

    private String mNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_secundario );

        String s = "";
        Intent intent = null;
        try {
            intent = Intent.getIntent (  s);
        } catch (URISyntaxException e) {
            e.printStackTrace ( );
        }
        mNombre = intent.getStringExtra ("Nombre");
    }
}

/*
        Intent intenEnviar = new Intent ( this, DestinoActivity.class );
        EditText nombreUsuario = findViewById ( R.id.nombre );
        String nombreUsuarioMensaje = nombreUsuario.getText ().toString ();
        intenEnviar.putExtra (NOMBRE_USUARIO, nombreUsuarioMensaje);
        startActivity(intenEnviar);
 */