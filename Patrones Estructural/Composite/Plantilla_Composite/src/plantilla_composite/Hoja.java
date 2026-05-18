/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_composite;

/**
 *
 * @author nicob
 */
public class Hoja  extends Componente{

    String nombre;
    
    public Hoja(String n)
    {
        nombre=n;
    }
    
    @Override
    public void solicita() {
        System.out.println("Solicita la operacion " + nombre);
    }

    @Override
    public boolean agregaHoja(Componente hoja) {
        return false;
    }

    @Override
    public boolean suprimeHoja(Componente hoja) {
        return false;
    }
    
}
