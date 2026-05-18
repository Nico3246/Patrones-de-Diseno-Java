package plantilla_prototype;

public class PrototipoConcreto2 implements Prototipo{
    
    private String nombre = "Prototipo numero 2";
    
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
