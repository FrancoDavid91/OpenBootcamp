package Introduccion_a_la_programacion;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numeroIf = 1;
        int numeroWhile = 0;
        String estacion = "verano";

        if (numeroIf > 0) {
            System.out.println("Número positivo.");
        } else if (numeroIf < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número cero.");
        }

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es otoño");

        }
    }
}
