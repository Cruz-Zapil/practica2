package practica2.intento.juegos.piramide.eventos;

import java.awt.event.*;

import practica2.intento.juegos.piramide.disenio.Panel;
import practica2.intento.juegos.piramide.disenio.Panel2;
import practica2.intento.juegos.piramide.disenio.Panel3;
import practica2.intento.juegos.utilidades.Label;
import practica2.intento.util.Mensaje;

public class Accion implements ActionListener {

    public static int x = 0, sx = 0;
    public static int y = 0;
    public static int contadorBotones = 0;

    public static Label botonAuxi;

    @Override
    public void actionPerformed(ActionEvent e) {

        String text = e.getActionCommand();

        if (text.equals("Sacar")) {
            if (Panel.darPaso() == true) {
                accionePanelSacar();
            } else {
                Mensaje.mostarMensajeError("Esta vacio", "Error");
            }

        } else if (text.equals("Ingresar")) {
            accionePanelIngresar();

        } else if (text.equals("Ingresar2")) {
            accionePanel2Ingresar();

        } else if (text.equals("Sacar2")) {

            if (Panel2.darPaso() == true) {

                accionePanel2Sacar();
            } else {
                Mensaje.mostarMensajeError(" esta vacio", "Error");
            }

        } else if (text.equals("Ingresar3")) {
            accionePanel3Ingresar();

        } else if (text.equals("Sacar3")) {

            if (Panel3.darPaso() == true) {

                accionePanel3Sacar();
            } else {
                Mensaje.mostarMensajeError(" esta vacio", " Error");
            }
        }
    }

    public void accionePanelSacar() {

        if (botonAuxi == null) {
            int tmp = Panel.enviarPosicionBoton();
            sx = Panel.getObjeto(tmp).getsX();
            x = Panel.getObjeto(tmp).getX();
            botonAuxi = Panel.getObjeto(tmp);
            Panel.modTamanio(tmp, false);
            aumetarContador();
        } else {
            Mensaje.mostarMensajeError("esta lleno ", " Error");
        }
    }

    public void accionePanelIngresar() {
        if (botonAuxi != null) {
            int tmp = Panel.enviarPosicionBoton();
            y = Panel.getObjeto(tmp - 1).getY();
            Panel.setBouns(x, y, sx, tmp - 1);
            botonAuxi = null;
            Panel.odenar();
            aumetarContador();
        } else {
            Mensaje.mostarMensajeError("esta vacio", " error");
        }
    }

    public void accionePanel2Sacar() {
        if (botonAuxi == null) {
            int tmp = Panel2.enviarPosicionBoton();
            sx = Panel2.getObjeto(tmp).getsX();
            x = Panel2.getObjeto(tmp).getX();
            botonAuxi = Panel2.getObjeto(tmp);
            Panel2.modTamanio(tmp, false);
            aumetarContador();
        } else {
            Mensaje.mostarMensajeError(" esta lleno", " Error");
        }
    }

    public void accionePanel2Ingresar() {
        if (botonAuxi != null) {
            int tmp = Panel2.enviarPosicionBoton();
            y = Panel2.getObjeto(tmp - 1).getY();
            Panel2.setBouns(x, y, sx, tmp - 1);
            botonAuxi = null;
            Panel2.odenar();
            aumetarContador();
        } else {
            Mensaje.mostarMensajeError(" esta vacio", " error");
        }
    }

    public void accionePanel3Sacar() {
        if (botonAuxi == null) {
            int tmp = Panel3.enviarPosicionBoton();
            sx = Panel3.getObjeto(tmp).getsX();
            x = Panel3.getObjeto(tmp).getX();
            botonAuxi = Panel3.getObjeto(tmp);
            Panel3.modTamanio(tmp, false);
            aumetarContador();
        } else {
            Mensaje.mostarMensajeError(" esta lleno", " Error");
        }
    }

    public void accionePanel3Ingresar() {
        if (botonAuxi != null) {
            int tmp = Panel3.enviarPosicionBoton();
            y = Panel3.getObjeto(tmp - 1).getY();
            Panel3.setBouns(x, y, sx, tmp - 1);
            botonAuxi = null;
            aumetarContador();
            Panel3.odenar();

        } else {

            Mensaje.mostarMensajeError(" esta vacio", " error");
        }
    }

    public void aumetarContador() {
        contadorBotones++;
        Panel.contadorBoton.setText(" Toques: " + contadorBotones);
    }

}
