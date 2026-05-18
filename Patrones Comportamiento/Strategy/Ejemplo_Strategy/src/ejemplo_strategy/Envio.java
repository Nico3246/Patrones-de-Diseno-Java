/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_strategy;

/**
 *
 * @author nicob
 */
public class Envio {
   private EstrategiaEnvio estrategia;

    public Envio(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }
   
    
    public void setEstrategia(EstrategiaEnvio estrategia)
    {
        this.estrategia = estrategia;
    }
    
    
    public double calculoCosteEnvio(double peso, String destino)
    {
        return estrategia.calculo(peso, destino);
    }
   
}
