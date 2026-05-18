
package ejemplo_facade;


//sin facade
/*
public class Ejemplo_Facade {

    public static final int PRECIOPORTATIL = 1000;
    public static final int PRECIOPC = 650;
    public static final int PRECIOIMPRESORA = 250;

    public static void main(String[] args) {
        Compra compra=new Compra();
        Inventario inventario = new Inventario();
        Pago pago = new Pago();
        Envio envio = new Envio();
        
        String producto;
        int precio;
        
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
*/
//con facade
public class Ejemplo_Facade {
    
    public static void main(String[] args) {
        Facade_Compra tienda = new Facade_Compra();
        tienda.compraProducto();
    }
    
}