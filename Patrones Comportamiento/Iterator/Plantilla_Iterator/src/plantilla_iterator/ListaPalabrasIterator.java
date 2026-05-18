/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */


public class ListaPalabrasIterator implements Iterator{
    
    private String palabras[];
    private int posicion=0;
    
    ListaPalabrasIterator(String p[])
    {
        palabras=p;
    }
    
    @Override
    public Object siguiente() {
        if(posicion < palabras.length)
            return palabras[posicion++];
        else
        {
            System.out.println("No quedan palabras");
            return null;
        }
    }

    @Override
    public Object anterior() {
        if(posicion>0)
            return palabras[--posicion];
        else
        {
            System.out.println("No queda anterior");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(posicion<palabras.length)
            return true;
        else
            return false;
    }
    
}
