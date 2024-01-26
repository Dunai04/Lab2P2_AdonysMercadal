/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2adonysmercadaltorres;

/**
 *
 * @author adony
 */
public class Libros {
    protected String titulo;
    protected String Autor;
    protected String Genero;
    protected String Publicacion;
    protected boolean disponibilidad;

    public Libros(String titulo,String Autor, String Genero, String Publicacion, boolean disponibilidad){
        this.titulo= titulo;
        this.Autor= Autor;
        this.Genero = Genero;
        this.Publicacion = Publicacion;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPublicacion() {
        return Publicacion;
    }

    public void setPublicacion(String Publicacion) {
        this.Publicacion = Publicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", Autor=" + Autor + ", Genero=" + Genero + ", Publicacion=" + Publicacion + ", disponibilidad=" + disponibilidad + '}';
    }
    
}
