/*original
package conversion_singleton;

public class Conversion_Singleton {
    public static void main(String[] args) {
        
        ConexionBD db1=new ConexionBD();
        
        db1.executeQuery("SELECT * FROM usuarios");
        
        ConexionBD db2=new ConexionBD();
        db2.executeQuery("INSERT INTO productos");
        
        System.out.println(db1==db2);
    }
    
}
*/


/*convertido:*/

package conversion_singleton;

public class Conversion_Singleton {
    public static void main(String[] args) {
       
        ConexionBD db1=ConexionBD.getInstance();
        db1.executeQuery("SELECT * FROM usuarios");
        
        ConexionBD db2=ConexionBD.getInstance();
        db2.executeQuery("INSERT INTO productos");
        
        System.out.println(db1==db2);
    }
}