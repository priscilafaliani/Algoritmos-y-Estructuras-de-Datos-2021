package arboles.arbolesbinarios.ej2tp2;
public class TestRecorridos {
    public static void main(String[] args) {
        ArbolBinario<Integer> root = new ArbolBinario<>(0);

        
        // hijo izquierdo de la raiz
        ArbolBinario<Integer> rootLeftChild = new ArbolBinario<>(1);
        
        // hijos del hijo izquierdo
        ArbolBinario<Integer> leftChildLeftChild = new ArbolBinario<>(3);
        ArbolBinario<Integer> leftChildRightChild = new ArbolBinario<>(4);

        // agrego hijos del hijo izquierdo
        rootLeftChild.agregarHijoIzquierdo(leftChildLeftChild);
        rootLeftChild.agregarHijoDerecho(leftChildRightChild);
        
        
        // hijo derecho de la raiz
        ArbolBinario<Integer> rootRightChild = new ArbolBinario<>(2);

        // hijos del hijo derecho
        ArbolBinario<Integer> rightChildLeftChild = new ArbolBinario<>(5);
        ArbolBinario<Integer> rightChildRightChild = new ArbolBinario<>(6);

        // agrego hijos del hijo derecho
        rootRightChild.agregarHijoIzquierdo(rightChildLeftChild);
        rootRightChild.agregarHijoDerecho(rightChildRightChild); 

        
        // agrego a raiz
        root.agregarHijoDerecho(rootRightChild);
        root.agregarHijoIzquierdo(rootLeftChild);


        //       0
        //    /     \
        //   1       2
        //  / \     / \
        // 3   4   5   6
        // 

        System.out.println("Imprimiendo todos los niveles");
        root.printNiveles();
        System.out.println("\n");

        // 3 - 4 - 1 - 5 - 6 - 2 - 0
        System.out.println("Imprimiendo en post orden");
        root.printPostorden();
        System.out.println("\n");

        // 0 - 1 - 3 - 4 - 5 - 6 - 2
        System.out.println("Imprimiendo en pre orden");
        root.printPreorden();
        System.out.println("\n");

        // 3 - 1 - 4 - 0 - 5 - 6 - 2
        System.out.println("Imprimiendo en in orden");
        root.printInOrden();
        System.out.println("\n");


        // tests de printEntre(n, m);
        System.out.println("Imprimiendo entre niveles (0, 0)");
        root.printEntre(0, 0);
        System.out.println("\n");

        System.out.println("Imprimiendo entre niveles (0, 1)");
        root.printEntre(0, 1);
        System.out.println("\n");

        System.out.println("Imprimiendo entre niveles (0, 2)");
        root.printEntre(0, 2);
        System.out.println("\n");

        System.out.println("Imprimiendo entre niveles (1, 2)");
        root.printEntre(1, 2);
        System.out.println("\n");
    }

}
