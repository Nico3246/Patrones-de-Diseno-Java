/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofactory;

/**
 *
 * @author nicob
 */
public class Conexion_Mysql extends Conexion {
    
    public Conexion_Mysql(){
        
    }
    
    @Override
    public String Descripcion(){
        return "Conexion Mysql";
    }
    
}
