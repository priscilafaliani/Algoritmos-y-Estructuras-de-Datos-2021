package practica1.ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNMultiplosDeN(5)));
        System.out.println(Arrays.toString(getNMultiplosDeN(2)));
        System.out.println(Arrays.toString(getNMultiplosDeN(6)));
        System.out.println(Arrays.toString(getNMultiplosDeN(4)));
        System.out.println(Arrays.toString(getNMultiplosDeN(10)));
    }

    public static int[] getNMultiplosDeN(int n) {
        int[] multiplos = new int[n];
        for (int i = 1; i <= n; i++) {
            multiplos[i - 1] = n * i;
        }

        return multiplos;
    }
}
