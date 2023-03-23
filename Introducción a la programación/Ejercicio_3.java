package Introduccion_a_la_programacion;


public class Ejercicio3 {

    public static void main(String[] args) {
        
        int resultado = suma(10, 20, 10);
        System.out.println(resultado);
        
        Coche miCoche = new Coche();
        miCoche.increaseNOD();
        System.out.println(miCoche.numbersOfDoors);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    int numbersOfDoors = 0;
    
    public void increaseNOD(){
        this.numbersOfDoors ++;
    }
}

