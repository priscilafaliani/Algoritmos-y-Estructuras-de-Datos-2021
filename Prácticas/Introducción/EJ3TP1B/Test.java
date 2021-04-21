public class Test {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Estudiante("Priscila1", "Faliani1", "priscilafaliani1@gmail.com", "1", "La Plata1");
        personas[1] = new Estudiante("Priscila2", "Faliani2", "priscilafaliani2@gmail.com", "2", "La Plata2");

        personas[2] = new Profesor("Priscila3", "Faliani3", "priscilafaliani3@gmail.com", "Matemáticas", "Astronomía");
        personas[3] = new Profesor("Priscila4", "Faliani4", "priscilafaliani4@gmail.com", "Programación", "Informática");
        personas[4] = new Profesor("Priscila5", "Faliani5", "priscilafaliani5@gmail.com", "Sistemas Operativos", "Ingeniería");

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
            System.out.println();
        }

    }
}
