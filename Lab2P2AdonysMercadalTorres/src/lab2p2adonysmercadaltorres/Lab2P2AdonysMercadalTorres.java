/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2adonysmercadaltorres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adony
 */
public class Lab2P2AdonysMercadalTorres {
public static boolean estudiante;
public static boolean biblioteca;
public static boolean profesor;
public static ArrayList <Libros> listLibros = new ArrayList();
public static ArrayList<Articulos> listaArticu = new ArrayList();
public static ArrayList <Cursos> listaCursos = new ArrayList();
public static ArrayList<Conferencias> listaConfe = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menu
        Scanner n = new Scanner(System.in);
        login();
        tipoP();
    }
    public static void tipoP(){
        if(estudiante){//si es estudiante entra a las opciones limitadas de ese tipo
            int entrar = 1;
            while(entrar == 1){
            Scanner n = new Scanner(System.in);
            System.out.println("Bienvenido Estudiante");
            System.out.println("1.Listar recursos");
            System.out.println("2.Salir");
            int opc = n.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Lista de los Recursos");
                    listarM();
                    break;
                case 2:
                    System.out.println("Saliendo....");
                    entrar += 2;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            }  
        }else if (biblioteca){//si es bibliotecario entra en modo dios
            int entrar = 1;
            while(entrar == 1){
            Scanner n = new Scanner(System.in);
            System.out.println("Bienvenido Bibliotecario");
            System.out.println("1.Listar recursos");
            System.out.println("2.Crear Recursos");
            System.out.println("3.Elimar recurso");
                System.out.println("4.Modificar Recurso");
                System.out.println("5.Salir");
            int opc = n.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Lista de los Recursos");
                    listarM();
                    break;
                case 2:
                    System.out.println("Crear recursos");
                    System.out.println("1.Libros");
                    System.out.println("2.Articulos");
                    System.out.println("3.Cursos en Linea");
                    System.out.println("4.Conferencias Virtuales");
                    int opc2 = n.nextInt();
                switch (opc2){
                    case 1:
                        boolean disponible = true;
                        System.out.println("Ingrese el titulo del libro:");
                        String titulo = n.nextLine();
                        titulo= n.nextLine();
                        System.out.println("Ingrese el Autor del libro:");
                        String autor = n.nextLine();
                        System.out.println("Ingrese el genero del libro:");
                        String genero = n.nextLine();
                        System.out.println("Ingrese año de publicacion");
                        String publicacion = n.nextLine();
                        System.out.println("Disponibilidad Y/N");
                        String dispo = n.nextLine();
                        switch (dispo){
                            case "Y":
                                disponible = true;
                                break;
                            case "N":
                                 disponible = false;
                                break;
                            default:
                                System.out.println("Se ingreso mal o no es valido");
                                break;
                        }
                        Libros NuevoLibro = new Libros(titulo,autor,genero,publicacion,disponible);
                        listLibros.add(NuevoLibro);
                        break;
                    case 2:
                        disponible = true;
                        System.out.println("Ingrese el titulo del articulo:");
                        String titul = n.nextLine();
                        titul = n.nextLine();
                        System.out.println("Ingrese el Autor del articulo:");
                        String autore = n.nextLine();
                        System.out.println("Ingrese el tema del articulo:");
                        String tema = n.nextLine();
                        System.out.println("Ingrese año de publicacion");
                        String publicacione = n.nextLine();
                        System.out.println("Disponibilidad Y/N");
                        String dispos = n.nextLine();
                        switch (dispos){
                            case "Y":
                                disponible = true;
                                break;
                            case "N":
                                 disponible = false;
                                break;
                            default:
                                System.out.println("Se ingreso mal o no es valido");
                                break;
                        }
                        Articulos NuevoArt = new Articulos(titul,autore,tema,publicacione,disponible);
                        listaArticu.add(NuevoArt);
                        break;
                    case 3:
                        disponible = true;
                        System.out.println("Ingrese el titulo del Curso:");
                        String titu = n.nextLine();
                        titu = n.nextLine();
                        System.out.println("Ingrese el Instructor:");
                        String instructor = n.nextLine();
                        System.out.println("Ingrese la duracion:");
                        String duracion = n.nextLine();
                        System.out.println("Ingrese la plataforma");
                        String plataforma = n.nextLine();
                        Cursos nuevoCurs = new Cursos(titu,instructor,duracion,plataforma);
                        listaCursos.add(nuevoCurs);
                        break;
                    case 4:
                         disponible = true;
                        System.out.println("Ingrese el titulo del la conferencia:");
                        String titulos = n.nextLine();
                        titulos = n.nextLine();
                        System.out.println("Ingrese el Conferisista:");
                        String conferisista = n.nextLine();
                        System.out.println("Ingrese la fecha:");
                        String fecha = n.nextLine();
                        System.out.println("Ingrese la duracion");
                        String duracione = n.nextLine();
                        System.out.println("Ingrese enlace");
                        String enlace = n.nextLine();
                         Conferencias nuevaConf = new Conferencias(titulos,conferisista,fecha,duracione,enlace);
                        listaConfe.add(nuevaConf);
                        break;
                } 
                break;
                case 5:
                    System.out.println("Saliendo....");
                    entrar += 2;
                    break;
                case 3:
                    System.out.println("Eliminar Recursos");
                    break;
                case 4:
                    System.out.println("Modificar Recursos");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            }
        }else if(profesor){//si es profesor """""""""""
            int entrar = 1;
            while(entrar == 1){
            Scanner n = new Scanner(System.in);
            System.out.println("Bienvenido Profesor");
            System.out.println("1.Listar recursos");
                System.out.println("2.Crear recursos");
            System.out.println("3.Salir");
            int opc = n.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Lista de los Recursos");
                    listarM();
                    break;
                case 2:
                    System.out.println("Crear recursos");
                    System.out.println("1.Libros");
                    System.out.println("2.Articulos");
                    System.out.println("3.Cursos en Linea");
                    System.out.println("4.Conferencias Virtuales");
                    int opc2 = n.nextInt();
                switch (opc2){
                    case 1:
                        boolean disponible = true;
                        System.out.println("Ingrese el titulo del libro:");
                        String titulo = n.nextLine();
                        titulo= n.nextLine();
                        System.out.println("Ingrese el Autor del libro:");
                        String autor = n.nextLine();
                        System.out.println("Ingrese el genero del libro:");
                        String genero = n.nextLine();
                        System.out.println("Ingrese año de publicacion");
                        String publicacion = n.nextLine();
                        System.out.println("Disponibilidad Y/N");
                        String dispo = n.nextLine();
                        switch (dispo){
                            case "Y":
                                disponible = true;
                                break;
                            case "N":
                                 disponible = false;
                                break;
                            default:
                                System.out.println("Se ingreso mal o no es valido");
                                break;
                        }
                        Libros NuevoLibro = new Libros(titulo,autor,genero,publicacion,disponible);
                        listLibros.add(NuevoLibro);
                        break;
                    case 2:
                        disponible = true;
                        System.out.println("Ingrese el titulo del articulo:");
                        String titul = n.nextLine();
                        titul = n.nextLine();
                        System.out.println("Ingrese el Autor del articulo:");
                        String autore = n.nextLine();
                        System.out.println("Ingrese el tema del articulo:");
                        String tema = n.nextLine();
                        System.out.println("Ingrese año de publicacion");
                        String publicacione = n.nextLine();
                        System.out.println("Disponibilidad Y/N");
                        String dispos = n.nextLine();
                        switch (dispos){
                            case "Y":
                                disponible = true;
                                break;
                            case "N":
                                 disponible = false;
                                break;
                            default:
                                System.out.println("Se ingreso mal o no es valido");
                                break;
                        }
                        Articulos NuevoArt = new Articulos(titul,autore,tema,publicacione,disponible);
                        listaArticu.add(NuevoArt);
                        break;
                    case 3:
                        disponible = true;
                        System.out.println("Ingrese el titulo del Curso:");
                        String titu = n.nextLine();
                        titu = n.nextLine();
                        System.out.println("Ingrese el Instructor:");
                        String instructor = n.nextLine();
                        System.out.println("Ingrese la duracion:");
                        String duracion = n.nextLine();
                        System.out.println("Ingrese la plataforma");
                        String plataforma = n.nextLine();
                        Cursos nuevoCurs = new Cursos(titu,instructor,duracion,plataforma);
                        listaCursos.add(nuevoCurs);
                        break;
                    case 4:
                         disponible = true;
                        System.out.println("Ingrese el titulo del la conferencia:");
                        String titulos = n.nextLine();
                        titulos = n.nextLine();
                        System.out.println("Ingrese el Conferisista:");
                        String conferisista = n.nextLine();
                        System.out.println("Ingrese la fecha:");
                        String fecha = n.nextLine();
                        System.out.println("Ingrese la duracion");
                        String duracione = n.nextLine();
                        System.out.println("Ingrese enlace");
                        String enlace = n.nextLine();
                         Conferencias nuevaConf = new Conferencias(titulos,conferisista,fecha,duracione,enlace);
                        listaConfe.add(nuevaConf);
                        break;
                } 
                break;
                case 3:
                    System.out.println("Saliendo....");
                    entrar += 2;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            } 
        }

    }
    public static void login(){
        Scanner n = new Scanner(System.in);
        String usuario;
        String contrasena;
        boolean login = true;
        while (login) {
            System.out.println("Ingrse Usuario");
            usuario = n.nextLine();
            if (usuario.equals("adonys@gmail.com") || usuario.equals("venus@gmail.com")||usuario.equals("irene@gmail.com")) {
                System.out.println("Ingrese contrasena");
                contrasena = n.nextLine();
                if (contrasena.equals("Dunai04")) {//es estudiante
                    estudiante = true;
                    login = false;
                } else if (contrasena.equals("Venas10")) {//bibliotecaria
                   biblioteca = true;
                   login = false;
                } else if (contrasena.equals("Irenex21")) {//profesor
                    profesor = true;
                    login = false;
                } else {
                    System.out.println("contrasena invalida");
                }
            }else{
                 System.out.println("El ususario no existe");
            }

        }
    }
    public static void listarM(){
        System.out.println("Libros");
        for (int i = 0; i < listLibros.size(); i++) {
            Libros impr = listLibros.get(i);
            System.out.println(impr);
            System.out.println("");
        }
        System.out.println("Articulos");
        for (int i = 0; i < listaArticu.size(); i++) {
            Articulos impr = listaArticu.get(i);
            System.out.println(impr);
            System.out.println("");
        }
        System.out.println("Cursos");
        for (int i = 0; i < listaCursos.size(); i++) {
            Cursos impr = listaCursos.get(i);
            System.out.println(impr);
            System.out.println("");
        }
        System.out.println("Conferencias");
        for (int i = 0; i < listaConfe.size(); i++) {
            Conferencias impr = listaConfe.get(i);
            System.out.println(impr);
            System.out.println("");
        }
    }
}
