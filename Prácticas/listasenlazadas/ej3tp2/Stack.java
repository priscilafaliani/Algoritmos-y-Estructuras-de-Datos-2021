public class Stack<T> {
    private ListaGenerica<T> stack;

    public Stack(ListaGenerica<T> stack) {
        this.stack = stack;
    }

    public void push(T elem) {
        this.stack.agregarFinal(elem);
    }

    public T pop() {
        T elem = this.stack.elemento(stack.tamanio());
        this.stack.eliminarEn(stack.tamanio());
        return elem;
    }

    public T peek() {
        return this.stack.elemento(stack.tamanio());
    }

    public boolean isEmpty() {
        return this.stack.esVacia();
    }
}
