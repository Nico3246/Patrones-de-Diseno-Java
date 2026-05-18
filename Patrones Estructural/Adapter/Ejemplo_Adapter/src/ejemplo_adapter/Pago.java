
package ejemplo_adapter;

//esta clase seria el cliente

public class Pago {
    
    private double importe;
    private String moneda;
    private String tarjeta;

    public Pago(double importe, String moneda, String tarjeta) {
        this.importe = importe;
        this.moneda = moneda;
        this.tarjeta = tarjeta;
    }

    public double getImporte() {
        return importe;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getTarjeta() {
        return tarjeta;
    }
    
    
}
