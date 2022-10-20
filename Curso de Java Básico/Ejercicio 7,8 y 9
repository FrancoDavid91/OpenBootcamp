package Curso_de_Java_Básico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Ejercicio7_8_9 {
    public static void main(String[] args){
        
        //EJERCICIO INTRODUCTORIO: REVERTIR CADENA DE TEXTO
        
        String cadena = "hola mundo!";
        reverse(cadena);
        
         System.out.println("\n");
        
        //EJERCICIOS
        //1.
        String array1[] = {"ESTO","ES","UN","EJERCICIO"};
        
        for(String elemento : array1){
            System.out.print(elemento + " ");
        }
        System.out.println("\n");
        
        //2.
        int array2[][] = {{3,5},{2,8}};
        
        System.out.println("");
        for(int i=0; i<array2.length; i++){
            for(int j=0; j<array2.length; j++){
                System.out.println("Posicion i: "
                + i + " Posicion j: " + j + " Valor [i][j]: "
                + array2[i][j]);
            }
        }
        System.out.println("\n");
        
        //3.
        Vector <Integer> vector = new Vector();
        
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        
        System.out.println("El Vector contiene: " + vector);
        System.out.println("Se remueven los elementos 2 y 3.");
        
        vector.remove(2);
        vector.remove(3);
        
        System.out.println("El nuevo vector contiene: " + vector + "\n");
        
        /*4.
        Problema Vector de 1000 elementos --> Por defecto, el vector crea una
        capacidad que contiene a todos los elementos, y se duplica si esta es
        revasada en su limite. Esto genera un costo computacional grande, ya que
        trabajan como array dinamicos, generando copias de elementos sobre 
        arrays que trabajan "por detras" de las operaciones de los vectores.        
        */
        
        //5.
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("agua");
        lista.add("fuego");
        lista.add("tierra");
        lista.add("viento");
        
        System.out.println("Lista de elementos:");
        for(int i=0;i<lista.size();i++){
            System.out.println(i +": " + lista.get(i));
        }
        
        System.out.println("La lista copiada es: ");
        LinkedList<String> listaCopiada = new LinkedList<String>(lista);
        for(int i=0;i<lista.size();i++){
            System.out.println(i +": " + listaCopiada.get(i));
        }
        
        System.out.println("\n");
        
        //6.
        System.out.println("La lista secuencial es: ");
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=1;i<11;i++){
           numeros.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(numeros.get(i));
        }
        
        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i)%2 == 0){
                numeros.remove(i);
            }
        }
        
        System.out.println("La lista con impares removidos es: ");
        for(int i=0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("\n");
        
        //7.
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Introduce dos numeros entre 0 y 10. ");
        System.out.print("Numero A: ");
        int A = valor.nextInt();
        System.out.print("Número B: ");
        int B = valor.nextInt();
        
        if((A>=0 && A<=10)&&(B>=0 && B<=10)){
            try{
                System.out.println("El resultado es " + DividePorCero(A, B));
            }catch (ArithmeticException e){
                System.out.println("Esto no puede hacerse.");
            }
            
            System.out.println("Demo de código");
        }
        
        System.out.println("\n");
        
        //8.
        File ruta = new File("C:\\Users\\Franco\\Desktop\\ficheroprueba.txt");
        System.out.println("Se accede al fichero 'ficheroprueba.txt'");
        try{
            InputStream fileIn = new FileInputStream(ruta);
            try{
            byte [] datos = fileIn.readAllBytes();
            PrintStream fileOut = new PrintStream("C:\\Users\\Franco\\Desktop\\ficherocopia.txt");
            fileOut.write(datos);
            System.out.println("Se generó un fichero copia.");
            }catch(IOException e){
                System.out.println("Surgió un problema: " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Existe un error: " + e.getMessage());
        }
        
        System.out.println("\n");
        
        //9.
        /*
        El programa elabora un hashmap con información solicitada
        al usuario de nombres y DNI para inscriptos a un curso ficticio.
        Luego se accede al fichero del curso con el temario y se guarda 
        una copia de seguridad.
        */
        System.out.println("----------------------------------");
        System.out.println("ARRAYLIST-HASMAP-INPUTSTREAM-PRINTSTREAM-EXCEPCIONES");
        System.out.println("----------------------------------\n");
        
        ArrayList<String> inscripto = new ArrayList<>();
        ArrayList<Integer> dni = new ArrayList<>();
        
        Scanner nombre = new Scanner(System.in);
        Scanner dniParticipante = new Scanner(System.in);
        Scanner cantidadParticipantes = new Scanner(System.in);
        
        System.out.println("INGRESE NÚMERO DE PARTICIPANTES ");
        int numeroParticipantes = cantidadParticipantes.nextInt();
        System.out.println("INSERTAR NOMBRE DE PARTICIPANTES ");
        for(int i=0;i<numeroParticipantes;i++){
            String nombrePersona = nombre.nextLine();
            inscripto.add(nombrePersona);
        }
        System.out.println("INSERTAR DNI DEL PARTICIPANTE ");
        for(int i=0;i<numeroParticipantes;i++){
            int dnipersona = dniParticipante.nextInt();
            dni.add(dnipersona);
        }
        System.out.println("----------------------------------");
        
        HashMap<String, Integer> listadoParticipantes = new HashMap<>();
        
        for(int i=0;i<numeroParticipantes;i++){
            listadoParticipantes.put(inscripto.get(i), dni.get(i));
        }
        System.out.println("EL HASHMAP DE PARTICIPANTES GENERADO ES ");
        System.out.println(listadoParticipantes);
        System.out.println("----------------------------------");
        
        File rutaFichero = new File("C:\\Users\\Franco\\Desktop\\ficherodeinscriptos.txt");
        System.out.println("Se realiza lectura de archivo con información para inscriptos: " 
                            + rutaFichero);
        
        try{
            InputStream fileFichero = new FileInputStream(rutaFichero);
            try{
            byte [] datos = fileFichero.readAllBytes();
            PrintStream fileFicheroCopia = 
            new PrintStream("C:\\Users\\Franco\\Desktop\\ficherodeinscriptos.txt");
            fileFicheroCopia.write(datos);
            System.out.println("Se generó una copia de seguridad.");
            }catch(IOException e){
                System.out.println("Surgió un problema: " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Existe un error: " + e.getMessage());
        }
        
        System.out.println("\n");
        

    }
        
    //FUNCIONES
    
    public static int DividePorCero(int A, int B) throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = A/B;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
    
    public static String reverse(String cadena){
        
        String invertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
	invertida += cadena.charAt(indice);
	}
        System.out.println("Cadena original: " + cadena);
	System.out.println("Cadena invertida: " + invertida);
        
        return invertida;
    }
   
}
