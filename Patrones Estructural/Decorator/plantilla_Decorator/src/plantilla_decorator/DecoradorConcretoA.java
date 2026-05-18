/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_decorator;

/**
 *
 * @author nicob
 */
public class DecoradorConcretoA extends Decorador{
    
    private String mensajeExtra="Decorador A";
    private int numeroDecoradores;
    
    public DecoradorConcretoA(I_ComponenteAbstracto componente) {
        super(componente);
        this.numeroDecoradores=componente.getNumeroDecoradores()+1;
    }

    @Override
    public void operacion() {
        super.operacion();
        System.out.println(" + " + mensajeExtra);
    }

    @Override
    public int getNumeroDecoradores() {
        return numeroDecoradores;
    }
    
    public String getMensajeExtra()
    {
        return mensajeExtra;
    }
    
    
    
    
}
