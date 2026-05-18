
package plantilla_abstractfactory;


public interface FabricaAbstracta {
    ProductoAbstractoB creaProductoB(String modelo,String estilo, int ano, double precio);
    ProductoAbstractoA creaProductoA(String modelo, String estilo, int ano);
    //se crean tantos como tipos tengamos
    
    
}
            
