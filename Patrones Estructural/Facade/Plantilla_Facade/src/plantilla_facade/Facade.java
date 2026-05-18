
package plantilla_facade;

public class Facade implements I_Facade{
    private I_Clase1 c1;
    private I_Clase2 c2;
    private I_Clase3 c3;

    public Facade(){//los objetos dse pueden apsar en el constructor o crearles nuevo en el constructor como en este caso
        this.c1=new Clase1();
        this.c2=new Clase2();
        this.c3=new Clase3();

    }
    
    @Override
    public void realizarOperaciones()
    {
        c1.operacion1();
        c2.operacion2();
        c3.operacion3();
    }
}
