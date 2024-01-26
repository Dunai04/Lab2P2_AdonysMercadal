/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2adonysmercadaltorres;

import java.util.Scanner;

/**
 *
 * @author adony
 */
public class Lab2P2AdonysMercadalTorres {
public static boolean estudiante;
public static boolean biblioteca;
public static boolean profesor;
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
        if(estudiante){
            Scanner n = new Scanner(System.in);
            System.out.println("Bienvenido Estudiante");
            System.out.println("1.Listar recursos");
            System.out.println("2.Salir");
            int opc = n.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Lista de los Recursos");
            }
            
        }else if (biblioteca){
            System.out.println("Bienvenido Bibliotecario");
        }else if(profesor){
            System.out.println("Bienvenido profesor");
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
    
}
