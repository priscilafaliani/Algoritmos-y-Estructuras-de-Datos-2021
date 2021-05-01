package listasenlazadas.ej1tp2;

import java.util.Scanner;
import listasenlazadas.listasdeenteros.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();

        int nums = 0;
        int n = 0;

        while (nums++ < 5) {
            n = sc.nextInt();
            l.agregarFinal(n);
        }

        l.comenzar();
        while (!l.fin()) {
            System.out.print(l.proximo() + " ");
        }
    }

}
