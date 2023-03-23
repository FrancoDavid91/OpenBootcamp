package Curso_de_Java_Básico.Ejercicio4;

public class SmartDevice {
    //atributos
    String color;
    String modelo;
    double precio;
    boolean garantia;
    
    //constructor
    public SmartDevice() {
    }

    public SmartDevice(String color, String modelo, double precio, boolean garantia) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.garantia = garantia;
    }
    
    //getter & setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
    
}
