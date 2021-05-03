package ej7tp4;

import arbol.ArbolGeneral;

public class RedDeAguaPotable {

    private ArbolGeneral<Character> redAguaPotable;

    public RedDeAguaPotable(ArbolGeneral<Character> caños) {
        this.redAguaPotable = caños;
    }

    public double minimoCaudal(double caudal) {
        ArbolGeneral<Character> it = redAguaPotable;
        return minimoCaudal(caudal, it);
    }

    public double minimoCaudal(double caudal, ArbolGeneral<Character> a) {
        if (a.esVacio() || a.esHoja()) {
            return caudal;
        }
        
        // si tiene hijos, puedo bifurcar el caudal
        caudal = caudal / a.getHijos().tamanio();
        double min = caudal;

        a.getHijos().comenzar();
        while (!a.getHijos().fin()) {
            ArbolGeneral<Character> hijo = a.getHijos().proximo();

            // a los hijos le tengo que mandar a todos el mismo caudal
            // e ir manteniendo el minimo que me retornen
            min = Math.min(min, minimoCaudal(caudal, hijo));
        }

        return min;
    }
}