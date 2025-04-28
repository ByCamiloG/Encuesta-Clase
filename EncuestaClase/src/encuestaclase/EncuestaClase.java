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
  Scanner scanner = new Scanner(System.in);

        // 1. Ingreso de datos como tipos primitivos
        System.out.print("Ingrese su nombre (letras sin espacios, por favor): ");
        char[] nombre = scanner.next().toCharArray(); // Entrada como array de char (tipo primitivo)

        System.out.print("Ingrese su carrera (en codigo numerico, por ejemplo 1 para Ingenieria, 2 para Medicina): ");
        int carreraCodigo = scanner.nextInt(); // Entrada como int (tipo primitivo)

        System.out.print("Ingrese su edad (numero entero): ");
        byte edadByte = scanner.nextByte(); // Entrada como byte (tipo primitivo)

        System.out.print("Ingrese su numero de telefono (solo numeros, sin espacios): ");
        long telefonoLong = scanner.nextLong(); // Entrada como long (tipo primitivo)

        System.out.println("\n===== RESULTADOS DE LA ENCUESTA =====");

        // 2. Procesamiento de datos (conversiones)

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
                carrera = "Ingenieria";
                break;
            case 2:
                carrera = "Medicina";
                break;
            case 3:
                carrera = "Derecho";
                break;
            default:
                carrera = "Otra";
        }
        System.out.println("Carrera (convertida a String): " + carrera);

        // Edad convertida a Integer, Float, Double y String
        int edadInt = edadByte; // byte a int (promoción automática)
        float edadFloat = (float) edadByte; // casteo explícito
        double edadDouble = (double) edadByte; // casteo explícito
        String edadString = Byte.toString(edadByte); // conversión a String

        System.out.println("Edad como Integer: " + edadInt);
        System.out.println("Edad como Float: " + edadFloat);
        System.out.println("Edad como Double: " + edadDouble);
        System.out.println("Edad como String: " + edadString);

        // Teléfono convertido a String
        String telefonoString = Long.toString(telefonoLong);
        System.out.println("Telefono (convertido a String): " + telefonoString);

        scanner.close();
    }
}