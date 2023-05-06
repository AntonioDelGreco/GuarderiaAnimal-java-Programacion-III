package logica.opcionesMenu;

import logica.Animal;

import static logica.opcionesMenu.IngresarAnimales.animales;
public class Saludo {

    private Saludo(){}
    public static void saludoDeMascotas(){
        for (Animal animal : animales ) {
            animal.saludar();
        }
    }
}
