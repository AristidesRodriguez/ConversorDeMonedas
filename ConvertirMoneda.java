import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaObjetivo, ConsultarMoneda consulta, Scanner text){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaObjetivo);
        System.out.println("La tasa de conversion para hoy\nl " + monedaBase + "=" + monedas.conversion_rate() + " " +monedaObjetivo);
        System.out.println("Ingrese el valor que desea convertir: " + monedaBase);
        cantidad = Double.parseDouble(text.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor de "+cantidad + " " + monedaBase + " corresponde al valor final de =>>> " + cantidadConvertida + " " + monedas.target_code());
    }
 }
