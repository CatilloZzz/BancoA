package main.models;

public class City {




















    private String nombre;
    private String descripcion;
    private  String codigo;


    public City() {
    }


    public City(String nombre, String descripcion, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos de la ciudad\n"
                + "Nombre: " + this.getNombre()+
                "\nDescripcion" + this.getDescripcion()
                + "\nCodigo: " + this.getCodigo()
                + "\n =================================\n";
    }
}












