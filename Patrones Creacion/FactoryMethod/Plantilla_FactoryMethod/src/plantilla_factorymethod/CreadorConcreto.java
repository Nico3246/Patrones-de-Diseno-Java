/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_factorymethod;

/**
 *
 * @author nicob
 */
public class CreadorConcreto extends Creador{
    private String tipo;
    
    public CreadorConcreto(String t){
        tipo=t;
    }
    
    @Override
    public Producto factory_Method(){//otra posibilidad es passar el tipo en factory_Method() en vez d en el constructor
        System.out.println("Vamos a crear un producto con la factoria");
        if(tipo.equalsIgnoreCase("Tipo 1"))
            return new ProductoConcreto1();
        else
            return new ProductoConcreto2();
    }
}
