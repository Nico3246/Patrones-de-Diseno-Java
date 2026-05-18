package Plantilla_Observer;

import java.util.ArrayList;


public class SujetoConcreto implements Sujeto{

    private String accion;
    private String lugar;
    
    private ArrayList<Observador> observadores;
    
    public SujetoConcreto(){
        observadores = new ArrayList<Observador>();
    }
    
    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void retirarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void ejecutaAccion(String accion, String lugar) {
        this.accion = accion;
        this.lugar = lugar;
        notifica();
    }

    @Override
    public void notifica() {
        for(Observador o:observadores){
            o.actualizar(accion, lugar);
        }
    }
    
}
