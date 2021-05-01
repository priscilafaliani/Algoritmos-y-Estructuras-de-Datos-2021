package arboles.arbolesbinarios.ej2tp2;
public class TestEspejo {
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
        System.out.println("Arbol al comenzar");
        root.printNiveles();
        System.out.println("\n");

        System.out.println("Version invertida");
        ArbolBinario<Integer> invertido = root.espejo();
        invertido.printNiveles();
        System.out.println("\n");
    }
}
