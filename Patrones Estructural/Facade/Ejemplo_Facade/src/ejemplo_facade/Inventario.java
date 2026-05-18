/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_facade;

/**
 *
 * @author nicob
 */
public class Inventario {
    public boolean verificarStock(String producto){
        System.out.println("Verificando Stock " + producto);
        System.out.println("Hay stock");
        return true;
    }
}
