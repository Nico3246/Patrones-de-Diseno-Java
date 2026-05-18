
package ejemplo_adapter;


public class SolicitudExterna {
    private double importe;
    private String moneda;
    private String numeroTarjeta;

    public SolicitudExterna(double importe, String moneda, String numeroTarjeta) {
        this.importe = importe;
        this.moneda = moneda;
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getImporte() {
        return importe;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    
    
    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
    
}
