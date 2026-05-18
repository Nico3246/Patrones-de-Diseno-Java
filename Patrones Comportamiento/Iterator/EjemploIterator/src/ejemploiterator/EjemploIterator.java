/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploiterator;


//ARREGLAR
/**
 *
 * @author nicob
 */
public class EjemploIterator {

    public static void main(String[] args) {
        PlayList p = new PlayList();
        
        p.agregarCancion(new Cancion("Imagine ", "John Lennon"));
        p.agregarCancion(new Cancion("Bohemian Rhapsody ", "Queen"));
        
        Iterador it_a = p.crearIteradorAleatorio();
        Iterador it = p.crearIterador();
        
        System.out.println("Vamos a sacar aleatorio");
        while(it_a.tieneSiguiente())
        {
            Cancion c=(Cancion) it_a.siguiente();
            System.out.println(c.getCancion());
        }
             
        System.out.println("Vamos a sacar en orden");
        while(it.tieneSiguiente())
        {
            Cancion c=(Cancion) it.siguiente();
            System.out.println(c.getCancion());
        }
        
        
    }
    
}
