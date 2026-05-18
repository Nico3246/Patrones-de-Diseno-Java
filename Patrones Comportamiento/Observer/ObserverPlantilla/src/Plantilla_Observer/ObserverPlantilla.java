package Plantilla_Observer;

import java.util.Scanner;

public class ObserverPlantilla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sujeto sujetoConcreto = new SujetoConcreto();
        Observador obser = new ObservadorConcreto();
        Observador obser2= new ObservadorConcreto2();
        String accion;
        String lugar;
        
        System.out.println("Registrar los observadores");
        sujetoConcreto.registrarObservador(obser);
        sujetoConcreto.registrarObservador(obser2);
        
        System.out.println("Indique accion: ");
        accion = sc.nextLine();
        
        System.out.println("Indique un lugar");
        lugar = sc.nextLine();
        
        sujetoConcreto.ejecutaAccion(accion, lugar);
    }
    
}
