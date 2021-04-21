import java.util.Scanner;
import java.util.Arrays;


public class Multiplos {
    
    public static void main(String[] args) {
        Multiplos m = new Multiplos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese números, finaliza con 0");
        int n = sc.nextInt();

        while (n != 0) {
            int [] resultado = m.nMultiplosDeN(n);

            if (resultado != null) {
                System.out.println(Arrays.toString(resultado));
            } else {
                System.out.println("Sólo números > 0");
            }

            n = sc.nextInt();
        }

        sc.close();
    }


    public int[] nMultiplosDeN(int n) {
        if (n <= 0) {
            return null;
        }

        int[] multiplos = new int[n];

        for (int i = 1; i <= n; i++) {
            multiplos[i - 1] = i * n;
        }

        return multiplos;
    }
}
