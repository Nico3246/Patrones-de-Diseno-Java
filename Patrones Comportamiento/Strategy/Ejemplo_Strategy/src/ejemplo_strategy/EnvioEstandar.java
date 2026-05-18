/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_strategy;

/**
 *
 * @author nicob
 */
public class EnvioEstandar implements EstrategiaEnvio{

    private static final double RATE_PER_KG=2.5;
    
    @Override
    public double calculo(double peso, String destino) {
        System.out.println("Estrategia envio estandar "+ destino);
        return RATE_PER_KG * peso;
    }
    
}
