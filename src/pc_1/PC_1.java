/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc_1;

import java.util.ArrayList;

/**
 *
 * @author FAMILIA
 */
public class PC_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Pera");
        
        System.out.println("Fruta con posicion 1: " + frutas.get(1));
        
          frutas.set(0,"Manzana Verde");
          frutas.remove("Platano");
        
         System.out.println("Tamaño: " +frutas.size());
        
         for (String Fs:frutas)
        {
           System.out.println("LAS FRUTAS SON: " + Fs);
        }
        ArrayList <String> refrescos =new  ArrayList<>();
        refrescos.add("COCA COLA");
        refrescos.add("INKA COLA");
        refrescos.add("GUARANA");
        refrescos.add("SPRITE");
        
        refrescos.remove("GUARANA");
        
         for (String Re:refrescos)
        {
           System.out.println("Los refrescos son: " + Re);
        }
    }
    
}
