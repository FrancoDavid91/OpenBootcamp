package Curso_de_Java_Básico;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Instancia de objetos y array
        Product productA = new Product();
        Product productB = new Product();
        Product productC = new Product();

        Product[] array_product = new Product[3];

        array_product[0] = productA;
        array_product[1] = productB;
        array_product[2] = productC;

        //Asignacion de valores
        String A = "ProductoA";
        String B = "ProductoB";
        String C = "ProductoC";
        productA.setName(A);
        productB.setName(B);
        productC.setName(C);
        int qA = 20;
        int qB = 0;
        int qC = 18;
        productA.setQuantity(qA);
        productB.setQuantity(qB);
        productC.setQuantity(qC);
        long codeA = 0037;
        long codeB = 0144;
        long codeC = 0054;
        productA.setCode(codeA);
        productB.setCode(codeB);
        productC.setCode(codeC);
        double wA = 13.5;
        double wB = 11.1;
        double wC = 8.5;
        productA.setWeight(wA);
        productB.setWeight(wB);
        productC.setWeight(wC);
        boolean availableA = true;
        boolean availableB = false;
        boolean availableC = true;
        productA.setAvailable(availableA);
        productB.setAvailable(availableB);
        productC.setAvailable(availableC);

        //Mostrar en pantalla datos
        System.out.println("PRODUCTO");
        for (int i = 0; i < array_product.length; i++) {
            System.out.println("Nombre: " + array_product[i].getName());
        }
        System.out.println("CÓDIGO");
        for (int i = 0; i < array_product.length; i++) {
            System.out.println("Número de Código: " + array_product[i].getCode());
        }
        System.out.println("STOCK");
        for (int i = 0; i < array_product.length; i++) {
            System.out.println("Cantidades: " + array_product[i].getQuantity());
        }
        System.out.println("PESOS");
        for (int i = 0; i < array_product.length; i++) {
            System.out.println("Kilogramos: " + array_product[i].getWeight());
        }
        System.out.println("EXISTENCIAS");
        for (int i = 0; i < array_product.length; i++) {
            System.out.println("Disponibilidad: " + array_product[i].isAvailable());
        }

    }
}

class Product {

    //Atributos
    private String name;
    private int quantity;
    private long code;
    private double weight;
    private boolean available;

    //Constructor
    public Product() {
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
