package MetodosPago;

import java.util.Scanner;

public class Tienda{

    static Scanner sc = new Scanner(System.in);


    public static int menu() {
        System.out.println("¿Cómo prefieres pagar?");
        System.out.println("1. Efectivo");
        System.out.println("2. Bizum");
        System.out.println("3. Tarjeta");
        int opcion = -1;
        while (true) {
            System.out.println("Selecciona una opción");
            opcion = sc.nextInt();
            //Es para corregir un comportamiento raro en nextInt donde no consume el /n
            sc.nextLine();
            if (opcion >= 1 && opcion <= 7) {
                break;
            }

            System.err.println("Introduce una opción valida");
        }
        return opcion - 1;
    }

    public double importe(){
        double pago = 0;
        System.out.println("Cuál es la cantidad de pagas");
        pago = sc.nextDouble();
        return pago;
    }

    public void opcionMenu(double importe){
        int opcion;
        opcion = menu();
        OpcionPago option = OpcionPago.values()[opcion];
        while(true){
            if(opcion == OpcionPago.EFECTIVO){

            }

        }
    }

    public void comprar(ITipoPago tipoPago, double importe){
        double dineroTotal = tipoPago.pagar(importe);

    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        menu();
    }
}
