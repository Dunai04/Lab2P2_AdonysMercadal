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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menu
        Scanner n = new Scanner(System.in);
        String usuario;
        String contrasena;
        boolean login = true;
        while(login){
            System.out.println("Ingrse Usuario");
            usuario = n.nextLine();
            if(usuario == "adonys@gmail.com"||usuario == "venus@gmail.com"||usuario== "irene@gmail.com"){
               System.out.println("Ingrese contrasena");
            contrasena = n.nextLine(); 
            if(contrasena=="Dunai04"){
                
            }else if(contrasena=="Venas10"){
                
            }else if(contrasena=="Irenex92"){
                
            
        }else{
                System.out.println("El ususario no existe");
            }
    }
    
}
    }