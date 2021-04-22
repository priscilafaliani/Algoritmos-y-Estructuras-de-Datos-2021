public class Sucesion {

    public static void main(String[] args) {
        ListaDeEnteros l = sucesion(6);

        l.comenzar();
        while (!l.fin()) {
            System.out.print(l.proximo() + " ");
        }
    }
    
    public static int funcion(int n) {
        return n % 2 == 0 ? n / 2 : 3*n + 1;
    }

    public static ListaDeEnteros sucesion(int n) {
        ListaDeEnteros l = n == 1 ? new ListaDeEnterosEnlazada() : sucesion(funcion(n));
        l.agregarInicio(n);
        return l;
    }

    
}
