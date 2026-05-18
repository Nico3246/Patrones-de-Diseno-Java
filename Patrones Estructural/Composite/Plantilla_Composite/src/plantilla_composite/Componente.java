/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_composite;

/**
 *
 * @author nicob
 */
public abstract class Componente {
    protected int n_elementos;

    public abstract void solicita();
    public abstract boolean agregaHoja(Componente hoja);
    public abstract boolean suprimeHoja(Componente hoja);
    
   
    
    
}
