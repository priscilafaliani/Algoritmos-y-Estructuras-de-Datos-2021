package ej3tp4;

import arbol.ArbolGeneral;

public class PorNiveles {
    public static void main(String[] args) {
        ArbolGeneral<Integer> arbol = CreaArbol.createTree();
        System.out.println(arbol.recorridoPorNiveles());
    }
}
