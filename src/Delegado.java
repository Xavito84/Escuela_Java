public class Delegado extends Alumno {
    private  double valoracion;

    public Delegado() {}

    public Delegado(String nombre, String apellidos, String dni,String curso, double notaMedia, double valoracion){
        super(nombre, apellidos, dni, curso, notaMedia);
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}
