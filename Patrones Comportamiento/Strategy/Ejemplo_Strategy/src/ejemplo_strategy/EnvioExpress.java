/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_strategy;

/**
 *
 * @author nicob
 */
public class EnvioExpress implements EstrategiaEnvio{

    private static final double BASE_RATE=20.0;
    private static final double RATE_PER_KG=4.0;
    
    @Override
    public double calculo(double peso, String destino) {
        System.out.println("Estamos usando las estrategia express a " + destino);
        return BASE_RATE + RATE_PER_KG * peso;
    }
    
}
