package practica2.intento.juegos.damas.eventos;

import java.awt.event.*;


import practica2.intento.juegos.damas.disenio.PintarCasilla;
import practica2.intento.juegos.damas.disenio.Tablero;

public class MoverFicha implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Tablero.casillas[AccionDama.posicionFilaInvocadorIzquierda][AccionDama.posicionColumnaInvocadorizquierda]) {

            PintarCasilla.pintarFichaBlanca(AccionDama.posicionFilaInvocadorIzquierda,AccionDama.posicionColumnaInvocadorizquierda);
                    Tablero.cambiarTipoFicha(AccionDama.posicionFilaInvocadorIzquierda, AccionDama.posicionColumnaInvocadorizquierda,1);
                    Tablero.desactivarCasilla(AccionDama.posicionFilaInvocadorDerecha,AccionDama.posicionColumnaInvocadorDerecha);
                    PintarCasilla.pintarBlanca(AccionDama.posicionFilaInvocadorDerecha,AccionDama.posicionColumnaInvocadorDerecha);
            limpiar();

        } else if (e
                .getSource() == Tablero.casillas[AccionDama.posicionFilaInvocadorDerecha][AccionDama.posicionColumnaInvocadorDerecha]) {

            PintarCasilla.pintarFichaBlanca(AccionDama.posicionFilaInvocadorDerecha(),AccionDama.posicionColumnaInvocadorDerecha);
                    Tablero.cambiarTipoFicha(AccionDama.posicionFilaInvocadorDerecha, AccionDama.posicionColumnaInvocadorDerecha,1);
                    Tablero.desactivarCasilla(AccionDama.posicionFilaInvocadorIzquierda,AccionDama.posicionColumnaInvocadorizquierda);
                    PintarCasilla.pintarBlanca(AccionDama.posicionFilaInvocadorIzquierda,AccionDama.posicionColumnaInvocadorizquierda);

                    limpiar();
        }

    }

    public void limpiar() {
        PintarCasilla.pintarBlanca(AccionDama.posicionFila, AccionDama.posicionColumna);
        Tablero.cambiarTipoFicha(AccionDama.posicionFila, AccionDama.posicionColumna, 0);
        AccionDama.libre(false);
        Tablero.desactivarCasilla(AccionDama.posicionFila,AccionDama.posicionColumna );

    }

}
