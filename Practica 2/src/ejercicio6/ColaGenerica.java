package ejercicio6;

import listas.genericas.ListaGenerica;

// Queue
public class ColaGenerica<T> {

    private final ListaGenerica<T> cola;

    public ColaGenerica(ListaGenerica<T> implementacionInterna) {
        this.cola = implementacionInterna;
    }

    // Agrega un elemento al final de la cola
    public boolean encolar(T elem) {
        return cola.agregarFinal(elem);
    }

    // Retorna el primer elemento en la cola
    public T desencolar() {
        T elem = tope();
        cola.eliminarEn(0);
        return elem;
    }

    // Retorna el primer elemento agregado
    public T tope() {
        return cola.elemento(0);
    }

    public boolean esVacia() {
        return cola.esVacia();
    }


}
