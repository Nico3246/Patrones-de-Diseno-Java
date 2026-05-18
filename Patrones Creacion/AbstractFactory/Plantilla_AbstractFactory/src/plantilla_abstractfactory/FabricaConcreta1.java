
package plantilla_abstractfactory;


public class FabricaConcreta1 implements FabricaAbstracta{

    @Override
    public ProductoAbstractoB creaProductoB(String modelo, String estilo, int ano, double precio) {
        return new ProductoB1(modelo, estilo, ano, precio);
    }

    @Override
    public ProductoAbstractoA creaProductoA(String modelo, String estilo, int ano) {
        return new ProductoA1(modelo, estilo, ano);
    }
    
    
}
