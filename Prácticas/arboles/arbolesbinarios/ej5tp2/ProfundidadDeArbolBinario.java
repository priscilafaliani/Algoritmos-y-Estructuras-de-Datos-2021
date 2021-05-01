package arboles.arbolesbinarios.ej5tp2;
public class ProfundidadDeArbolBinario {
    private ArbolBinario<Integer> root;

    public ProfundidadDeArbolBinario(ArbolBinario<Integer> root) {
        this.root = root;
    }

    public int sumaElementosProfundidad(int p) {
        Queue<ArbolBinario<Integer>> queue = new Queue<>(new ListaEnlazadaGenerica<>());        
        queue.enqueue(root);
        queue.enqueue(null);

        int suma = 0;
        int nivelActual = 0;
        while (!queue.isEmpty() && nivelActual <= p) {
            ArbolBinario<Integer> curr = queue.dequeue();
            
            if (curr != null) {
                if (nivelActual == p) {
                    suma += curr.getDato();
                }

                if (curr.tieneHijoIzquierdo()) {
                    queue.enqueue(curr.getHijoIzquierdo());
                }

                if (curr.tieneHijoDerecho()) {
                    queue.enqueue(curr.getHijoDerecho());
                }
            } else if (!queue.isEmpty()) {
                queue.enqueue(null);
                nivelActual++;
            }
        }

        return suma;
    }
}
