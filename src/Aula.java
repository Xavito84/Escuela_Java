public class Aula {

    private Alumno[] alumnos;
    private Profesor profesor;
    private String idAula;

    public Aula() {}

    public Aula(Alumno[] alumnos, Profesor profesor, String idAula) {
        this.alumnos = alumnos;
        this.profesor=profesor;
        this.idAula = idAula;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }
    public double getNotaMediaAula() {
        double total=0.0;
        for(Alumno alumno :alumnos){
            if(alumno instanceof Delegado){
                Delegado de = (Delegado) alumno;
                total +=0.1 * de.getValoracion();
                total+= alumno.getNotaMedia();
            }else{
                total+= alumno.getNotaMedia();
            }
        }
        return  total/alumnos.length;
    }

    public void imprimeListadoAlumnos(){
        System.out.println("-----------"+ this.getIdAula()+"----------");
        System.out.println("------------------------------------------");
        for(Alumno alumno: alumnos){
            alumno.imprimir();
        }
    }

    public Alumno getMejorAlumno(){
        Alumno mejorAlumno= new Alumno();
        double mejorNota= 0.0;
        for (Alumno alumno: alumnos) {
            if (alumno.getNotaMedia() > mejorNota) {
                mejorAlumno = alumno;
            }
        }
        return mejorAlumno;
    }


}
