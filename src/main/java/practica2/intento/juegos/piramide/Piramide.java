
package practica2.intento.juegos.piramide;

import practica2.intento.juegos.piramide.disenio.Panel;
import practica2.intento.juegos.piramide.disenio.Panel2;
import practica2.intento.juegos.piramide.disenio.Panel3;

/**
 *
 * @author Bohem
 */
public class Piramide extends javax.swing.JFrame  {
    
    private Panel mesa;
    private Panel2 mesa2;
    private Panel3 mesa3;
    
    public Piramide() {

        this.setTitle("Piramide");

        this.setSize(900, 400);
        this.setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocation(500, 250);

        mesa = new Panel();
        mesa2 = new Panel2();
        mesa3 = new Panel3();
        
        add(mesa);
        add(mesa2);
        add(mesa3);
        
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


  

}
