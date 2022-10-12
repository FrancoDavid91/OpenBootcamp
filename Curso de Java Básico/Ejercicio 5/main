package Curso_de_Java_Básico.Ejercicio5;

public class Main {
                
    public static void main(String[] args) {
           
        Coche coche1 = new Coche("Fiat", 2008, "rojo", false);
        Coche coche2 = new Coche("Chevrolet", 2017, "negro", true);
        Coche coche3 = new Coche("Audi", 2022, "blanco", true);
        
        System.out.println("COCHES:");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        
        System.out.println("\n"+"GUARDAR ESTOS COCHES EN UN ARRAYLIST");
        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.save(coche3);
        System.out.println("\n"+"MOSTRAR LOS COCHES GUARDADOS (ALL)");
        cocheCrud.fillAll();
        System.out.println("\n"+"FUNCION BORRAR --> COCHE 2");
        cocheCrud.delete(coche2);
        System.out.println("\n"+"MOSTRAR LA NUEVA LISTA GUARDADA (FINAL)");
        cocheCrud.fillAll();
        
    }
}
