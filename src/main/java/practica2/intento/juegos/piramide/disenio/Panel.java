package practica2.intento.juegos.piramide.disenio;

import javax.swing.*;

import practica2.intento.juegos.piramide.eventos.Accion;
import practica2.intento.juegos.utilidades.Bontones;
import practica2.intento.juegos.utilidades.Label;
import practica2.intento.util.Mensaje;
import practica2.intento.util.Util;
import java.awt.Color;

public class Panel extends JPanel {

    private static Label nuevoBotonG1[] = new Label[5];
    public static int[] medidas = { 150, 140, 30, 130, 120, 40, 110, 100, 90, 80, 70, 60, 50 };

    private JButton ingresar, sacar; 
    public static JLabel contadorBoton;

    public Panel() {
        this.setBounds(0, 0, 300, 700);
        this.setLayout(null);
        setVisible(true);
        setOpaque(false);
        agregarBo(50, 120);

        for (int i = 0; i < nuevoBotonG1.length; i++) {

            nuevoBotonG1[i].setBackground(Color.lightGray);
            nuevoBotonG1[i].setOpaque(true);

            add(nuevoBotonG1[i]);
        }

        ingresar = new Bontones();
        ingresar.setBounds(20, 20, 70, 20);
        ingresar.setText("Ingresar");

        sacar = new Bontones();
        sacar.setBounds(100, 20, 70, 20);
        sacar.setText("Sacar");
        
        contadorBoton= new JLabel(" Toques: ");
        contadorBoton.setText(String.valueOf(Accion.contadorBotones));
        contadorBoton.setBounds(0,0, 70, 20);
        contadorBoton.setVisible(true);

        add(contadorBoton);
        add(ingresar);
        add(sacar);
        ingresar.addActionListener(new Accion());
        sacar.addActionListener(new Accion());

    }

    public void agregarBo(int x, int y) {

        for (int i = 0; i < nuevoBotonG1.length; i++) {
            int tmp = Util.generarNumeroRandom(0, medidas.length);
            int tmpMedida = medidas[tmp];
            int tmpcentrar = x + ((150 - tmpMedida) / 2);
            int tmpY = y += 20;
            nuevoBotonG1[i] = new Label(tmpcentrar, tmpY, tmpMedida, true);
            nuevoBotonG1[i].setBounds(tmpcentrar, tmpY, tmpMedida, 20);
        }
    }


    public static boolean darPaso()
    {
        for (int i = 0; i <nuevoBotonG1.length; i++) {
            if(nuevoBotonG1[i].isAd()==true)
            {
                return true;
            }
        }
        return false;
    }


    //// devulve la posicon del boton
    public static int enviarPosicionBoton() {
        for (int i = 0; i < nuevoBotonG1.length; i++) {
            if (nuevoBotonG1[i].isAd() == true) {
                return i;
            }
        }
        return 5;
    }

    /// modifica el atributo del boton Sx
    public static void modTamanio(int posicion, Boolean activa) {
        nuevoBotonG1[posicion].setAd(activa);
        nuevoBotonG1[posicion].setVisible(false);
    }

    //// cambirar atributos al jlabel
    public static void setBouns(int x, int y, int sx, int poscion) {
        nuevoBotonG1[poscion].setX(x);
        nuevoBotonG1[poscion].setY(y);
        nuevoBotonG1[poscion].setsX(sx);
        nuevoBotonG1[poscion].setAd(true);
        nuevoBotonG1[poscion].setBounds(x, y, sx, 20);
        nuevoBotonG1[poscion].setVisible(true);
    }

    ///// enviamos el objeto a otra clase
    public static Label getObjeto(int posicion) {
        return nuevoBotonG1[posicion];
    }

    

    public static void odenar() {
        int contador = 0;
        for (int i = 0; i < nuevoBotonG1.length; i++) {
            if (nuevoBotonG1[i].isAd() == true) {
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
        for (int i = 0; i < nuevoBotonG1.length - 1; i++) {
            if (nuevoBotonG1[i].getsX() < nuevoBotonG1[i + 1].getsX()
                    || nuevoBotonG1[i].getsX() == nuevoBotonG1[i + 1].getsX()) {
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
