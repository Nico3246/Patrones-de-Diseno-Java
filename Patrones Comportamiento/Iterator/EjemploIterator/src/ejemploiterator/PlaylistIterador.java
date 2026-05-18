/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploiterator;

import java.util.ArrayList;

/**
 *
 * @author nicob
 */
public class PlaylistIterador implements Iterador{
    private ArrayList<Cancion> canciones = new ArrayList<>();
    private int posicion;
    
    PlaylistIterador(ArrayList<Cancion> c)
    {
        canciones=c;
        posicion=0;
    }

    @Override
    public Object siguiente() {
        if(posicion<canciones.size())
            return canciones.get(posicion++);
        else
        {
            System.out.println("Ya no quedan numeros");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(posicion<canciones.size())
            return true;
        else
            return false;
    }
    
    
    
}
