package practica2.intento.util;

import java.util.Random;

import practica2.intento.PanelPrincipal;



/**
 *
 * @author Bohem
 */
public class Util {

    public static Random random = new Random();
    public static void abrirPanelPrincipal()
    {
        PanelPrincipal abrir= new PanelPrincipal();
        abrir.setVisible(true);
    }

    
    public static int generarNumeroRandom(int min, int max) {

        return random.nextInt(max - min) + min;
    }



    
}
