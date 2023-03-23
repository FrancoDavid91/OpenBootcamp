package Introduccion_a_la_programacion;

public class Ejercicio9 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        persona.setAge(23);
        persona.setName("Armando, Lucas");
        persona.setPhone(380488956);
        cliente.setCredito(35000);
        trabajador.setSalario(17543.5);
        
        System.out.println("CLIENTE");
        System.out.println("Nombre: "+ persona.getName());
        System.out.println("Edad: "+ persona.getAge());
        System.out.println("Telefono: "+ persona.getPhone());
        System.out.println("Credito asignado: "+ cliente.getCredito());
        System.out.println("Salario cliente: "+ trabajador.getSalario());
        
        
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

class Cliente extends Persona {
    private float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends Persona{
    Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
