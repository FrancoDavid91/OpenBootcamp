package Curso_de_Java_Básico.Ejercicio4;

public class SmartWatch extends SmartDevice {

    String funcion;
    int memoria;

    public SmartWatch() {
    }

    public SmartWatch(String funcion, int memoria, String color, String modelo, double precio, boolean garantia) {
        super(color, modelo, precio, garantia);
        this.funcion = funcion;
        this.memoria = memoria;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}
