/*
    Algoritmo-2
        Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
package taller4.ju4nscv;

import java.util.Scanner;

public class GastosHijos_2 {

    public static void main(String[] args) {
        double hijo1;
        double hijo2;
        double hijo3;
        double rta;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el gasto del primer hijo");
        hijo1 = dato.nextDouble();
        System.out.println("Ingrese el gasto del segundo hijo");
        hijo2 = dato.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo");
        hijo3 = dato.nextDouble();
        rta = hijo1 + hijo2 + hijo3;
        System.out.println("Los gastos totales del padre de familia son de: " + rta);
    }
}
