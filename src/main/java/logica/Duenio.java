package logica;

public class Duenio {
    private String nombre;
    private String dni;
    private String direccion;

    public Duenio(String nombre, String dni, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Nombre del duenio: " + this.nombre + "\n" +
                "Dni del duenio: " + this.dni + "\n" +
                "Direccion del duenio: " + this.direccion;
    }
}
