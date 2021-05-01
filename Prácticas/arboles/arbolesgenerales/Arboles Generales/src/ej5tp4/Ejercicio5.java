package ej5tp4;

import arbol.ArbolGeneral;
import arbol.ListaEnlazadaGenerica;
import arbol.ListaGenerica;
import arbol.Queue;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        ArbolGeneral<Empresa> M = new ArbolGeneral<>(new Empresa("M", 20));
        ArbolGeneral<Empresa> J = new ArbolGeneral<>(new Empresa("J", 13));
        ArbolGeneral<Empresa> K = new ArbolGeneral<>(new Empresa("K", 25));
        ArbolGeneral<Empresa> L = new ArbolGeneral<>(new Empresa("L", 10));
        ArbolGeneral<Empresa> A = new ArbolGeneral<>(new Empresa("A", 4));
        ArbolGeneral<Empresa> B = new ArbolGeneral<>(new Empresa("B", 7));
        ArbolGeneral<Empresa> C = new ArbolGeneral<>(new Empresa("C", 5));
        ArbolGeneral<Empresa> D = new ArbolGeneral<>(new Empresa("D", 6));
        ArbolGeneral<Empresa> E = new ArbolGeneral<>(new Empresa("E", 10));
        ArbolGeneral<Empresa> F = new ArbolGeneral<>(new Empresa("F", 18));
        ArbolGeneral<Empresa> G = new ArbolGeneral<>(new Empresa("G", 9));
        ArbolGeneral<Empresa> H = new ArbolGeneral<>(new Empresa("H", 12));
        ArbolGeneral<Empresa> I = new ArbolGeneral<>(new Empresa("I", 19));

        ListaGenerica<ArbolGeneral<Empresa>> hijos1 = new ListaEnlazadaGenerica<>();
        hijos1.agregarFinal(A);
        hijos1.agregarFinal(B);
        hijos1.agregarFinal(C);

        ListaGenerica<ArbolGeneral<Empresa>> hijos2 = new ListaEnlazadaGenerica<>();
        hijos2.agregarFinal(D);
        hijos2.agregarFinal(E);
        hijos2.agregarFinal(F);

        ListaGenerica<ArbolGeneral<Empresa>> hijos3 = new ListaEnlazadaGenerica<>();
        hijos3.agregarFinal(G);
        hijos3.agregarFinal(H);
        hijos3.agregarFinal(I);

        ListaGenerica<ArbolGeneral<Empresa>> hijos4 = new ListaEnlazadaGenerica<>();
        hijos4.agregarFinal(J);
        hijos4.agregarFinal(K);
        hijos4.agregarFinal(L);

        J.setHijos(hijos1);
        K.setHijos(hijos2);
        L.setHijos(hijos3);
        M.setHijos(hijos4);
        
        System.out.println(new PromedioEmpresa().devolverMaximoPromedio(M));
    }

}

class Empresa {

    private String identificacion;
    private Integer tardanza;

    public Empresa(String id, Integer tardanza) {
        this.identificacion = id;
        this.tardanza = tardanza;
    }

    public Integer getTardanza() {
        return this.tardanza;
    }
}

class PromedioEmpresa {

    public Integer devolverMaximoPromedio(ArbolGeneral<Empresa> arbol) {
        Queue<ArbolGeneral<Empresa>> queue = new Queue<>();
        queue.enqueue(arbol);
        queue.enqueue(null);

        int sumaNivel = 0;
        int nodosNivel = 0;
        int mayorPromedio = 0;

        while (!queue.esVacia()) {
            ArbolGeneral<Empresa> actual = queue.dequeue();

            if (actual != null) {
                nodosNivel++;
                sumaNivel += actual.getDato().getTardanza();

                if (actual.tieneHijos()) {
                    actual.getHijos().comenzar();

                    while (!actual.getHijos().fin()) {
                        queue.enqueue(actual.getHijos().proximo());
                    }
                }
            } else if (!queue.esVacia()) {
                // nodosNivel == 0 ?
                Integer promedio = sumaNivel / nodosNivel;
                if (promedio > mayorPromedio) {
                    mayorPromedio = promedio;
                }
                queue.enqueue(null);
            }
        }

        // tengo que ver el ult nivel
        Integer promedio = sumaNivel / nodosNivel;
        return promedio > mayorPromedio ? promedio : mayorPromedio;
    }
}