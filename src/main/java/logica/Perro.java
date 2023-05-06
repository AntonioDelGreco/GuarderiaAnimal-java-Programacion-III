
package logica;

public class Perro extends Animal{
    private String raza;

    public Perro() {}

    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println("hola me llamo: " + this.nombre + " y además soy un Perro.");
    }

    @Override
    public String toString(){
        return "\nTipo animal: Perro" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                this.duenio + "\n" +
                "Sexo: " + this.sexo.toString().toLowerCase() + "\n" +
                "Peso: " + this.peso + "\n" +
                "Raza: " + this.raza + "\n" +
                "Posicion de retiro: " + this.posicionRetiro;
    }
}
