package com.example.fabricio.laboratorio06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Gallery;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Gallery minhaGaleria = (Gallery) findViewById(R.id.galeriaImagem);
        minhaGaleria.setAdapter(new AdaptadorImagens(this));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
