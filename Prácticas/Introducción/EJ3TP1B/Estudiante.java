public class Estudiante extends Persona {
    private String comision;
    private String direccion;

    public Estudiante(String nombre, String apellido, String email, String comision, String direccion) {
        super(nombre, apellido, email);
        this.comision = comision;
        this.direccion = direccion;
    }

    public String getComision() {
        return this.comision;
    }   

    public String getDireccion() {
        return this.direccion;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            "Comisión: " + getComision() + "\n" +
            "Dirección: " + getDireccion();
    }
}
