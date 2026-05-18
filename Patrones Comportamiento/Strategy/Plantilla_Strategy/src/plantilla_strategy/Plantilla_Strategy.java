
package plantilla_strategy;


public class Plantilla_Strategy {

    public static void main(String[] args) {
        Entidad entidad = new Entidad(new StrategyConcretaA());
        entidad.solicita();
        
        entidad.setEstrategia(new StrategyConcretaB());
        entidad.solicita();

    }
    
}
