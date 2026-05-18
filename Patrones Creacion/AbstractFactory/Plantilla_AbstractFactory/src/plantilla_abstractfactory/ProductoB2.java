/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_abstractfactory;

/**
 *
 * @author nicob
 */



public class ProductoB2 extends ProductoAbstractoB{

    public ProductoB2(String modelo, String estilo, int ano, double precio) {
        super(modelo, estilo, ano, precio);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Producto tipo B2: " + modelo + " de estilo " + estilo + " del año " + ano + precio + " millones de euros");
    }
}
