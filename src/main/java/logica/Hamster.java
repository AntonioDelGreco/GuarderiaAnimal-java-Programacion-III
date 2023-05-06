package logica;

public class Hamster extends Animal{
    public Hamster(){}

    @Override
    public void saludar() {
        System.out.println("hola me llamo: " + this.nombre + " y además soy un Hamster.");
    }

    @Override
    public String toString(){
        return "\nTipo animal: Hamster" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                this.duenio + "\n" +
                "Sexo: " + this.sexo.toString().toLowerCase() + "\n" +
                "Peso: " + this.peso + "\n" +
                "Posicion de retiro: " + this.posicionRetiro;
    }

}
