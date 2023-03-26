import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    private static String nombreFichero;

    private static String mensaje;


    public static void recibirParametros (){


        Scanner memoria = new Scanner(System.in);
        
        System.out.println("Escribe un nombre ");

        nombreFichero = memoria.nextLine();

        System.out.println("Ecribe el mensaje");

        mensaje = memoria.nextLine();

        try {
            FileWriter ficheroEntrada = new FileWriter(nombreFichero);

            ficheroEntrada.write(mensaje);

            ficheroEntrada.close();

            System.out.println("El archivo se genero");
        }
        catch (IOException e) {
            System.out.println("error");
        }

    }



}