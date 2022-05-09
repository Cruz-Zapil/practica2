package practica2.intento.juegos.damas.disenio;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PintarCasilla {

    
    private static ImageIcon imagen;
    private static Icon icono;

    
    public static void pintarFichaBlanca(int filaPintar , int columnaPintar)
    {
        imagen = new ImageIcon("src\\main\\java\\practica2\\intento\\juegos\\damas\\imagenes\\fichaBlanca.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        Tablero.getCasillas(filaPintar, columnaPintar).setIcon(icono);
    }

    public static void pintarFichaNegra( int filaPintar , int columnaPintar ){
        imagen = new ImageIcon("src\\main\\java\\practica2\\intento\\juegos\\damas\\imagenes\\fichaNegra.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        Tablero.getCasillas(filaPintar, columnaPintar).setIcon(icono);
    }

    public static void pintarBlanca( int filaPintar , int columnaPintar)
    {
        imagen = new ImageIcon("src\\main\\java\\practica2\\intento\\juegos\\damas\\imagenes\\casillaBlanca.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT));
        Tablero.getCasillas(filaPintar,columnaPintar).setIcon(icono);
        
    }

    public static void pintaGris( int filaPintar , int columnaPintar)
    {
        imagen = new ImageIcon("src\\main\\java\\practica2\\intento\\juegos\\damas\\imagenes\\casillaGris.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        Tablero.getCasillas(filaPintar,columnaPintar).setIcon(icono);     
    }
    
}
