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
public class Ordenador {
    Marcianos marcianos;
    
    Ordenador()
    {
        marcianos=Marcianos.obtener_marcianos();
    }
    
    public void nuevos_marcianos()
    {
        Random rand = new Random();
        int nuevos = rand.nextInt(10);
        marcianos.creamarcianos(nuevos);
    }
}
