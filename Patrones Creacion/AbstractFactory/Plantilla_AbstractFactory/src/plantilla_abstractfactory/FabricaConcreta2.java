
package plantilla_abstractfactory;

public class FabricaConcreta2 implements FabricaAbstracta {

    @Override
    public ProductoAbstractoB creaProductoB(String modelo, String estilo, int ano, double precio) {
        return new ProductoB2(modelo, estilo, ano, precio);
    }

    @Override
    public ProductoAbstractoA creaProductoA(String modelo, String estilo, int ano) {
        return new ProductoA2(modelo, estilo, ano);
    }
    
}
