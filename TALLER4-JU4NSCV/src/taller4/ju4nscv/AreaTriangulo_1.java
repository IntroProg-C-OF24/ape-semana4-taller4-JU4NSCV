/*
    Algoritmo-1
        Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.
*/
package taller4.ju4nscv;
import java.util.Scanner;
public class AreaTriangulo_1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double alturaT;
        double baseT;
        double rta;
        System.out.println("Ingrese la Altura del Triangulo");
        alturaT = dato.nextDouble();
        System.out.println("Ingrese la Base del Triangulo");
        baseT = dato.nextDouble();
        rta = (alturaT * baseT)/2;
        System.out.println("El Area del Triangulo es: " + rta);
    }
}
