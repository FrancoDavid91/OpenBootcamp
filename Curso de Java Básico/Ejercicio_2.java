package Curso_de_Java_Básico;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //double price;
        System.out.println("ENTER PRICE:");
        Scanner enterPrice = new Scanner (System.in);
        double price = enterPrice.nextDouble();
        double price0=price;
        System.out.println("THE PRICE WITH 'IVA' IS:");
        System.out.println(totalPrice(price));
    }

    static double totalPrice(double price) {
        return price * 1.21;
    }
}
