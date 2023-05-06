package logica.opcionesMenu;

import static logica.opcionesMenu.IngresarAnimales.animales;
public class CantMascotas {

    private CantMascotas(){}

    public static void cantMascotasActuales(){
        int cant = animales.size();
        System.out.println("\nLa cantidad de mascotas que tenemos actualmente es de: " + cant + " animales.");
    }
}
