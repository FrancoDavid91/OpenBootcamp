package Introduccion_a_la_programacion;

public class Ejercicio8 {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setAge(18);
        persona.setName("Fazio, Federico");
        persona.setPhone(5551234);
        
        System.out.println("Nombre: "+persona.getName());
        System.out.println("Edad: "+persona.getAge());
        System.out.println("Número: "+persona.getPhone());
    }
}

class Persona {

    private int age;
    private String name;
    private int phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
