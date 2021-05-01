package ej4tp4;

import arbol.ArbolGeneral;
import ej3tp4.CreaArbol;

public class AlturaNivelAncho {
    
    public static void main(String[] args) {
        ArbolGeneral<Integer> arbol = CreaArbol.createTree();

        System.out.println(arbol.altura());
        System.out.println(arbol.nivel(1));
        System.out.println(arbol.ancho());
    }

}
