package Ejemplo_Observer;


public class Bomberos implements IObservador{

    @Override
    public void actualiza() {
        System.out.println("Bomberos recibe alarma");
    }
    
}
