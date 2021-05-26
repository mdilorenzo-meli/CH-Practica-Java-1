package Ejercicio_4;

/*
* Consigna:
* Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n
* un valor que el usuario ingresará por consola.
* */

import java.util.Scanner;

public class NNumerosPrimos {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de primos a buscar ");

        int nPrimos = scanner.nextInt();

        int contador = 0, numAuxiliar = 1;
        while(contador<nPrimos){
            if(esPrimo(numAuxiliar) == true){
                System.out.println(numAuxiliar);
                contador ++;
            }
            numAuxiliar ++;
        }

        //ONELINER         for(int i = 0, numero=0; i<numeroDePares; i++,System.out.println(numero+=2));

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
