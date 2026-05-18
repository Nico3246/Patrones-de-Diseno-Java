/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_facade;

/**
 *
 * @author nicob
 */
//esta clase se crea al usar facade

public class Facade_Compra {
    public static final int PRECIOPORTATIL = 1000;
    public static final int PRECIOPC = 650;
    public static final int PRECIOIMPRESORA = 250;
    
    private Compra compra=new Compra();
    private Inventario inventario = new Inventario();
    private Pago pago = new Pago();
    private Envio envio = new Envio();

    String producto;
    int precio;
    
    Facade_Compra(){//aqui si fues encesario podemos pasar prametros
        
    }
    
    public void compraProducto()
    {
        producto = compra.realizarCompra();
        
        if(inventario.verificarStock(producto)){
            if(producto.equalsIgnoreCase("Portatil"))
                precio=PRECIOPORTATIL;
            else if(producto.equalsIgnoreCase("PC"))
                precio=PRECIOPC;
            else
                precio=PRECIOIMPRESORA;
            
            if(pago.procesarPago(precio)){
                envio.enviarProducto(producto);
                System.out.println("Compra realizada con exito");
            }
            else
                System.out.println("Error en el pago");
        }
        else
            System.out.println("Producto sin Stock");
    }
    
    
        
}
