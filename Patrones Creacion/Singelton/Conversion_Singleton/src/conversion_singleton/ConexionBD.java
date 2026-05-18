/*original
package conversion_singleton;

public class ConexionBD {
    ConexionBD()
    {
        System.out.println("Conexion con la BD establecida");
    }
    
    public void executeQuery(String sql)
    {
        System.out.println("Ejecutando consulta " + sql);
    }
}
*/


/*convertido:*/
package conversion_singleton;

public final class ConexionBD { //la clase debe ser final
    
    private static ConexionBD instance;//instancia del objeto del mismo tipo de la clase
    
    private ConexionBD()
    {
        System.out.println("Conexion con la BD establecida");
    }
    
    public static ConexionBD getInstance()
    {
        if(instance == null)
            instance=new ConexionBD();//tambien es valido hacerlo en la linea 23 y aqui solo devolverlo 
       
        return instance;
    }
    
    public void executeQuery(String sql)
    {
        System.out.println("Ejecutando consulta " + sql);
    }
}

