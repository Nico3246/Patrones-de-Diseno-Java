/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_adapter;

/**
 *
 * @author nicob
 */
public class Adaptado implements InterfazObjetivo{
    
    private Adapter adaptado; //podriamos tener mas objetos

    public Adaptado(Adapter adaptado) {
        this.adaptado=adaptado;
    }

    @Override
    public void solicita() {
        adaptado.solicitudEspecifica(true);
    }
    
    
}
