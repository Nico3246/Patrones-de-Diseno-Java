/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_strategy;

/**
 *
 * @author nicob
 */
public class Entidad {
    private Strategy estrategia;
    
    public Entidad(Strategy estrategia)
    {
        this.estrategia = estrategia;
    }
    
    public void solicita()
    {
        estrategia.calcula();
    }
    
    public void setEstrategia(Strategy estrategia)
    {
            this.estrategia=estrategia;
    }
            
}
