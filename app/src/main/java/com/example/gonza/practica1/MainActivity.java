package com.example.gonza.practica1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

//Activity principal
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos un grid y le asignamos el de activity_main.xml
        GridView grid = findViewById(R.id.grid);
        //Creamos un adapter para las imagenes que vamos a mostrar y se lo asignamos al grid anterior
        final GridAdapter adapter= new GridAdapter(this);
        grid.setAdapter(adapter);

        //Creamos un listener para saber cuando son tocadas las imagenes
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Creamos un intent para abrir ImageView
                Intent intent = new Intent(MainActivity.this, ImageView.class);

                //Al nuevo intent le pasamos las imagenes y la posicion de la clickada
                intent.putExtra("position", position);
                intent.putExtra("images", adapter.getImages());

                //Iniciamos el nuevo Activity
                startActivity(intent);
            }
        });


    }
}
