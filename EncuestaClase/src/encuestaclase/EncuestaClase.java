/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuestaclase;
import java.util.Scanner;
/**
 *
 * @author juanc
 */
public class EncuestaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner(System.in); //definimos el scanner para la lcetura del teclado

        // 1. Ingreso de datos como tipos primitivos
        
        System.out.print("Ingrese su nombre (letras sin espacios, por favor): ");
        char[] nombre = scanner.next().toCharArray(); // Entrada tipo char (tipo primitivo)

        System.out.print("Ingrese su carrera (en codigo numerico, por ejemplo 1 para Ingenieria, 2 para Medicina, 3 Derecho): ");
        int carreraCodigo = scanner.nextInt(); // Entrada como tipo int (tipo primitivo)

        System.out.print("Ingrese su edad (numero entero): ");
        byte edadByte = scanner.nextByte(); // Entrada como tipo byte (tipo primitivo)

        System.out.print("Ingrese su numero de telefono (solo numeros, sin espacios): ");
        long telefonoLong = scanner.nextLong(); // Entrada como tipo long (tipo primitivo)

        System.out.println("\n===== RESULTADOS DE LA ENCUESTA ====="); //Imprimimos para empezar a mostrar las comversiones

        // 2. Conversiones de datos

        // Nombre en código ASCII
        System.out.print("Nombre en codigo ASCII: ");
        for (char letra : nombre) {
            System.out.print((int) letra + " "); // casteo implícito de char a int
        }
        System.out.println();

        // Carrera como String
        String carrera = "";
        switch (carreraCodigo) {
            case 1:
                carrera = "Ingenieria"; //Definimos la carrera dependiendo el int ingresado por el teclado
                break;
            case 2:
                carrera = "Medicina"; //Definimos la carrera dependiendo el int ingresado por el teclado
                break;
            case 3:
                carrera = "Derecho"; //Definimos la carrera dependiendo el int ingresado por el teclado
                break;
            default:
                carrera = "Otra"; //Definimos la carrera dependiendo el int ingresado por el teclado
        }
        System.out.println("Carrera (convertida a String): " + carrera);

        // Edad convertida a Integer, Float, Double y String
        int edadInt = edadByte; // byte a int 
        float edadFloat = (float) edadByte; // Conversion a float
        double edadDouble = (double) edadByte; // Conversion a double
        String edadString = Byte.toString(edadByte); // conversión a String

        System.out.println("Edad como Integer: " + edadInt); //Salida en pantalla
        System.out.println("Edad como Float: " + edadFloat); //Salida en pantalla
        System.out.println("Edad como Double: " + edadDouble); //Salida en pantalla
        System.out.println("Edad como String: " + edadString); //Salida en pantalla

        // Teléfono convertido a String
        String telefonoString = Long.toString(telefonoLong);
        System.out.println("Telefono (convertido a String): " + telefonoString); //Salida en pantalla

        scanner.close();
    }
}