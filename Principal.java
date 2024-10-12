import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       int opcion = 0;
        Scanner text = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        //*********************************************

        while (opcion !=7) {
            System.out.println(" ");
            System.out.println("CHALLENGE CONVERTIDOR DE MONEDAS");
            System.out.println("1) Dolar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");

            System.out.println("Digita la opcion: ");


            //Scanner text = new Scanner(System.in);
            opcion = text.nextInt();
            text.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,text);
                    //System.out.println("Dolar =>> Peso Argentino");
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,text);
                    //System.out.println("Peso Argentino =>> Dolar");
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,text);
                    //System.out.println("Dolar =>> Real Brasilero");
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,text);
                    //System.out.println("Real Brasilero =>> Dolar");
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,text);
                    //System.out.println("Dolar =>> Peso Colombiano");
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,text);
                    //System.out.println("Peso Colombiano =>> Dolar");
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
