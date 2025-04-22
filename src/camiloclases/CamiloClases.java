/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camiloclases;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Estudiante
 */
public class CamiloClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in); //leer teclado 
    System.out.print("Por favor ingrese su nombre: ");
    String nombre = scanner.nextLine(); 
    var ascii_code = nombre.charAt(0); 
    System.out.print("Su nombre es " + nombre);
      

    System.out.print("Por favor ingrese su edad: ");
    Integer edad = scanner.nextInt(); 
    Integer edadInteger = edad; //
    System.out.print("Su edad es " + edadInteger);
    }
    
    /*var x = 'B';
var ascii_code = x.charCodeAt(0);
console.log(ascii_code);*/
}
