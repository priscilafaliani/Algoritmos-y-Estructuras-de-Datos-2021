package practica1.ejercicio5;

public class Datos {
    private int max;
    private int min;
    private double promedio;

    public Datos() {}

    public Datos(int max, int min, double promedio) {
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
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getPromedio() {
        return promedio;
    }

    public String toString() {
        return "Valor maximo del array: " + getMax() + " "
            + "Valor minimo del array: " + getMin() + " "
            + "Promedio de valor del array: " + getPromedio();
    }
}
