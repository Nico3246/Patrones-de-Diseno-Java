/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_decorator;

/**
 *
 * @author nicob
 */
public class ComponenteConcreto implements I_ComponenteAbstracto{

    private String descripcion = "Base ";
    private int numeroDecoradores=0;
    
    @Override
    public void operacion() {
        System.out.println("Componente concreto: " + descripcion);
    }

    @Override
    public int getNumeroDecoradores() {
        return numeroDecoradores;
    }
    
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
}
