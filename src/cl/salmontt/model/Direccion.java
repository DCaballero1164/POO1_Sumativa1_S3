package cl.salmontt.model;

public class Direccion {

    //Definicion de atributos
    private String calle;
    private String numero;
    private String ciudad;
    private String pais;
    private Integer codigoPostal;

    //Constructor
    public Direccion(String calle, String numero, String ciudad, String pais, Integer codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    //Getter
    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    //Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + getCalle() + '\'' +
                ", numero='" + getNumero() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", pais='" + getPais() + '\'' +
                ", codigoPostal='" + getCodigoPostal() + '\'' +
                '}';
    }
}