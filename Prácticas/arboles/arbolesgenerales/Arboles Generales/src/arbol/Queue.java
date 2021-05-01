package arbol;

public class Queue<T> {
    private ListaGenerica<T> queue;

    public Queue() {
        queue = new ListaEnlazadaGenerica<>();
    }

    public boolean esVacia() {
        return queue.esVacia();
    }

    public void enqueue(T elem) {
        queue.agregarFinal(elem);
    }

    public T dequeue() {
        T elem = queue.elemento(1);
        queue.eliminarEn(1);
        return elem;
    }

    public T peek() {
        return queue.elemento(1);
    }
}
