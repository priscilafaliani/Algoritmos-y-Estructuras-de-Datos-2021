public class Test {
    public static void main(String[] args) {
        // Queue Test.
        Queue<Integer> queue = new Queue<>(new ListaEnlazadaGenerica<Integer>());

        // 2 1 3 4
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(4);

        // 2 1 3 4
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        // Stack Test.
        Stack<Integer> stack = new Stack<>(new ListaEnlazadaGenerica<Integer>());

        // 2 1 3 4
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);

        // 4 3 1 2
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
