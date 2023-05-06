package logica;

public class Mojarrita extends Animal{
    private Agua agua;

    public Mojarrita(){}

    @Override
    public void saludar() {
        System.out.println("hola me llamo: " + this.nombre + " y además soy una Mojarrita.");
    }

    public void setAgua(Agua agua){
        this.agua = agua;
    }

    @Override
    public String toString(){
        return "\nTipo animal: Mojarrita" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                this.duenio + "\n" +
                "Sexo: " + this.sexo.toString().toLowerCase() + "\n" +
                "Peso: " + this.peso + "\n" +
                "Tipo de agua: " + this.agua.toString().toLowerCase() + "\n" +
                "Posicion de retiro: " + this.posicionRetiro;
    }
}
