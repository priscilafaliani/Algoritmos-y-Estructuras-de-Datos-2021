public class Estudiante extends Persona {
    private String comision;
    private String direccion;

    public Estudiante(String nombre, String apellido, String email, String comision, String direccion) {
        super(nombre, apellido, email);
        this.comision = comision;
        this.direccion = direccion;
    }

    public String getCatedra() {
        return this.catedra;
    }   

    public String getFacultad() {
        return this.facultad;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
