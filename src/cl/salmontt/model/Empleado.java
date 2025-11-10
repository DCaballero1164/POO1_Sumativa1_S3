package cl.salmontt.model;

//La clase empleado extendida de Persona, para evitar duplicados de informacion
public class Empleado extends Persona {

    //Atributos de la clase Empleado
    private String area;
    private String cargo;
    private double sueldo;

    public Empleado(String nombres, String apellidos, Integer id, String correoElectronico, Integer numeroTelefonico, Direccion direccion, String area, String cargo, double sueldo) {
        super(nombres, apellidos, id, correoElectronico, numeroTelefonico, direccion);
        this.area = area;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getArea() {
        return area;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Empleado{" +
                super.toString() + //super.toString para heredar los atributos de Persona
                ", area='" + getArea() + '\'' +
                ", cargo='" + getCargo() + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}
