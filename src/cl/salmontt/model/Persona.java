package cl.salmontt.model;

public class Persona {
    //Se definen los atributos para una persona
    private String nombres;
    private String apellidos;
    private Integer id;
    private String correoElectronico;
    private Integer numeroTelefonico;
    private Direccion direccion;

    //Constructor de la clase Persona
    public Persona(String nombres, String apellidos, Integer id, String correoElectronico, Integer numeroTelefonico, Direccion direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.direccion = direccion;
    }

    //Getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Integer getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    //Setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNumeroTelefonico(Integer numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Persona{" +
                "apellidos='" + getApellidos() + '\'' +
                ", nombres='" + getNombres() + '\'' +
                ", id=" + getId() +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", numeroTelefonico=" + getNumeroTelefonico() +
                ", direccion=" + getDireccion() +
                '}';
    }
}
