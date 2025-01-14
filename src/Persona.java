public abstract class Persona {

    private String nombre, apellidos, dni;

    public Persona(){

    }

    public Persona(String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void imprimir(){
        System.out.print("Nombre: "+ this.nombre+", apellidos: "+ this.apellidos+", dni: "+ this.dni);
    }
}
