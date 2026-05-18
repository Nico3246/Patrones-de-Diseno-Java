
package ejemplo_adapter;


public class ServicioPagoExterno {
    public RespuestaExterna hacerPago(SolicitudExterna solicitud){
        //se simula
        if(solicitud.getImporte()>0)
            return new RespuestaExterna("OK","Pago aprobado");
        else
            return new RespuestaExterna("ERROR", "Cantidad no valida");
    }
}
