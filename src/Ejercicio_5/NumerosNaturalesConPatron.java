package Ejercicio_5;

/*
* Consigna:
* Desarrollar un programa para mostrar por consola los primeros n números naturales que
* tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
* Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola
* los primeros 5 números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida
* será: 33, 133, 233, 303, 313.
* Según cómo decidas encarar la solución de este ejercicio, es probable que necesites
* utilizar recursos que aún no hemos estudiado. El desafío consiste en googlear cómo utilizar
* dichos recursos y ¡utilizarlos!
* */

import java.util.Scanner;

public class NumerosNaturalesConPatron {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el N numero de naturales a buscar ");

        int cNaturales = scanner.nextInt();

        System.out.println("Ingrese el M numero de digitos identificados minimos");

        int cIdentificados = scanner.nextInt();

        System.out.println("Ingrese el numero D identificado ");

        int nIdentificado = scanner.nextInt();

        int contador = 0, numAuxiliar = 1;
        while(contador<cNaturales){
            if(evaluarNumero(numAuxiliar, cIdentificados, nIdentificado) == true){
                System.out.println(numAuxiliar);
                contador ++;
            }
            numAuxiliar ++;
        }

        scanner.close();
    }

    private static boolean evaluarNumero(int numero, int nMinIdentificados, int nIdentificado){

        String cadenaNumero = String.valueOf(numero);

        int longitudNumero = cadenaNumero.length();
        int cantIdentificados = 0;

        for (int i = 0; i < longitudNumero && cantIdentificados < nMinIdentificados; ++i) {
            if( Integer.parseInt(String.valueOf(cadenaNumero.charAt(i))) == nIdentificado)
                cantIdentificados++;
        }

        if(cantIdentificados >= nMinIdentificados)
            return true;
        else
            return false;

    }
}
