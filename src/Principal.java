import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("******************************************\n" +

                    "Bienvenidos al programa convsersor de monedas de todo el mundo\n\n" +
                    "Por favor, Ingresa la opción de conversión que desear realizar\n\n" +
                    "1. De dolar americano a pesos colombianos\n" +
                    "2. De pesos colombianos a dolares americanos\n" +
                    "3. De Euros a pesos colombianos\n" +
                    "4. De pesos colombianos a pesos Euros\n" +
                    "5. De Pesos argentinos a pesos colombianos\n" +
                    "6. De pesos colombianos a pesos argentinos\n" +
                    "7. Convertir otra moneda\n" +
                    "8. salir");

            System.out.println("******************************************\n");
            System.out.print("Ingrese una Opción: ");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("EUR", "COP", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("COP", "EUR", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("ARS", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "ARS", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Muchas gracias por utilizar el programa. Que tenga un excelente dia");
                    break;
                default:
                    System.out.println("Ha escogido una opción inválida, intente nuevamente");
            }
        }
    }
}
