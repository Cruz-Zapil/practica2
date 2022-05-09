package practica2.intento.juegos.damas.eventos;

import java.awt.Color;
import java.awt.event.*;

import practica2.intento.juegos.damas.disenio.Tablero;
import practica2.intento.util.Mensaje;

public class AccionDama implements ActionListener {

    public static boolean fichaSelecco = false;
    public static int tipoFicha;
    public static int posicionFila;
    public static int posicionColumna ;
    public static int posicionFilaInvocadorIzquierda ;
    public static int posicionColumnaInvocadorizquierda ;
    public static int posicionFilaInvocadorDerecha ;
    public static int posicionColumnaInvocadorDerecha ;

    @Override
    public void actionPerformed(ActionEvent e) {

        String texto = e.getActionCommand();

        if (texto.equals("Iniciar")) {
            Mensaje.mostrarMensajeInformation("Acaba de inicar el juego ", " Star");
            Tablero.agregarTipo1();
            Tablero.agregarTipo2();
            Tablero.aniadirAccion();
            

        } else {

            accionesBotones(e);

        }
    }

    public void accionesBotones(ActionEvent e) {
        if (fichaSelecco == false) {

            for (int fila = 0; fila < 8; fila++) {

                for (int columan = 0; columan < 8; columan++) {

                    if (e.getSource() == Tablero.casillas[fila][columan]) {
                        tipoFicha = Tablero.casillas[fila][columan].getTipoFicha();
                        posicionFila = Tablero.casillas[fila][columan].getFila();
                        posicionColumna = Tablero.casillas[fila][columan].getColuman();
                        Mensaje.mostrarMensajeInformation(" a seleccionado una ficha con las siguentes caracteristicas: " +" tipo: "+ tipoFicha +" Fila: "+ posicionFila+ " columna: "+ posicionColumna         , " info");
                        break;
                    }
                }
            }

            if (tipoFicha == 1) {
                Mensaje.mostrarMensajeInformation(" tipo ficha: blanca, posicion:"  + posicionFila +""+posicionColumna  ,  " posicion");
                moverFicha1(posicionFila, posicionColumna);
                fichaSelecco = true;
                
            } else if (tipoFicha == 2) {
                Mensaje.mostrarMensajeInformation(" tipo ficha: negra, poscion"   + posicionFila +""+posicionColumna , " posicion");
                moverFicha2(posicionFila, posicionColumna);
                fichaSelecco = true;
            }

        } else {

            Mensaje.mostarMensajeError("selecionu", "error");
        }
    }

    public void moverFicha2(int fila, int columna) {

    }

    public void moverFicha1(int fila, int columna) {

        Mensaje.mostrarMensajeInformation(" mover ficha"," info");
        if (fila < 7) {

            if (columna == 0) {

            } else {

                if (Tablero.casillas[fila + 1][columna - 1].isActivo() == true) {

                    Tablero.casillas[fila + 1][columna - 1].setBackground(Color.lightGray);
                    Tablero.activarFicha(fila+1, columna-1);
                    posicionColumnaInvocadorizquierda = columna - 1;
                    posicionFilaInvocadorIzquierda = fila + 1;
                    fichaSelecco = false;
                    Tablero.casillas[fila + 1][columna - 1].addActionListener(new MoverFicha());
                    
                } else if (columna > 1) {
                    
                    if (Tablero.casillas[fila + 1][columna - 1].getTipoFicha() == 2) {
                        
                        if (Tablero.casillas[fila + 2][columna - 2].isActivo() == true) {                            
                            Tablero.casillas[fila + 2][columna - 2].setBackground(Color.lightGray);
                            Tablero.activarFicha(fila+2, columna -2);
                            posicionFilaInvocadorIzquierda = fila + 2;
                            posicionColumnaInvocadorizquierda = columna - 2;
                            fichaSelecco = false;
                            Tablero.casillas[fila + 2][columna - 2].addActionListener(new MoverFicha());
                        }
                    } else {
                        Mensaje.mostarMensajeError("hay ficha blanca en le camino", " Error");
                        fichaSelecco = false;
                    }
                }
            }
            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            if (columna == 7) {
            } else {
                if (Tablero.casillas[fila + 1][columna + 1].isActivo() == true) {
                    
                    Tablero.casillas[fila + 1][columna + 1].setBackground(Color.lightGray);
                    Tablero.activarFicha(fila+1, columna+1);
                    posicionColumnaInvocadorDerecha = columna + 1;
                    posicionFilaInvocadorDerecha = fila + 1;
                    fichaSelecco = false;
                    Tablero.casillas[fila + 1][columna + 1].addActionListener(new MoverFicha());
                } else if (columna < 6 ) {
                    
                    if (Tablero.casillas[fila + 2][columna + 2].getTipoFicha() == 2) {
                        
                        if (Tablero.casillas[fila + 2][columna + 2].isActivo() == true) {
                            
                            Tablero.casillas[fila + 2][columna + 2].setBackground(Color.lightGray);
                            Tablero.activarFicha(fila+2, columna+2);
                            posicionColumnaInvocadorDerecha = columna + 2;
                            posicionFilaInvocadorDerecha = fila + 2;
                            fichaSelecco = false;
                            Tablero.casillas[fila + 2][columna + 2].addActionListener(new MoverFicha());
                        }
                    } else {
                        fichaSelecco = false;
                        Mensaje.mostarMensajeError("hay ficha blanca en el camino", " Error");
                    }
                }
            }
        } else {
            Mensaje.mostarMensajeError(" fin de la tabla", "error");
        }
    }

    public static int posicionFila() {
        return posicionFila;
    }

    public static int posicionColumna() {
        return posicionColumna;
    }

    public static int posicionFilaInvocadorIzquierda() {
        return posicionFilaInvocadorIzquierda;
    }

    public static int posicionColumnaInvocadorizquierda() {
        return posicionColumnaInvocadorizquierda;
    }

    public static int posicionFilaInvocadorDerecha() {
        return posicionFilaInvocadorDerecha;
    }

    public static int posicionColumnaInvocadorDerecha() {
        return posicionColumnaInvocadorDerecha;
    }
    
    public static void libre(boolean limpiar)
    {    
        fichaSelecco = limpiar;
    }

    public static void setLimpiarPosiciones(int nuevoValor)
    {
        posicionFila= nuevoValor;
        posicionColumna= nuevoValor;;
        posicionFilaInvocadorIzquierda= nuevoValor;;
        posicionColumnaInvocadorizquierda= nuevoValor;;
        posicionFilaInvocadorDerecha= nuevoValor;;
        posicionColumnaInvocadorDerecha= nuevoValor;;

    }


}
