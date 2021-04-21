public class Resultados {
    private int max;
    private int min;
    private double promedio;

    public Resultados(int max, int min, double promedio) {
        this.max = max;
        this.min = min;
        this.promedio = promedio;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    public int getMax() {
        return this.max;
    }
    
    public int getMin() {
        return this.min;
    }
    
    public double getPromedio() {
        return this.promedio;
    }
}
