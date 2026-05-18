/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_factorymethod;

/**
 *
 * @author nicob
 */
public class CreadorConcreto2 extends Creador {
    private String tipo = "Tipo 2";
    
    public CreadorConcreto2(){
        
    }
    
    @Override
    public Producto factory_Method(){
        System.out.println("Vamos a crear un producto");
        return new ProductoConcreto2();
    }
}
