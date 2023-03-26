import java.io.*;

public class Main {
    public static void main(String[] args) {

     
        

        Mosn persona1 = new Mosn();
        persona1.setNombre("Maria");
        persona1.setApellido("Rodriguez");
        persona1.setEdad(33);
        persona1.setDni("53554420K");



            try {
                ObjectOutputStream salidaFichero = new ObjectOutputStream(new FileOutputStream("FicheroObjeto.txt"));
                salidaFichero.writeObject(persona1);
                salidaFichero.close();

            }catch (IOException e) {
                System.out.println("Ha habido un error");
            }



        try{
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("FicheroObjeto.txt"));
            Mosn Mosn = (Mosn) leerFichero.readObject();
            leerFichero.close();
            System.out.println(persona1);
        }catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }




        }
}