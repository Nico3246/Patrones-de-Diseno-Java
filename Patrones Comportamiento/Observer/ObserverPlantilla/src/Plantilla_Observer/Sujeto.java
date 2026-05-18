package Plantilla_Observer;


public interface Sujeto {
    public void registrarObservador(Observador o);
    public void retirarObservador(Observador o);
    
    public void ejecutaAccion(String accion, String lugar);
    
    public void notifica();
}
