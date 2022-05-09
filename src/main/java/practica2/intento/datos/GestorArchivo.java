package practica2.intento.datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import practica2.intento.util.Mensaje;

public class GestorArchivo {

    public static  DatosUsuario dato;

    public static void gestionarArchivos() {

        FileOutputStream fichero = null;

        try {
            Mensaje.mostarMensajeError(" aqui intando crear archivo", " holis");
            fichero = new FileOutputStream("datos.html");
            ObjectOutputStream filtrado = new ObjectOutputStream(fichero);
            filtrado.writeObject(Consultor.getAlmacenamieto());

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

      
    }


    public static DatosUsuario leerArchivos ()
    {

        FileInputStream ficheroEntrada = null;
       
        try {

            System.out.println(" intentando ");
            ficheroEntrada = new FileInputStream("datos.html");
            ObjectInputStream filtradoEntrada = new ObjectInputStream(ficheroEntrada);
            dato = (DatosUsuario) filtradoEntrada.readObject();


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {

            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        return dato;
    }
}
