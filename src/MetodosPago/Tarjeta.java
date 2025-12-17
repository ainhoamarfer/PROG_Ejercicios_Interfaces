package MetodosPago;

public class Tarjeta implements ITipoPago{

    private static final double COMISION = 0,02d;

    @Override
    public double pagar(double importe) {
        System.out.println("Conectándose con el banco por pasarela segura\no Pago realizado con éxito\n");
        return importe - importe * COMISION;
    }
}
