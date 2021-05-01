package listasenlazadas.ej3tp2;
import listasenlazadas.listasgenericas.ListaGenerica;

public class Queue<T> {
    private ListaGenerica<T> queue;

    public Queue(ListaGenerica<T> queue) {
        this.queue = queue;
    }

    public void enqueue(T elem) {
        this.queue.agregarFinal(elem);
    }

    public T dequeue() {
        T elem = this.queue.elemento(1);
        this.queue.eliminarEn(1);
        return elem;
    }

    public T peek() {
        return this.queue.elemento(1);
    }

    public boolean isEmpty() {
        return queue.esVacia();
    }
}
