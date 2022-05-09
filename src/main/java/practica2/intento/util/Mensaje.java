
package practica2.intento.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Bohem
 */
public class Mensaje  {
    
    public  static  void  mostarMensajeError(String cuerpoMensaje , String titulo)
    { 
       JOptionPane.showMessageDialog(null, cuerpoMensaje, titulo, 0);
    }

    public static void mostrarMensajeInformation(String cuerpMensaje, String tituloMensaje)
    {
        JOptionPane.showMessageDialog(null, cuerpMensaje,tituloMensaje,1);
        
    }
    
    public static void mostrarMensajeInformation(int tmpTamaño, String tituloMensaje) {
        
        JOptionPane.showMessageDialog(null, tmpTamaño,tituloMensaje,1);
    }

   
    
    
    
}
