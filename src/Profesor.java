

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(){}

    public Profesor(String nombre, String apellidos, String dni, String especialidad){
        super(nombre, apellidos, dni);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
