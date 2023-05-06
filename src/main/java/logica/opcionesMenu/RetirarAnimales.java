package logica.opcionesMenu;

import logica.Animal;

import java.util.Scanner;

import static logica.opcionesMenu.IngresarAnimales.animales;

public class RetirarAnimales {

    private Scanner sc = new Scanner(System.in);

    public RetirarAnimales(){}

    public void sacarMascotaDeGuarderia(){
        int posicionRetiroMascota = pidiendoPosicion();
        for (Animal animal : animales) {
            if (animal.getPosicionRetiro() == posicionRetiroMascota){
                animales.remove(animal);
            }
        }
        System.out.println("Su animal fue retirado, pulse enter para continuar.");
        sc.nextLine();
    }

    private int pidiendoPosicion(){
        System.out.print("Numero que le fue asignado a su mascota al momento de ingresar? ");
        int posicion = sc.nextInt();
        sc.nextLine();
        return posicion;
    }

}
