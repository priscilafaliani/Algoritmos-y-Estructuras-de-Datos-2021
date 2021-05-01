package arboles.arbolesbinarios.ej3tp2;
public class TestContador {
    
    public static void main(String[] args) {
        ArbolBinario<Integer> root = new ArbolBinario<>(0);

        
        // hijo izquierdo de la raiz
        ArbolBinario<Integer> rootLeftChild = new ArbolBinario<>(1);
        
        // hijos del hijo izquierdo
        ArbolBinario<Integer> leftChildLeftChild = new ArbolBinario<>(3);
        ArbolBinario<Integer> leftChildRightChild = new ArbolBinario<>(4);

        // hijo izquierdo del hijo derecho del hijo izquierdo de la raiz
        ArbolBinario<Integer> leftChildRightChildLeftChild = new ArbolBinario<>(8);
        leftChildRightChild.agregarHijoIzquierdo(leftChildRightChildLeftChild);

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
        //    /
        //   8

        root.printNiveles();
        System.out.println("\n");

        ContadorArbol contador = new ContadorArbol(root);

        System.out.println("Obtenemos pares con un recorrido in orden");
        root.printInOrden();
        System.out.println();
        
        ListaGenerica<Integer> paresInOrden = contador.paresInOrden();
        System.out.println("Pares: " + paresInOrden);
        System.out.println("\n");

        System.out.println("Obtenemos pares con un recorrido post orden");
        root.printPostorden();
        System.out.println();

        ListaGenerica<Integer> paresPostOrden = contador.paresPostOrden();
        System.out.println("Pares: " + paresPostOrden);
        System.out.println("\n");
    }


}
