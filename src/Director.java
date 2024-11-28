public class Director extends Persona {
    private double valoracion;
    public  Director(){}
    public Director(String nombre, String apellidos, String dni, double valoracion){
        super(nombre, apellidos, dni);
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}
