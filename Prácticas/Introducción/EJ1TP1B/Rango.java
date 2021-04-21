public class Rango {

    public static void main(String[] args) {
        Rango r = new Rango();
        
        
        System.out.print("Rango utilizando un for: ");
        r.rangoFor(10, 15);
        System.out.println();

        System.out.print("Rango utilizando un while: ");
        r.rangoWhile(10, 15);
        System.out.println();

        System.out.print("Rango utilizando recursión: ");
        r.rangoRecursivo(10, 15);
        System.out.println();
    }

    public void rangoFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }

    public void rangoWhile(int a, int b) {
        while (a <= b) {
            System.out.print(a++ + " ");
        }
    }

    public void rangoRecursivo(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            rangoRecursivo(++a, b);
        }
    }

}
