/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_factorymethod;

/**
 *
 * @author nicob
 */
public class ProductoConcreto1 extends Producto{
    String Datos_Concretos1 = "Soy el producto concreto 1";
    
    
    public ProductoConcreto1(){
        
    }
    
    @Override
    public String tipo_Producto(){
        return Datos_Concretos1;
    }
}
