package MetodosPago;

public class Bizum implements ITipoPago{

    @Override
    public double pagar(double importe) {
        System.out.format("Enviando dinero %d a la cuenta de Bizum de la empresa");
        return importe;
    }
}
