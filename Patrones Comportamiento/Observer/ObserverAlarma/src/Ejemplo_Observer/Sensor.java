package Ejemplo_Observer;

import java.util.ArrayList;

public class Sensor implements ISensor{

    private ArrayList<IObservador> observadores;
    
    public Sensor(){
        observadores = new ArrayList<IObservador>();
    }
    
    @Override
    public void saltarAlarma(String tipo) {
        System.out.println("Hay una alarma de tipo " + tipo);
        notificaObservadores();
    }

    @Override
    public void agregarObservador(IObservador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }

    @Override
    public void notificaObservadores() {
        for(IObservador o:observadores){
            o.actualiza();
        }
    }
    
}
