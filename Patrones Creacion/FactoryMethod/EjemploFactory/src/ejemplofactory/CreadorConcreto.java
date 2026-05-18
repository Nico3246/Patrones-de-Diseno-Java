/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofactory;

/**
 *
 * @author nicob
 */
public class CreadorConcreto extends Creador{
   private String tipoConexion;
   
   public CreadorConcreto(String t){
        tipoConexion=t;
    }
   
   @Override
    public Conexion factory_Method(){//otra posibilidad es passar el tipo en factory_Method() en vez d en el constructor
        System.out.println("Vamos a crear un producto con la factoria");
        if(tipoConexion.equalsIgnoreCase("Tipo 1"))
            return new ConexionOracle();
        else
            return new Conexion_Mysql();
    }
}
