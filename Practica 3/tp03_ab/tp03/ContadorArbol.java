package tp03;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
    private ArbolBinario<Integer> a;

    public ContadorArbol() {
        a = new ArbolBinario<>();
    }

    private void numerosParesAuxInOrden(ArbolBinario<Integer> iterador, ListaEnlazadaGenerica<Integer> lista) {
        Integer dato = iterador.getDato();

        if (dato % 2 == 0) {
            lista.agregarFinal(dato);
        }

        if (iterador.tieneHijoIzquierdo()) {
            numerosParesAuxInOrden(iterador.getHijoIzquierdo(), lista);
        }

        if (iterador.tieneHijoDerecho()) {
            numerosParesAuxInOrden(iterador.getHijoDerecho(), lista);
        }
    }

    private void numerosParesAuxPost(ArbolBinario<Integer> iterador, ListaEnlazadaGenerica<Integer> lista) {
        Integer dato = iterador.getDato();
        
        if (iterador.tieneHijoIzquierdo()) {
            numerosParesAuxInOrden(iterador.getHijoIzquierdo(), lista);
        }

        if (iterador.tieneHijoDerecho()) {
            numerosParesAuxInOrden(iterador.getHijoDerecho(), lista);
        }

        if (dato % 2 == 0) {
            lista.agregarFinal(dato);
        }

    }

    public ListaEnlazadaGenerica<Integer> numerosPares() {
        ArbolBinario<Integer> iterador = a;
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();

        this.numerosParesAuxInOrden(iterador, lista);

        return lista;
    }
}
