package practica1.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero: ");
            System.out.println("N multiplos de N: " + Arrays.toString(getNMultiplosDeN(scanner.nextInt())));
        }
    }

    public static int[] getNMultiplosDeN(int n) {
        int[] multiplos = new int[n];
        for (int i = 1; i <= n; i++) {
            multiplos[i - 1] = n * i;
        }

        return multiplos;
    }
}
