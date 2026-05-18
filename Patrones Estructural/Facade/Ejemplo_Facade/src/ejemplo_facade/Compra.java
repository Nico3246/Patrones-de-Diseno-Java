
package ejemplo_facade;

import java.util.Scanner;

public class Compra {
    String producto;
    Scanner sc = new Scanner(System.in);
    
    public String realizarCompra()
    {
        int eleccion;
        System.out.println("¿Que desea comprar?\n 1.Portatil\n" 
                           + "2. PC\n 3. Impresora");
        eleccion=sc.nextInt();
        while(eleccion<1 || eleccion>3)
        {
            System.out.println("Error, entre 1 y 3");
            eleccion=sc.nextInt();
        }
        
        
        switch(eleccion){
            case 1:
                producto = "Portatil";
                break;
                
            case 2:
                producto = "PC";
                break;
                
            case 3:
                producto = "PC";
                break;

        }
        return producto;
    }
}
