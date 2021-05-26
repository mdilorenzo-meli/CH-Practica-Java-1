package Ejercicio_3;

/*
* Consigna:
* Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que
* el usuario ingresará por consola.
* Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
* */

import java.util.Scanner;

public class NumPrimo {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero primo a evaluar ");

        int numero = scanner.nextInt();

        if (esPrimo(numero) == true)
            System.out.println("El numero " + numero + " es primo" );
        else
            System.out.println("El numero " + numero + " no es primo");

        scanner.close();
    }

    private static boolean esPrimo(int numero){
        if(numero == 1)
            return true;

        for(int i = 2; i<numero; i++){
            if(numero%i == 0)
                return false;
        }
        return true;
    }
}
