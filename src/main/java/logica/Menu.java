package logica;

import logica.opcionesMenu.IngresarAnimales;
import logica.opcionesMenu.RetirarAnimales;
import static logica.opcionesMenu.MostrarMascotas.verDatos;
import static logica.opcionesMenu.CantMascotas.cantMascotasActuales;
import static logica.opcionesMenu.Saludo.saludoDeMascotas;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static int opcion;
    private static boolean salir = false;

    private Menu(){}

    public static void menu(){
        while(!salir){

            try {
                System.out.println("\n******GUARDERIA ANIMAL******");
                System.out.println("1) Ingrese a su mascota a la guarderia.");
                System.out.println("2) Retire a su mascota de la guarderia");
                System.out.println("3) Ver la cantidad de mascotas que tenemos actualmente.");
                System.out.println("4) Mostrar todas las mascotas que tenemos actualmente.");
                System.out.println("5) Hacer que todas las mascotas saluden.");
                System.out.println("0) Salir del programa.");

                System.out.print("\nIngrese el numero de su opcion elegida: ");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        IngresarAnimales ingreso = new IngresarAnimales();
                        ingreso.pidiendoDatos();
                        break;
                    case 2:
                        RetirarAnimales retiro = new RetirarAnimales();
                        retiro.sacarMascotaDeGuarderia();
                        break;
                    case 3:
                        cantMascotasActuales();
                        break;
                    case 4:
                        verDatos();
                        break;
                    case 5:
                        saludoDeMascotas();
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nNumeros del 1 al 5.");
                }

            }catch (Exception e){
                System.out.print("\nLa opcion ingresada no es valida.\n");
                sc.next();
            }
        }
    }
}

