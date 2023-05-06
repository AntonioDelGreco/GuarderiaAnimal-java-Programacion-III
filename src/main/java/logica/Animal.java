package logica;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected Duenio duenio;
    protected Sexo sexo;
    protected double peso;
    protected int posicionRetiro;

    public Animal() {}

    public abstract void saludar();
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDuenio(Duenio duenio){
        this.duenio = duenio;
    }
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    public void setPosicionRetiro(int numero){ this.posicionRetiro = numero; }
    public int getPosicionRetiro(){
        return this.posicionRetiro;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

}
