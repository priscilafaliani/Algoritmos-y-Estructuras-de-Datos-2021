public class Analisis {

    private Resultado resultados;
    
    public Resultados analisis1(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int promedio = 0;

        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];

            if (numeros[i] >= max) {
                max = numeros[i];
            }

            if (numeros[i] <= min) {
                min = numeros[i];
            }
        }

        return new Resultados(max, min, promedio);
    }

    public void analisis2(int[] numeros, Resultado resultados) {
        if (numeros != null && numeros.length != 0) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int promedio = 0;
    
            for (int i = 0; i < numeros.length; i++) {
                promedio += numeros[i];
    
                if (numeros[i] >= max) {
                    max = numeros[i];
                }
    
                if (numeros[i] <= min) {
                    min = numeros[i];
                }
            }
    
            resultados.setMax(max);
            resultados.setMin(min);
            resultados.setPromedio(promedio);
        }
    }

    public void analisis3(int[] numeros) {
        if (numeros != null && numeros.length != 0) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int promedio = 0;
    
            for (int i = 0; i < numeros.length; i++) {
                promedio += numeros[i];
    
                if (numeros[i] >= max) {
                    max = numeros[i];
                }
    
                if (numeros[i] <= min) {
                    min = numeros[i];
                }
            }
    
            resultados.setMax(max);
            resultados.setMin(min);
            resultados.setPromedio(promedio);
        }
    }
}
