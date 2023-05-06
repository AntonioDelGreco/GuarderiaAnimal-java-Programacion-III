package logica;

public class Gato extends Animal{
    public Gato(){}

    @Override
    public void saludar() {
        System.out.println("hola me llamo: " + this.nombre + " y además soy un Gato.");
    }

    @Override
    public String toString(){
        return "\nTipo animal: Gato" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                this.duenio + "\n" +
                "Sexo: " + this.sexo.toString().toLowerCase() + "\n" +
                "Peso: " + this.peso + "\n" +
                "Posicion de retiro: " + this.posicionRetiro;
    }
}
