package Ejemplo_Observer;


public class ProteccionCivil implements IObservador{

    @Override
    public void actualiza() {
        System.out.println("Proteccion civil recibe alarma");
    }
    
}
