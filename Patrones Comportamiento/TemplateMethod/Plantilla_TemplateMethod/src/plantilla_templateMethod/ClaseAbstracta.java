/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_templateMethod;

/**
 *
 * @author nicob
 */
public abstract class ClaseAbstracta {
    public final void templateMethod()
    {
        operacion_madre1();//invariante
        operacion_hijas();//varia
        operacion_madre2();//invariante
    }
    
    private void operacion_madre1()
    {
        System.out.println("Operacion madre 1...");
    }
    
    private void operacion_madre2()
    {
        System.out.println("Operacion madre 2...");
    }
    
    protected abstract void operacion_hijas();
}
