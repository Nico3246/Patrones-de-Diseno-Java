/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_strategy;

import java.util.Scanner;

public class Ejemplo_Strategy {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opcion;
        double peso = 0.0;
        String destino = "Sin destino";
        Envio envio = null;
        
        do{
            System.out.println("Menu");
            System.out.println("1- Estandar" + "\n2- Express" + "\n3- Nocturno" + "\n4- Salir");
            System.out.println("Elija juna opcion: ");
            
            opcion = sc.nextInt();
            
            System.out.println("Introduzca el peso: ");
            peso = sc.nextDouble();
            System.out.println("Introduzca el destino: ");
            destino = sc2.nextLine();
            
            
            switch (opcion) 
            {
                case 1:
                    if(envio == null)
                        envio = new Envio(new EnvioEstandar());
                    else
                        envio.setEstrategia(new EnvioEstandar());
                    break;
                
                case 2: 
                    if(envio == null)
                        envio = new Envio(new EnvioExpress());
                    else
                        envio.setEstrategia(new EnvioExpress());
                    break;
                case 3:
                    if(envio == null)
                        envio = new Envio(new EnvioNocturno());
                    else
                        envio.setEstrategia(new EnvioNocturno());
                    break;
                default:
                    throw new AssertionError();
            }
            
            System.out.println("El resultado es " + envio.calculoCosteEnvio(peso, destino));
        }while(opcion != 4);
    }
    
}
