public class TestLlenoCompleto {
    public static void main(String[] args) {
        ArbolBinario<Integer> root = new ArbolBinario<>(0);
        // hijo izquierdo de la raiz
        ArbolBinario<Integer> uno1 = new ArbolBinario<>(1);

        ArbolBinario<Integer> tres = new ArbolBinario<>(3);
        ArbolBinario<Integer> cuatro = new ArbolBinario<>(4);

        uno1.agregarHijoIzquierdo(tres);

        ArbolBinario<Integer> siete = new ArbolBinario<>(7);
        ArbolBinario<Integer> once = new ArbolBinario<>(11);
        
        tres.agregarHijoIzquierdo(siete);
        tres.agregarHijoDerecho(once);


        uno1.agregarHijoDerecho(cuatro);

        ArbolBinario<Integer> ocho = new ArbolBinario<>(8);
        ArbolBinario<Integer> diez1 = new ArbolBinario<>(10);

        cuatro.agregarHijoIzquierdo(ocho);
        cuatro.agregarHijoDerecho(diez1);

        root.agregarHijoIzquierdo(uno1);

        // hijo derecho de la raiz
        ArbolBinario<Integer> dos = new ArbolBinario<>(2);

        ArbolBinario<Integer> cinco = new ArbolBinario<>(5);
        ArbolBinario<Integer> seis = new ArbolBinario<>(6);

        dos.agregarHijoIzquierdo(cinco);
        dos.agregarHijoDerecho(seis);

        ArbolBinario<Integer> doce = new ArbolBinario<>(12);
        ArbolBinario<Integer> uno2 = new ArbolBinario<>(1);

        cinco.agregarHijoIzquierdo(doce);
        cinco.agregarHijoDerecho(uno2);

        ArbolBinario<Integer> diez2 = new ArbolBinario<>(10);
        ArbolBinario<Integer> diez3 = new ArbolBinario<>(10);

        seis.agregarHijoIzquierdo(diez2);
        seis.agregarHijoDerecho(diez3);

        root.agregarHijoDerecho(dos);

        //               0
        //        /             \
        //       1               2
        //    /     \         /     \
        //   3       4       5       6
        //  / \     / \     / \     / \
        // 7  11   8   10  12   1   10 10

        System.out.println("Es lleno?: " + root.esLleno());
        System.out.println("Es completo?: " + root.esCompleto());
    }
}
