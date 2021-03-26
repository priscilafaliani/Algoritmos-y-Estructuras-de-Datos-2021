package ejercicio1;

import listas.ListaDeEnterosConArreglos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();


        System.out.println("---- Ingrese números (finaliza con -1) ----");

        int num = 0;
        while (num != -1) {
            lista.agregarFinal(num = scanner.nextInt());
            scanner.nextLine();
        }


        lista.comenzar();
        while(!lista.fin()) {
            System.out.println(lista.proximo());
        }

    }

}
