package ejercicio5;

import listas.genericas.ListaEnlazadaGenerica;
import listas.genericas.ListaGenerica;

public class EstudiantesGenericos {

    public static void main(String[] args) {
        ListaGenerica<Estudiante>  estudiantes = new ListaEnlazadaGenerica<>();

        estudiantes.agregarFinal(new Estudiante("Priscila", "Faliani", "priscilafaliani@gmail.com", "Calle Falsa 123", 1));
        estudiantes.agregarFinal(new Estudiante("Ezequiel", "Faliani", "eze@gmail.com", "Calle Falsa 321", 3));
        estudiantes.agregarFinal(new Estudiante("Sebastian", "Faliani", "seba@gmail.com", "Calle Falsa 312", 2));
        estudiantes.agregarFinal(new Estudiante("Julio", "Faliani", "julio@gmail.com", "Calle Falsa 231", 4));

        estudiantes.comenzar();
        while (!estudiantes.fin()) {
            System.out.println(estudiantes.proximo().tusDatos());
        }

    }

}
