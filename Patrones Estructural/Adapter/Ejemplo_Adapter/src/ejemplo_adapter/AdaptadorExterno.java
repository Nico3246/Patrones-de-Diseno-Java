
package ejemplo_adapter;


public class AdaptadorExterno implements I_ProcesadorPago{
    
    private ServicioPagoExterno servicioExterno;

    public AdaptadorExterno(ServicioPagoExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    
    
    @Override
    public ResultadoPago procesarPago(Pago pago) {
        //que hace:
        //1.-adaptar el modelo interno al externo
        SolicitudExterna solicitud = new SolicitudExterna(pago.getImporte(),pago.getMoneda(), pago.getTarjeta());
        
        //2.-Llamar al servicio externo
        RespuestaExterna respuesta = servicioExterno.hacerPago(solicitud);
        
        //3.-Adaptar la respuesta externa al modelo interno
        boolean exito="OK".equals(respuesta.getStatus());//si la respuesta q nos da la respuesta externa es OK el booleano se pone a true
        
        return new ResultadoPago(exito, respuesta.getDetalle());
    }
}
