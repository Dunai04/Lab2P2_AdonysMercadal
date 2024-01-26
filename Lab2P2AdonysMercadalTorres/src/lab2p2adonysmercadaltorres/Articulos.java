/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2adonysmercadaltorres;

import java.util.Date;

/**
 *
 * @author adony
 */
public class Articulos {//atributos
    protected String Titulo;
    protected String autor;
    protected String tema;
    protected String publicacion;
    protected boolean disponiblidad;

    public Articulos(String Titulo, String autor, String tema, String publicacion, boolean disponiblidad) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.tema = tema;
        this.publicacion = publicacion;
        this.disponiblidad = disponiblidad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isDisponiblidad() {
        return disponiblidad;
    }

    public void setDisponiblidad(boolean disponiblidad) {
        this.disponiblidad = disponiblidad;
    }

    @Override
    public String toString() {
        return "Articulos{" + "Titulo=" + Titulo + ", autor=" + autor + ", tema=" + tema + ", publicacion=" + publicacion + ", disponiblidad=" + disponiblidad + '}';
    }
    
}
