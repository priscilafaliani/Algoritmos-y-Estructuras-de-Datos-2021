package tp03;

import tp02.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
    private ArbolBinario<Integer> a;

    public ProfundidadDeArbolBinario() {
        a = new ArbolBinario<>();
    }

    public int sumaElementosProfundidad(int p) {
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<>(new ListaEnlazadaGenerica<>());
        
        cola.encolar(a);
        // delimitador
        cola.encolar(null);

        int nivel = 0;
        int suma = 0;

        while (!cola.esVacia()) {
            ArbolBinario<Integer> actual = cola.desencolar();

            if (nivel == p) {
                suma += actual.getDato();
            }

            if (actual != null && nivel != p) {
                if (actual.tieneHijoIzquierdo()) {
                    cola.encolar(actual.getHijoIzquierdo());
                }
                if (actual.tieneHijoDerecho()) {
                    cola.encolar(actual.getHijoDerecho());
                }
            } else if (!cola.esVacia()) {
                if (++nivel > p) return suma;
                cola.encolar(null);
            }
        }


        return suma;
    }
}
