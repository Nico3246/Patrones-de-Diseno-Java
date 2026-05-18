
package plantilla_abstractfactory;


public abstract class ProductoAbstractoB {
    
    protected String modelo;
    protected String estilo;
    protected int ano;
    protected double precio;

    
    public ProductoAbstractoB(String modelo, String estilo, int ano, double precio) {
        this.modelo = modelo;
        this.estilo = estilo;
        this.ano = ano;
        this.precio = precio;
    }
    
    
    public abstract void mostrarCaracteristicas();
    
    
    
}
