/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_templatemethod;

/**
 *
 * @author nicob
 */
public abstract class ClaseAbstractaIVA {
    protected double importeSinIVA;
    protected double importeConIVA;
    protected double cantidad;
    protected double precio;
    
    //operacion madre inicial
    private void calculaImporteSinIVA()
    {
        importeSinIVA=precio*cantidad;
    }
    
    //operaciones hijas
    protected abstract void calculaImporteConIVA();//es el q varia dependiendo de la nacionalidad
    
    //operacion madre final
    private void visualiza()
    {
        System.out.println("Importes del pedido");
        System.out.println("Importe sin IVA: " + importeSinIVA);
        System.out.println("Importe con IVA: " + importeConIVA);
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //templete method 
    public final void calculaImporteFinal()
    {
        calculaImporteSinIVA();
        calculaImporteConIVA();
        visualiza();
    }
}
