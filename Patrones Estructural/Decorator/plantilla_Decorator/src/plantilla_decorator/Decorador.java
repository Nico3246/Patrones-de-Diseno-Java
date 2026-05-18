/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_decorator;

/**
 *
 * @author nicob
 */
public abstract class Decorador implements I_ComponenteAbstracto{
    protected  I_ComponenteAbstracto componente;

    public Decorador(I_ComponenteAbstracto componente) {
        this.componente = componente;
    }

    @Override
    public int getNumeroDecoradores()
    {
        return componente.getNumeroDecoradores();
    }

    @Override
    public void operacion()
    {
        componente.operacion();
    }
    
    
}
