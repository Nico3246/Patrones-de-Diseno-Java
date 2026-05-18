/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */

//equivalente a agregadoConcreto
public class ListaPalabras implements I_ListaPalabras{
    private String palabras[];
    private int posicion;
    
    ListaPalabras()
    {
        palabras = new String[7];
        posicion = 0;
    }

    @Override
    public void agregar(String p) {
        palabras[posicion++]=p;
    }
    
    @Override
    public ListaPalabrasIterator CrearIterador()
    {
        return new ListaPalabrasIterator(palabras);
    }
}
