package Plantilla_Observer;


public class ObservadorConcreto implements Observador{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Soy observador concreto con la accion " + accion + " en el lugar " + lugar);
    }
    
}
