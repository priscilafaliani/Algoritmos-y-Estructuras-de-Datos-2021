package practica1.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Usando un FOR");
        printNumbersBetweenFor(10, 20);
        System.out.println("Usando un WHILE");
        printNumbersBetweenWhile(0, 10);
        System.out.println("Usando RECURSIÓN");
        printNumbersBetween(30, 35);
    }

    public static void printNumbersBetweenFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbersBetweenWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i++);
        }
    }

    public static void printNumbersBetween(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            printNumbersBetween(a + 1, b);
        }
    }
}