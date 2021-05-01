package ej3tp4;

import arbol.ArbolGeneral;

public class InOrden {

    public static void main(String[] args) {
        ArbolGeneral<Integer> root = CreaArbol.createTree();
        System.out.println(root.inOrden());    
    }

}

