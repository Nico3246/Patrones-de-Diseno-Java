/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonmarcianos.ejemplo1;
import java.util.Scanner;
/**
 *
 * @author nicob
 */
public class SingletonMarcianosEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int disparos=-1;
        
        Scanner sc=new Scanner(System.in);
        Ordenador ord=new Ordenador();
        Jugador jug = new Jugador();
        Marcianos marcianos=Marcianos.obtener_marcianos();//trabajamos siempre sobre la misma instancia de clase
        
        System.out.println("Comenzar el juego \n");
        
        while(disparos != 0 && marcianos.cuantos_marcianos_quedan()>0)
        {
            System.out.println("¿Cuantos disparos vas a realizar?");
            disparos=sc.nextInt();
            jug.destruir_Marcianos(disparos);
            ord.nuevos_marcianos();
        }
        
        
    }
    
}
