package practica1.ejercicio5;

public class Ejercicio5 {

    private int max;
    private int min;
    private int promedio;
    
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 10, -1, 24, 15, 22};
        System.out.println(funcionV1(numeros));
        
        Datos datos = new Datos();
        funcionV2(numeros, datos);
        System.out.println(datos);

        funcionV3(numeros);
    }

    public static Datos funcionV1(int[] numeros) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double promedio = 0;

        for (int n : numeros) {
            promedio += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        return new Datos(max, min, promedio / numeros.length);
    }

    public static void funcionV2(int[] numeros, Datos datos) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double promedio = 0;

        for (int n : numeros) {
            promedio += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        datos.setMax(max);
        datos.setMin(min);
        datos.setPromedio(promedio / numeros.length);
    }

    public void funcionV3(int[] numeros) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double promedio = 0;

        for (int n : numeros) {
            promedio += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        // System.out.println(new Datos(max, min, promedio / numeros.length).toString());
        this.min = min;
        this.max = max;
        this.promedio = promedio / numeros.length
    }
}
