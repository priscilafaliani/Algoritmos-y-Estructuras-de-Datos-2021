package arboles.arbolesbinarios.ej2tp2;

public class TestContarHojas {
    
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

        // si no agrego hijos de los hijos, root.contarHojas() == 3
        rootRightChild.agregarHijoIzquierdo(rightChildLeftChild);
        rootRightChild.agregarHijoDerecho(rightChildRightChild); 

        
        // agrego a raiz

        // si quito uno de los hijos, root.contarHojas() == 2
        root.agregarHijoDerecho(rootRightChild);
        root.agregarHijoIzquierdo(rootLeftChild);


        //       0
        //    /     \
        //   1       2
        //  / \     / \
        // 3   4   5   6
        // 
        // root.contarHojas() == 4...

        System.out.println(root.contarHojas());
    }

}
