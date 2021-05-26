package Ejercicio_1;

import java.util.Scanner;

/*
* Consigna:
* Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores
* que el usuario ingresará por consola.
* Recordá que un número a es múltiplo de b si a es divisible por b
* */
public class NumerosPares {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros pares a mostrar: ");

        int numeroDePares = scanner.nextInt(); // Leo el string

        // Aumento "numero" de dos en dos partiendo de 2, el primer numero par. No considero al 0 como numero par ni impar.
        for(int i = 1; i<=numeroDePares; i++) {
            System.out.println(i*2);
        }

        //for(int i = 1; i<=numeroDePares; System.out.println(i++*2)); //ONELINER

        System.out.println("String ingresado es: " + numeroDePares);

        scanner.close();
    }
}
