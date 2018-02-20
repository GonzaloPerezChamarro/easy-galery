package com.example.gonza.practica1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by gonza on 04/11/2017.
 */

public class GridAdapter extends BaseAdapter{

    //Array de imagenes
    private Integer[] images = {
        R.drawable.leopardo,
            R.drawable.muchos,
            R.drawable.ratonn,
            R.drawable.tigre,
            R.drawable.arana,
            R.drawable.gallina,
            R.drawable.gallinajjj,
            R.drawable.gato,
            R.drawable.pajaro,
            R.drawable.rana,
            R.drawable.animalillo,
            R.drawable.caballito,
            R.drawable.gallo,
            R.drawable.gatito,
            R.drawable.oveja,
            R.drawable.perro
    };

    //Hacemos una variable para el activity del que proviene, en este caso MainActivity
    Activity activity;
    //Creamos un inflater
    private static LayoutInflater inflater = null;



    public GridAdapter(Activity a){
        this.activity=a;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return images[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Creamos una variable para referenciar el view
        View view = convertView;
        //Si el view es nulo se le asigna el correcto, en este caso el que tiene el grid
        if(convertView == null){
            view = inflater.inflate(R.layout.image_grid, null);

        }
        //Creamos una variable y le asignamos el imageView de activity_image_view.xml
        ImageView imageView = view.findViewById(R.id.image_view);
        //A nuestro imageView le asignamos la imagen que tiene que mostrar
        imageView.setImageResource(images[position]);

        return view;

    }
    //Devuelve el array de imagenes
    public Integer[] getImages(){
        return images;
    }
}
