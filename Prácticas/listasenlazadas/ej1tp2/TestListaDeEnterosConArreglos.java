import java.util.Scanner;

public class TestListaDeEnterosConArreglos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();

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
