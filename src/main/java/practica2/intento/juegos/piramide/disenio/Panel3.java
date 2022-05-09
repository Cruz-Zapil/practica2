package practica2.intento.juegos.piramide.disenio;

import javax.swing.JButton;
import javax.swing.JPanel;

import practica2.intento.juegos.piramide.eventos.Accion;
import practica2.intento.juegos.utilidades.Bontones;
import practica2.intento.juegos.utilidades.Label;
import practica2.intento.util.Mensaje;

import java.awt.Color;

public class Panel3 extends JPanel {
    private static Label nuevoBotonG3[] = new Label[5];
    private JButton ingresar, sacar;

    public Panel3() {

        this.setBounds(600, 0, 300, 700);
        this.setLayout(null);
        setVisible(true);
        setOpaque(false);
        agregarBo(50, 120);

        for (int i = 0; i < nuevoBotonG3.length; i++) {
            nuevoBotonG3[i].setBackground(Color.lightGray);
            nuevoBotonG3[i].setOpaque(true);
            nuevoBotonG3[i].setVisible(false);
            add(nuevoBotonG3[i]);
        }

        ingresar = new Bontones();
        ingresar.setBounds(20, 20, 70, 20);
        ingresar.setText("Ingresar3");

        sacar = new Bontones();
        sacar.setBounds(100, 20, 70, 20);
        sacar.setText("Sacar3");

        add(ingresar);
        add(sacar);
        ingresar.addActionListener(new Accion());
        sacar.addActionListener(new Accion());
    }

    public void agregarBo(int x, int y) {
        for (int i = 0; i < 5; i++) {
            y += 20;
            nuevoBotonG3[i] = new Label(x, y, 170, false);
            nuevoBotonG3[i].setBounds(x, y, 170, 20);
        }
    }

    //// devulve la posicon del boton
    public static int enviarPosicionBoton() {
        int tmpOsision = 0;
        for (int i = 0; i < nuevoBotonG3.length; i++) {
            if (nuevoBotonG3[i].isAd() == false) {
                tmpOsision++;
            } else {
                break;
            }
        }
        return tmpOsision;
    }

    public static boolean darPaso() {
        for (int i = 0; i < nuevoBotonG3.length; i++) {
            if (nuevoBotonG3[i].isAd() == true) {
                return true;
            }

        }
        return false;
    }

    /// modifica el atributo del boton Sx
    public static void modTamanio(int posicion, boolean activo) {
        nuevoBotonG3[posicion].setAd(activo);
        nuevoBotonG3[posicion].setVisible(false);
    }

    //// cambirar atributos al jlabel
    public static void setBouns(int x, int y, int sx, int poscion) {
        nuevoBotonG3[poscion].setX(x);
        nuevoBotonG3[poscion].setY(y);
        nuevoBotonG3[poscion].setsX(sx);
        nuevoBotonG3[poscion].setAd(true);
        nuevoBotonG3[poscion].setBounds(x, y, sx, 20);
        nuevoBotonG3[poscion].setVisible(true);
    }

    ///// enviamos el objeto a otra clase
    public static Label getObjeto(int posicion) {
        return nuevoBotonG3[posicion];
    }






    public static void odenar() {
        int contador = 0;
        for (int i = 0; i < nuevoBotonG3.length; i++) {
            if (nuevoBotonG3[i].isAd() == true) {
                contador++;
            } else {
                break;
            }
        }
        if (contador == 5) {
            if (burguja() == true) {
                Mensaje.mostarMensajeError(" ya esta ", " felicidades");
            }
        }
    }

    public static boolean burguja() {
        int contador = 0;
        for (int i = 0; i < nuevoBotonG3.length - 1; i++) {
            if (nuevoBotonG3[i].getsX() < nuevoBotonG3[i + 1].getsX()
                    || nuevoBotonG3[i].getsX() == nuevoBotonG3[i + 1].getsX()) {
                contador++;
            } else {
                break;
            }
        }
        if (contador == 4) {
            return true;
        }
        return false;
    }

}
