package Ejemplo_Observer;


public interface ISensor {
    public void saltarAlarma(String tipo);
    
    public void agregarObservador(IObservador o);
    public void eliminarObservador(IObservador o);
    public void notificaObservadores();
}
