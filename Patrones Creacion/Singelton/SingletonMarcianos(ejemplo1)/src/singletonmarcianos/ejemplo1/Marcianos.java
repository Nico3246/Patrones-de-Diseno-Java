/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonmarcianos.ejemplo1;

/**
 *
 * @author nicob
 */
public final class Marcianos {
    private static final Marcianos marcianos = new Marcianos();
    private static int n_marcianos;//indica el nunero de marcianos que tenemso en cada mometno
    
    private Marcianos()
    {
        n_marcianos=10;
    }
    
    public static Marcianos obtener_marcianos()
    {
        return marcianos;
    }
    
    public static void derriba_marcianos(int derribados)
    {
        if(n_marcianos>derribados)
            n_marcianos-=derribados;
        else
            n_marcianos=0;
        System.out.println("has matado " + derribados + " marcianos\n");
        System.out.println("Quedan " + n_marcianos + " marcianos\n");

    }
    
    public static void creamarcianos(int creados)
    {
        if(n_marcianos>0)
            n_marcianos+=creados;
        System.out.println("has creado " + creados + " marcianos\n");
        System.out.println("Quedan " + n_marcianos + " marcianos\n");
    }
    
    public static int cuantos_marcianos_quedan()
    {
        return n_marcianos;
    }
    
}
