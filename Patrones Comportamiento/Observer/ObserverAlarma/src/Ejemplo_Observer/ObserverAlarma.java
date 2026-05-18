package Ejemplo_Observer;


public class ObserverAlarma {

    public static void main(String[] args) {
        ISensor casa = new Sensor();
        IObservador policia = new Policia();
        IObservador bomberos = new Bomberos();
        IObservador proteccionCivil = new ProteccionCivil();
        
        casa.agregarObservador(policia);
        casa.agregarObservador(bomberos);
        casa.agregarObservador(proteccionCivil);
        casa.saltarAlarma("INCENDIO");
        
        casa.eliminarObservador(bomberos);
        casa.eliminarObservador(proteccionCivil);
        casa.agregarObservador(bomberos);
        casa.saltarAlarma("OKUPA");
        
        
        
    }
    
}
