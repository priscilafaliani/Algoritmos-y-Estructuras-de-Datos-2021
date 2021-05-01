package ej3tp4;

import arbol.ArbolGeneral;

public class PreOrden {
    
    public static void main(String[] args) {
        ArbolGeneral<Integer> tree = CreaArbol.createTree();
        System.out.println(tree.preOrden());
    }


}
