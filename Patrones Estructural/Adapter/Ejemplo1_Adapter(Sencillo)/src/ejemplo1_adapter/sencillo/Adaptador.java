/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_adapter.sencillo;

/**
 *
 * @author nicob
 */
public class Adaptador implements I_Objetivo{
    
    private Adaptado adaptado;

    public Adaptador(Adaptado adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void mostrarNombre(int forma) {
        if(forma==1)
            adaptado.mostrarNombre("MAYUSCULA");
        else
            adaptado.mostrarNombre("minuscula");
    }
}
