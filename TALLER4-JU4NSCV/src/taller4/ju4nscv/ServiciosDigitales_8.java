/*
    Algoritmo-8
        Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. Los servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package taller4.ju4nscv;
import java.util.Scanner;
public class ServiciosDigitales_8 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        int edad;
        double rta;
        System.out.println("Ingrese el costo de netflix");
        netflix = dato.nextDouble();
        System.out.println("Ingrese el costo de Youtube Premium");
        youtube = dato.nextDouble();
        System.out.println("Ingrese el costo de Dropbox");
        dropbox = dato.nextDouble();
        System.out.println("Ingrese el costo de Spotify");
        spotify = dato.nextDouble();
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad >= 30) {
            rta = netflix + youtube + dropbox + spotify;
            double descuento = rta * 0.2;
            rta = rta - descuento;
            System.out.println("El valor a cancelar es de: " + rta);
        } else {
            rta = netflix + youtube + dropbox + spotify;
            System.out.println("El valor a cancelar es de: " + rta);
        }
        
    }

}
