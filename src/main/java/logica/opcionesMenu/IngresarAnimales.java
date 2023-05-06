package logica.opcionesMenu;

import logica.*;

import java.util.ArrayList;
import java.util.Scanner;

public class IngresarAnimales {

    private Scanner sc = new Scanner(System.in);
    public static ArrayList<Animal> animales = new ArrayList<Animal>();

    public IngresarAnimales(){}

    public void pidiendoDatos(){
        System.out.println("\nAqui puede ingresar su mascota. ");
        System.out.println("Necesitamos los datos del animal y luego de su duenio: ");
        Tipo tipo = tipoAnimal();
        String nombre = nombreAnimal();
        int edad = edadAnimal();
        Sexo sexo = sexoAnimal();
        double peso = pesoAnimal();
        Duenio duenio = duenioAnimal();

        switch (tipo){
            case PERRO:
                instanciaPerro(nombre, edad, sexo, peso, duenio);
                break;
            case MOJARRITA:
                instanciaMojarrita(nombre, edad, sexo, peso, duenio);
                break;
            case GATO:
                instanciaGato(nombre, edad, sexo, peso, duenio);
                break;
            case HAMSTER:
                instanciaHamster(nombre, edad, sexo, peso, duenio);
                break;
            default:
                Menu.menu();
        }
    }

    private void instanciaPerro(String nombre, int edad, Sexo sexo, double peso, Duenio duenio){
        Perro newPerro = new Perro();
        newPerro.setNombre(nombre);
        newPerro.setEdad(edad);
        newPerro.setSexo(sexo);
        newPerro.setPeso(peso);
        newPerro.setDuenio(duenio);
        newPerro.setRaza(razaPerro());
        if (animales.size() == 0){
            newPerro.setPosicionRetiro(0);
            animales.add(newPerro);
            System.out.println("\nLa posicion de su mascota es: 0");
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
        }else{
            Animal animal = animales.get(animales.size() - 1);
            int posicion = animal.getPosicionRetiro() + 1;
            newPerro.setPosicionRetiro(posicion);
            System.out.println("\nLa posicion de su mascota es: " + posicion);
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
            animales.add(newPerro);
        }
    }
    private void instanciaMojarrita(String nombre, int edad, Sexo sexo, double peso, Duenio duenio){
        Mojarrita newMojarrita = new Mojarrita();

        newMojarrita.setNombre(nombre);
        newMojarrita.setEdad(edad);
        newMojarrita.setSexo(sexo);
        newMojarrita.setPeso(peso);
        newMojarrita.setDuenio(duenio);
        newMojarrita.setAgua(aguaMojarrita());

        if (animales.size() == 0){
            newMojarrita.setPosicionRetiro(0);
            animales.add(newMojarrita);
            System.out.println("\nLa posicion de su mascota es: 0");
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
        }else{
            Animal animal = animales.get(animales.size() - 1);
            int posicion = animal.getPosicionRetiro() + 1;
            newMojarrita.setPosicionRetiro(posicion);
            System.out.println("\nLa posicion de su mascota es: " + posicion);
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
            animales.add(newMojarrita);
        }
    }
    private void instanciaGato(String nombre, int edad, Sexo sexo, double peso, Duenio duenio){
        Gato newGato = new Gato();

        newGato.setNombre(nombre);
        newGato.setEdad(edad);
        newGato.setSexo(sexo);
        newGato.setPeso(peso);
        newGato.setDuenio(duenio);

        if (animales.size() == 0){
            newGato.setPosicionRetiro(0);
            animales.add(newGato);
            System.out.println("\nLa posicion de su mascota es: 0");
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
        }else{
            Animal animal = animales.get(animales.size() - 1);
            int posicion = animal.getPosicionRetiro() + 1;
            newGato.setPosicionRetiro(posicion);
            System.out.println("\nLa posicion de su mascota es: " + posicion);
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
            animales.add(newGato);
        }
    }
    private void instanciaHamster(String nombre, int edad, Sexo sexo, double peso, Duenio duenio){
        Hamster newHamster = new Hamster();

        newHamster.setNombre(nombre);
        newHamster.setEdad(edad);
        newHamster.setSexo(sexo);
        newHamster.setPeso(peso);
        newHamster.setDuenio(duenio);

        if (animales.size() == 0){
            newHamster.setPosicionRetiro(0);
            animales.add(newHamster);
            System.out.println("\nLa posicion de su mascota es: 0");
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
        }else{
            Animal animal = animales.get(animales.size() - 1);
            int posicion = animal.getPosicionRetiro() + 1;
            newHamster.setPosicionRetiro(posicion);
            System.out.println("\nLa posicion de su mascota es: " + posicion);
            System.out.print("Presione enter para continuar.");
            sc.nextLine();
            animales.add(newHamster);
        }
    }

    private Agua aguaMojarrita(){
        System.out.println("\nTipo del agua: ");
        boolean tipoValido = false;
        Agua agua = null;
        while (!tipoValido) {
            try {
                System.out.println("\n1) Fria\n2) Tropical");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        agua = Agua.FRIA;
                        tipoValido = true;
                        break;
                    case 2:
                        agua = Agua.TROPICAL;
                        tipoValido = true;
                        break;
                    default:
                        System.out.println("Opción inválida, seleccione nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número.");
                sc.nextInt();
                sc.nextLine();
            }
        }
        return agua;
    }

    private String razaPerro(){
        System.out.print("Raza de su perro: ");
        return sc.nextLine();
    }

    private Duenio duenioAnimal(){
        String nombre = null;
        String dni = null;
        String direccion = null;
        System.out.print("Nombre del duenio: ");
        nombre = sc.nextLine();
        System.out.print("DNI del duenio: ");
        dni = sc.nextLine();
        System.out.print("Direccion del duenio: ");
        direccion = sc.nextLine();
        return new Duenio(nombre, dni, direccion);
    }

    private double pesoAnimal(){
        double peso;
        System.out.print("Peso de su mascota: ");
        peso = sc.nextDouble();
        sc.nextLine();
        return peso;
    }

    private Sexo sexoAnimal(){
        boolean tipoValido = false;
        Sexo sexo = null;
        while (!tipoValido) {
            try {
                System.out.println("\n1) Macho\n2) Hembra");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        sexo = Sexo.MACHO;
                        tipoValido = true;
                        break;
                    case 2:
                        sexo = Sexo.HEMBRA;
                        tipoValido = true;
                        break;
                    default:
                        System.out.println("Opción inválida, seleccione nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número.");
                sc.nextInt();
                sc.nextLine();
            }
        }
        return sexo;
    }

    private int edadAnimal(){
        int edad;
        System.out.print("Edad de su mascota: ");
        edad = sc.nextInt();
        return edad;
    }

    private String nombreAnimal(){
        System.out.print("Nombre de la mascota: ");
        return sc.nextLine();
    }
    private Tipo tipoAnimal(){
        boolean tipoValido = false;
        Tipo tipo = null;
        System.out.print("Que tipo de animal es? ");
        while (!tipoValido) {
            try {
                System.out.println("\n1) Perro\n2) Gato\n3) Hamster\n4) Mojarrita");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        tipo = Tipo.PERRO;
                        tipoValido = true;
                        break;
                    case 2:
                        tipo = Tipo.GATO;
                        tipoValido = true;
                        break;
                    case 3:
                        tipo = Tipo.HAMSTER;
                        tipoValido = true;
                        break;
                    case 4:
                        tipo = Tipo.MOJARRITA;
                        tipoValido = true;
                        break;
                    default:
                        System.out.println("Opción inválida, seleccione nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número.");
                sc.nextInt();
                sc.nextLine();
            }
        }
        return tipo;
    }
}
