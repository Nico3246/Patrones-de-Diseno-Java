
package ejemplo_adapter;

public class ResultadoPago {
    private boolean exito;
    private String mensaje;

    public ResultadoPago(boolean exito, String mensaje) {
        this.exito = exito;
        this.mensaje = mensaje;
    }
    
    public String mostrarResultado()
    {
        if(exito)
            return mensaje;
        else
            return "Se ha producido un error "
                    + "y no se realizo el pago";
    }
}
