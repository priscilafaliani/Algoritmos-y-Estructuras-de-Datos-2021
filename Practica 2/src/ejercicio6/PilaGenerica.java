package ejercicio6;

import listas.genericas.ListaGenerica;

public class PilaGenerica <T> {

    private final ListaGenerica<T> pila;

    public PilaGenerica(ListaGenerica<T> implementacionInterna) {
        this.pila = implementacionInterna;
    }

    // Apila un elemento
    public void apilar(T t) {
        pila.agregarFinal(t);
    }

    // Retorna y elimina el ultimo elemento agregado
    public T desapilar() {
        if (!esVacia()) {
            T elem = tope();
            pila.eliminarEn(pila.tamanio());
            return elem;
        } else {
            return null;
        }
    }

    // Retorna y elimina el ultimo elemento agregado
    public T tope() {
        return pila.elemento(pila.tamanio());
    }

    public boolean esVacia() {
        return pila.esVacia();
    }

}
