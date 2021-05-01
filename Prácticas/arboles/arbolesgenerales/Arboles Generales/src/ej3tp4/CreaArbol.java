package ej3tp4;

import arbol.*;

public class CreaArbol {
    public static ListaGenerica<ArbolGeneral<Integer>> createChildren() {
        ListaGenerica<ArbolGeneral<Integer>> children = new ListaEnlazadaGenerica<>();
        for (int i = 1; i <= 3; i++) {
            children.agregarFinal(new ArbolGeneral<>(i));
        }
        return children;
    }

    public static ArbolGeneral<Integer> createTreeNode() {
        ArbolGeneral<Integer> root = new ArbolGeneral<>(0);
        root.setHijos(createChildren());
        return root;
    }

    public static ArbolGeneral<Integer> createTree() {
        ArbolGeneral<Integer> root = createTreeNode();
        ListaGenerica<ArbolGeneral<Integer>> children = root.getHijos();

        children.comenzar();
        while (!children.fin()) {
            ArbolGeneral<Integer> curr = children.proximo();
            curr.setHijos(createChildren());
        }

        return root;
    }
}
