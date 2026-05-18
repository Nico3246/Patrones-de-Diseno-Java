
package plantilla_abstractfactory;


public abstract class ProductoAbstractoA {
    protected String modelo;
    protected String estilo;
    protected int ano;

    public ProductoAbstractoA(String modelo, String estilo, int ano) {
        this.modelo = modelo;
        this.estilo = estilo;
        this.ano = ano;
    }
    
    public abstract void mostrarCaracteristicas();
}
