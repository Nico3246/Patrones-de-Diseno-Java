/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_ejemplo_strategy;
import java.util.Scanner;
/**
 *
 * @author nicob
 */
public class Ejercicio_Ejemplo_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array [] = {1,2,3,4,58,3,4,9};
               
        SortStrategy estrategia;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige un metodo para ordenar, 1- Selection   2- Buble");;
        int opc=sc.nextInt();
        
        if(opc==1)
        {
            estrategia=new SelectionSort();
        }
        else
            estrategia = new BubleSort();
        
        estrategia.sort(array);
        
        for(int i : array)
        {
            System.out.println(i);
        }
    }
    
}
