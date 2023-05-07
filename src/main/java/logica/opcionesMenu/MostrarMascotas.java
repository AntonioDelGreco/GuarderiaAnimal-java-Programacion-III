package logica.opcionesMenu;

import logica.Animal;

import static logica.opcionesMenu.IngresarAnimales.animales;

public class MostrarMascotas {
    private MostrarMascotas(){}
    public static void verDatos(){
        for (Animal animal : animales ) {
            System.out.println(animal + "\n");
        }
        if (animales.size() == 0){
            System.out.println("\nNo hay mascotas en la guarderia actualmente.");
        }
    }
}
