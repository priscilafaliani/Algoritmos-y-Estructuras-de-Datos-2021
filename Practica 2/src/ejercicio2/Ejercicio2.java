package ejercicio2;

import listas.ListaDeEnterosEnlazada;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();


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