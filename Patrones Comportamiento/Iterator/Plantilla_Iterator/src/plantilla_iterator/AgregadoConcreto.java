/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */


public class AgregadoConcreto implements Agregado{

    private int numeros[];
    private int posicion;

    public AgregadoConcreto() {
        numeros = new int[7];
        posicion=0;
    }
       
    
    @Override
    public void agregar(int elemento) {
        numeros[posicion++] = elemento;
    }

    @Override
    public Iterator CrearIterador() {
        return new IteratorConcreto(numeros);
    }

    @Override
    public Iterator CrearIterador2() {
        return new IteratorConcreto2(numeros);
    }
}
