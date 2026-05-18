/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonmarcianos.ejemplo1;
import java.util.Random;
/**
 *
 * @author nicob
 */
public class Jugador {
    private Marcianos marcianos;
    
    Jugador()
    {
        marcianos=Marcianos.obtener_marcianos();
    }
    
    public void destruir_Marcianos(int derribados)
    {
        Random r= new Random();
        derribados-=r.nextInt(derribados);
        marcianos.derriba_marcianos(derribados);
    }
    
    
}
