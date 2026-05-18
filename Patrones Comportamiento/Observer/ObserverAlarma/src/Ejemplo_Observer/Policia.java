package Ejemplo_Observer;


public class Policia implements IObservador{

    public Policia(){
        
    }
    
    @Override
    public void actualiza() {
        System.out.println("Policia recibe alarma");
    }
    
}
