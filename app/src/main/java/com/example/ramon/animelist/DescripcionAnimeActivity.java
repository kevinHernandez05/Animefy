package com.example.ramon.animelist;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DescripcionAnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_anime);

        getSupportActionBar().hide();

        String nomb = getIntent().getExtras().getString("nombre");
        String desc = getIntent().getExtras().getString("descripcion");
        String cat = getIntent().getExtras().getString("categoria");
        String cal = getIntent().getExtras().getString("calificacion");
        String est = getIntent().getExtras().getString("estudio");
        int epi = getIntent().getExtras().getInt("episodio");
        String img = getIntent().getExtras().getString("imagen");


        TextView tv_nombre = findViewById(R.id.b_nombre);
        TextView tv_descripcion = findViewById(R.id.b_descripcion);
        TextView tv_categoria = findViewById(R.id.b_categoria);
        TextView tv_calificacion = findViewById(R.id.b_calificacion);
        TextView tv_estudio = findViewById(R.id.b_estudio);
        AppCompatImageView tv_imagen = findViewById(R.id.b_portada);


        tv_nombre.setText(nomb);
        tv_descripcion.setText(desc);
        tv_categoria.setText(cat);
        tv_calificacion.setText(cal);
        tv_estudio.setText(est);

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        Glide.with(this).load(img).into(tv_imagen);
    }
}
