package Ejercicio_2;

/*
* Consigna:
* Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores
* que el usuario ingresará por consola.
* Recordá que un número a es múltiplo de b si a es divisible por b
*/

import java.util.Scanner;

public class NMultiplos {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero M a buscar sus multiplos ");

        int multiplo = scanner.nextInt(); // Leo el string

        System.out.println("Ingrese cantidad de primeros multiplos a mostrar: ");

        int numeroDeMultiplos = scanner.nextInt(); // Leo el string

        for(int i = 1; i<=numeroDeMultiplos; i++) {
            System.out.println(i*multiplo);
        }
        //ONELINER         for(int i = 0, numero=0; i<numeroDePares; i++,System.out.println(numero+=2));

        scanner.close();
    }
}
