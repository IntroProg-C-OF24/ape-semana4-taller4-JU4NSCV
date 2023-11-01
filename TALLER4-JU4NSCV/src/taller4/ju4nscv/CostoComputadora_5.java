/*
    Algoritmo-5
        Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón.
*/
package taller4.ju4nscv;
import java.util.Scanner;
public class CostoComputadora_5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        
        System.out.println("Ingrese el costo del cpu");
        cpu = dato.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        teclado = dato.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        pantalla = dato.nextDouble();
        System.out.println("Ingrese el costo del raton");
        raton = dato.nextDouble();
        double rta = cpu +teclado+pantalla+raton;
        System.out.println("El costo de la computadora es: " + rta);
    }
}
