package ejercicio3;

import listas.ListaDeEnteros;

public class PrintReverse {

    public static void printReverseAux(ListaDeEnteros l) {
        if (!l.fin()) {
            Integer elem = l.proximo();
            printReverseAux(l);
            System.out.println(elem + " - ");
        }
    }

    public static void printReverse(ListaDeEnteros l) {
        l.comenzar();
        printReverseAux(l);
    }

}
