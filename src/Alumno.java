public class Alumno extends Persona {

    private String curso;
    private double notaMedia;

    public Alumno(){
    }
    public Alumno(String nombre, String apellidos, String dni, String curso, double notaMedia){
        super(nombre, apellidos, dni);
        this.curso  = curso;
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(", Curso: "+ this.curso+", la nota media es: "+ this.notaMedia);
    }
}
