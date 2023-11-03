/*
Algoritmo-9
El programa debe calcular el área del polígono. La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. Se pide que haga un programa que calcule el área total.
Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; el área de un triángulo rectángulo se calcula multiplicando su base por su altura, y luego dividiendo el resultado entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.
La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
*/
package taller4.ju4nscv;
import java.util.Scanner;
public class AreaPoligono_9 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double ladoCuadrado;
        double alturaTriangulo;
        double rta;
        double areaTriangulo;
        double areaCuadrado;
        double areaRectangulo;
        System.out.println("Ingrese el lado del cuadrado");
        ladoCuadrado = dato.nextDouble();
        System.out.println("Ingrese la altura del triangualo");
        alturaTriangulo = dato.nextDouble();
        areaCuadrado=ladoCuadrado*ladoCuadrado;
        areaTriangulo = (ladoCuadrado*alturaTriangulo)/2;
        areaRectangulo = ladoCuadrado*alturaTriangulo;
        rta= areaTriangulo*3+areaCuadrado+areaRectangulo;
        System.out.println("El area del poligo es: "+ rta);
    }
}
