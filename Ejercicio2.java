
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    private static String nombreOrutaFichero;


    public static void leerFichero (){

        Scanner memoria = new Scanner(System.in);

        System.out.println("Escribe al nombre");

        nombreOrutaFichero = memoria.nextLine();


        FileReader lector = null;
        
        try {
            lector = new FileReader(nombreOrutaFichero); 

            int caracter = 0; 

         
            while(caracter!=-1) {

                caracter = lector.read();
                

                char traductor = (char) caracter;

                System.out.print(traductor);

            } 
        } catch (IOException e){

            System.out.println("error");
        }
    }



}