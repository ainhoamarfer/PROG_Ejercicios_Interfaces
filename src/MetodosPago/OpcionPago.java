package MetodosPago;

public enum OpcionPago {
    EFECTIVO("Efectivo"), BIZUM("Bizum"), TARJETA("Tarjeta");

    private String text;

    OpcionPago(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
