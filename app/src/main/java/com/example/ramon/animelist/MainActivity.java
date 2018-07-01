package com.example.ramon.animelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String Json_url = "";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<Anime> ListaAnime;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaAnime = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        JsonRequest();
    }

    private void JsonRequest(){

        request = new JsonArrayRequest(Json_url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;

                for(int i=0; i<response.length(); i++){

                    try {
                        jsonObject = response.getJSONObject(i);
                        Anime anime = new Anime();

                        anime.setNombre(jsonObject.getString("name"));
                        anime.setDescripcion(jsonObject.getString("description"));
                        anime.setClasificacion(jsonObject.getString("Rating"));
                        anime.setNum_episodios(jsonObject.getInt("episode"));
                        anime.setCategorias(jsonObject.getString("categorie"));
                        anime.setEstudio(jsonObject.getString("studio"));
                        anime.setImagen(jsonObject.getString("img"));
                        ListaAnime.add(anime);

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

                setRecyclerView(ListaAnime);

            }
        },new  Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(request);
    }

    private void setRecyclerView(List<Anime> listaAnime) {

        AnimeViewAdapter ViewAdapter = new AnimeViewAdapter(this,ListaAnime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(ViewAdapter);
    }


}
