package practica1.ejercicio3;

public class Test {
    
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];


        estudiantes[0] = new Estudiante();
        estudiantes[0].setNombre("Priscila");
        estudiantes[0].setApellido("Faliani");
        estudiantes[0].setEmail("priscilafaliani@gmail.com");
        estudiantes[0].setDireccion("Calle Falsa 123");
        estudiantes[0].setComision(1);

        estudiantes[1] = new Estudiante();
        estudiantes[1].setNombre("Ezequiel");
        estudiantes[1].setApellido("Faliani");
        estudiantes[1].setEmail("ef@gmail.com");
        estudiantes[1].setDireccion("Calle Falsa 321");
        estudiantes[1].setComision(2);

        profesores[0] = new Profesor();
        profesores[0].setNombre("Juan");
        profesores[0].setApellido("Perez");
        profesores[0].setEmail("jp@gmail.com");
        profesores[0].setCatedra("Quimica");
        profesores[0].setFacultad("Ingenieria");

        profesores[1] = new Profesor();
        profesores[1].setNombre("Paco");
        profesores[1].setApellido("Milanesa");
        profesores[1].setEmail("pm@gmail.com");
        profesores[1].setCatedra("Estudio de la milanga");
        profesores[1].setFacultad("Ingenieria");

        profesores[2] = new Profesor();
        profesores[2].setNombre("Dobby");
        profesores[2].setApellido("Sanchez");
        profesores[2].setEmail("ds@gmail.com");
        profesores[2].setCatedra("Matematicas");
        profesores[2].setFacultad("Ingenieria");

        for (Estudiante e : estudiantes) {
            System.out.println(e.tusDatos());
        }

        for (Profesor p : profesores) {
            System.out.println(p.tusDatos());
        }
    }

}
