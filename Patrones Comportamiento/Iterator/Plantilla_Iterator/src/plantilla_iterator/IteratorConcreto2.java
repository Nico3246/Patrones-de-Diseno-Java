/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */

//hace como una pila
public class IteratorConcreto2 implements Iterator{

    private int numeros[];
    private int posicion;
    
    IteratorConcreto2(int num[])
    {
        numeros=num;
        posicion=num.length-1;//porque vamos a recorrerlo como una pila
    }
    
    @Override
    public Object siguiente() {
        if(posicion>=0)
            return numeros[posicion--];
        else
        {
            System.out.println("No quedan elementos");
            return null;
        }
    }

    @Override
    public Object anterior() {
        if(posicion<numeros.length)
            return numeros[++posicion];
        else
        {
            System.out.println("No tiene anterior");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(posicion>=0)
                return true;
        else
            return false;
                
    }
    
}
