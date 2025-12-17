package MetodosPago;

public class Efectivo implements ITipoPago{

    @Override
    public double pagar(double importe) {
        System.out.format("Añadiendo a la caja %d €", importe);
        return importe;
    }
}
