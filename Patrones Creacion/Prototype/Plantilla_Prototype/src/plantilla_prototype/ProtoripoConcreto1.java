
package plantilla_prototype;


public class ProtoripoConcreto1 implements Prototipo{

    private String nombre = "Prototipo numero 1";
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String n) {
        nombre = n;
    }

    @Override
    public Prototipo clonar() {
        Prototipo prototipo = new ProtoripoConcreto1();
        prototipo.setNombre(this.nombre);
        return prototipo;   
    }
    
}
