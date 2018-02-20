package com.example.gonza.practica1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ImageView extends Activity {

    android.widget.ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        //Obtiene el intent
        Intent intent = getIntent();
        //Obtiene la posicion de la imagen del intent
        int position = intent.getExtras().getInt("position");
        //Obtiene el array de imagenes del intent
        Integer[] images = (Integer[]) intent.getExtras().get("images");

        //Referenciamos el imageView de activity_image_view
        imageView = findViewById(R.id.image_full);
        //Indica la imagen que tiene que mostrar
        imageView.setImageResource(images[position]);

    }
}
