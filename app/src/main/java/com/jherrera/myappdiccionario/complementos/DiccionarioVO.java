package com.jherrera.myappdiccionario.complementos;

public class DiccionarioVO {
    private int id_palabra;
    private String nombre_palabra;
    private String significado_palabra;

    public DiccionarioVO() {
    }

    public DiccionarioVO(int id_palabra, String nombre_palabra, String significado_palabra) {
        this.id_palabra = id_palabra;
        this.nombre_palabra = nombre_palabra;
        this.significado_palabra = significado_palabra;
    }

    public int getId_palabra() {
        return id_palabra;
    }

    public void setId_palabra(int id_palabra) {
        this.id_palabra = id_palabra;
    }

    public String getNombre_palabra() {
        return nombre_palabra;
    }

    public void setNombre_palabra(String nombre_palabra) {
        this.nombre_palabra = nombre_palabra;
    }

    public String getSignificado_palabra() {
        return significado_palabra;
    }

    public void setSignificado_palabra(String significado_palabra) {
        this.significado_palabra = significado_palabra;
    }
}
