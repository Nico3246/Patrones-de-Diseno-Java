/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */

//hace como una cola
public class IteratorConcreto implements Iterator{

    private int numeros[];
    private int posicion;
    
    IteratorConcreto(int num[])
    {
        numeros=num;
        posicion=0;//porque vamos a recorrerlo como una cola
    }
    
    
    @Override
    public Object siguiente() {
        if(posicion<numeros.length)
            return numeros[posicion++];
        else
        {
            System.out.println("Ya no quedan numeros");
            return null;
        }
            
       
    }

    @Override
    public Object anterior() {
        if(posicion>0)
            return numeros[--posicion];
        else
        {
            System.out.println("No tiene anterior");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(posicion<numeros.length)
            return true;
        else
            return false;
    }
    
}
