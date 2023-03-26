import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
 

    private static String nombreFichero;

    private static String mensaje;

    private static String selector;

    private static String mensajeExtra;
    
    private static String nuevoMensaje;


    public static void recibirParametrosModificables () {

        Scanner memoria = new Scanner(System.in);

        System.out.println("Escribe un nombre y/o ruta para el fichero");

        nombreFichero = memoria.nextLine();

        System.out.println("Ecribe el mensaje a guardar");

        mensaje = memoria.nextLine();

        System.out.println("Escribe 'si' para añadir un mensaje  " +

                "o 'no' para sobreescribir fichero");

        selector = memoria.nextLine();

        try {
            FileWriter ficheroEntrada = new FileWriter(nombreFichero);

            if (selector.equalsIgnoreCase("si")) { 

                System.out.println("Escribe el mensaje que quieres añadir");

                mensajeExtra = memoria.nextLine();
                ficheroEntrada.write(mensaje + " " +mensajeExtra);

                ficheroEntrada.close();

            }if (selector.equalsIgnoreCase("no")){

                System.out.println("Escribe mensaje para sobreescribir");

                nuevoMensaje = memoria.nextLine();

                ficheroEntrada.write(nuevoMensaje);

                ficheroEntrada.close();
            }
            System.out.println("El archivo se ha generado ");

        }
        catch (IOException e) {

            System.out.println(" error");
        }


    }







}