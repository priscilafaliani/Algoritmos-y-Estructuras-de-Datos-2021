public class ContadorArbol {
    private ArbolBinario<Integer> a;

    public ContadorArbol(ArbolBinario<Integer> a) {
        if (a != null) {
            this.a = a;
        } else {
            this.a = new ArbolBinario<Integer>();
        }
    }

    // retorna una lista de los números pares, recorriendo in orden.
    public ListaGenerica<Integer> paresInOrden() {
        ListaGenerica<Integer> pares = new ListaEnlazadaGenerica<>();
        ArbolBinario<Integer> aux = a;
        _paresInOrden(pares, aux);
        return pares;
    }


    public void _paresInOrden(ListaGenerica<Integer> pares, ArbolBinario<Integer> a) {
        if (!a.esVacio()) {
            if (a.tieneHijoIzquierdo()) {
                _paresInOrden(pares, a.getHijoIzquierdo());
            }
            
            if (a.getDato() % 2 == 0) {
                pares.agregarFinal(a.getDato());
            }

            if (a.tieneHijoDerecho()) {
                _paresInOrden(pares, a.getHijoDerecho());
            }
        }
    }

    // retorna una lista de los números pares, recorriendo en post orden.
    public ListaGenerica<Integer> paresPostOrden() {
        ListaGenerica<Integer> pares = new ListaEnlazadaGenerica<>();
        ArbolBinario<Integer> aux = a;
        _paresPostOrden(pares, aux);
        return pares;
    }


    public void _paresPostOrden(ListaGenerica<Integer> pares, ArbolBinario<Integer> a) {
        if (!a.esVacio()) {
            if (a.tieneHijoIzquierdo()) {
                _paresPostOrden(pares, a.getHijoIzquierdo());
            }
            
            if (a.tieneHijoDerecho()) {
                _paresPostOrden(pares, a.getHijoDerecho());
            }
            
            if (a.getDato() % 2 == 0) {
                pares.agregarFinal(a.getDato());
            }
        }
    }
}
