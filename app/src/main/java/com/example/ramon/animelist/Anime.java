package com.example.ramon.animelist;

public class Anime {

    private String Nombre;
    private String Descripcion;
    private String clasificacion;
    private int num_episodios;
    private String categorias;
    private String estudio;
    private String imagen;

    public Anime(){

    }

    public Anime(String nombre, String descripcion, String clasificacion, int num_episodios, String categorias, String estudio, String imagen) {
        Nombre = nombre;
        Descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.num_episodios = num_episodios;
        this.categorias = categorias;
        this.estudio = estudio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getNum_episodios() {
        return num_episodios;
    }

    public void setNum_episodios(int num_episodios) {
        this.num_episodios = num_episodios;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }



}
