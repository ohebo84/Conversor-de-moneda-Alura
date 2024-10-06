import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de cambio en el dia de hoy es: \n1 " + monedaBase + " = "
                + monedas.conversion_rate() + " " + monedaTarget);
        System.out.print("Ingrese la cantidad de " + monedaBase + " a convertir: ");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedaTarget);
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.print("Ingrese el código de la moneda Base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.print("Ingrese el código de la moneda a convertir: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
