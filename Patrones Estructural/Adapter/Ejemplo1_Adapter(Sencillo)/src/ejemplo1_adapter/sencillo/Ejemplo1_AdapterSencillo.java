/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1_adapter.sencillo;
import java.util.*;
/**
 *
 * @author nicob
 */
public class Ejemplo1_AdapterSencillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //antes del patron:
        Scanner sc=new Scanner(System.in);
        String forma;
        Adaptado adaptado=new Adaptado("Pepe");
        
        System.out.println("Como quieres mostrarlo? (MAYUSCULA/minuscula");
        forma=sc.nextLine();
        
        adaptado.mostrarNombre(forma);
        */
        
        //con el patron
        Scanner sc=new Scanner(System.in);
        int forma;
        Adaptado adaptado=new Adaptado("Pepe");
        
        System.out.println("Como quieres mostrarlo? (1.MAYUSCULA/2.minuscula)");
        forma=sc.nextInt();
        
        //adaptado.mostrarNombre(forma);//da error por lo que la nueva interfaz necesita que se lea como entero pero no podemos tocar adaptado
    
        //se ha creado la clase Adaptador y I_Objetivo
        
        Adaptador adaptador = new Adaptador(adaptado);
        adaptador.mostrarNombre(forma);
        
        
    }
    
}
