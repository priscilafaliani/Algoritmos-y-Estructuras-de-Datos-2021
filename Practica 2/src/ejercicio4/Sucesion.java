package ejercicio4;

import listas.ListaDeEnteros;
import listas.ListaDeEnterosEnlazada;

public class Sucesion {

    public static int operacion(int n) {
        return n % 2 == 0 ? (n / 2) : (3 * n + 1);
    }

    public static ListaDeEnterosEnlazada sucesion(int n) {
        ListaDeEnterosEnlazada l = n == 1 ? new ListaDeEnterosEnlazada() : sucesion(operacion(n));
        l.agregarInicio(n);
        return l;
    }

    public static void main(String[] args) {
        ListaDeEnterosEnlazada l = sucesion(6);

        l.comenzar();
        while(!l.fin()) {
            System.out.println(l.proximo());
        }
    }
}
