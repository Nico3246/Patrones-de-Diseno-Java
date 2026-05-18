
package ejemplo_adapter;

public class RespuestaExterna {
    
    private String status;
    private String detalle;

    public RespuestaExterna(String status, String detalle) {
        this.status = status;
        this.detalle = detalle;
    }

    
    
    public String getStatus() {
        return status;
    }

    public String getDetalle() {
        return detalle;
    }

    
    
    public void setStatus(String status) {
        this.status = status;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
