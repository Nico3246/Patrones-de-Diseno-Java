
package plantilla_abstractfactory;


public class ProductoB1 extends ProductoAbstractoB{

    public ProductoB1(String modelo, String estilo, int ano, double precio) {
        super(modelo, estilo, ano, precio);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Producto tipo B1: " + modelo + " de estilo " + estilo + " del año " + ano + precio + " millones de euros");
    }
}
