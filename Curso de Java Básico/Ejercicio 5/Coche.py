package Curso_de_Java_Básico.Ejercicio5;

public class Coche {
    
    String modelo;
    int year;
    String color;
    boolean seguro;

    public Coche() {
    }

    public Coche(String modelo, int year, String color, boolean seguro) {
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "{modelo=" + modelo +
                ", year=" + year + ", color=" + color +
                ", seguro=" + seguro + '}';
    }
    
    
    
}
