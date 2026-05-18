/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploiterator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nicob
 */
public class PlaylistIteradorAleatorio implements Iterador{

    private ArrayList<Cancion> canciones = new ArrayList<>();
    private Random rand = new Random();
    int num;
    
    PlaylistIteradorAleatorio(ArrayList<Cancion> c)
    {
        canciones=c;
        num = rand.nextInt(c.size());
    }
    
    @Override
    public Object siguiente() {
        if(num<canciones.size())
            return canciones.get(num++);
        else
        {
            System.out.println("Ya no quedan numeros");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(num<canciones.size())
            return true;
        else
            return false;
    }
    
}
