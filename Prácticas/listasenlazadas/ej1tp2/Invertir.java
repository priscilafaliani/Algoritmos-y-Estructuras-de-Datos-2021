public class Invertir {

    public static void main(String[] args) {
        ListaDeEnteros l = new ListaDeEnterosConArreglos();

        l.agregarFinal(0);
        l.agregarFinal(1);
        l.agregarFinal(2);
        l.agregarFinal(3);
        l.agregarFinal(4);
        l.agregarFinal(5);

        imprimirInverso(l);
    }
    
    public static void imprimirInversoAux(ListaDeEnteros l) {
        if (!l.fin()) {
            Integer i = l.proximo();
            imprimirInversoAux(l);
            System.out.print(i + " ");
        }
    }

    public static void imprimirInverso(ListaDeEnteros l) {
        if (l == null || l.esVacia()) return;
        l.comenzar();
        imprimirInversoAux(l);
    }
}
