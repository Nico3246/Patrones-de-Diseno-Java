/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_abstractfactory;

/**
 *
 * @author nicob
 */
public class ProductoA1 extends ProductoAbstractoA{

    public ProductoA1(String modelo, String estilo, int ano) {
        super(modelo, estilo, ano);
    }
    

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("\nProducto tipo A1 " + modelo + "de estilo " + estilo + " del año " + ano);
    }
    
}
