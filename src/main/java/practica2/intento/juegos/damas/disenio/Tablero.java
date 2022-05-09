package practica2.intento.juegos.damas.disenio;

import java.awt.Color;
import javax.swing.JPanel;

import practica2.intento.juegos.damas.eventos.AccionDama;

public class Tablero extends JPanel {
    public static Casillas casillas[][] = new Casillas[8][8];
    public static int x = -60, y = 0;

    public Tablero() {
        this.setBounds(0, 70, 480, 550);
        this.setLayout(null);
        setVisible(true);
        setOpaque(true);
        setBackground(Color.lightGray);
        agragarCasilla();

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                casillas[fila][columna].setBounds(x += 60, y, 60, 60);
                add(casillas[fila][columna]);
                if (columna == 7) {
                    y += 60;
                    x = -60;
                }
            }
        }
    }

    public void agragarCasilla() {

        for (int fila = 0; fila < 8; fila++) {

            for (int columna = 0; columna < 8; columna++) {

                if (fila % 2 == 0) {

                    System.out.println("fila par");

                    if (columna % 2 == 0) {
                        System.out.println("********columan par ");
                        casillas[fila][columna] = new Casillas(true, 0, false, fila, columna);
                        casillas[fila][columna].setBackground(Color.white);
                        
                    casillas[fila][columna].addActionListener(new AccionDama());
                    } else {
                        System.out.println("********columan impar ");
                        casillas[fila][columna] = new Casillas(false, 0, true, fila, columna);
                        casillas[fila][columna].setBackground(Color.black);
                    }
                } else {

                    System.out.println("fila impar ");
                    if (columna % 2 == 0) {
                        System.out.println("********columan par ");

                        casillas[fila][columna] = new Casillas(false, 0, true, fila, columna);
                        casillas[fila][columna].setBackground(Color.black);
                    } else {
                        System.out.println("********columan impar ");
                        casillas[fila][columna] = new Casillas(true, 0, false, fila, columna);
                        casillas[fila][columna].setBackground(Color.white);
                    }
                }
            }
        }
        
        desactivarBoton();
    }

    public  void desactivarBoton() {

        for (int fila = 0; fila < 8; fila++) {

            for (int columna = 0; columna < 8; columna++) {

                if (casillas[fila][columna].isDesactivado() == true   ) {
                    casillas[fila][columna].setEnabled(false);
                } else {
                    System.out
                            .print(casillas[fila][columna].getFila() + "" + casillas[fila][columna].getColuman() + " ");
                            
                }
            }
            System.out.println();
        }
    }

    public static void agregarTipo1() {

        for (int fila = 0; fila < 3; fila++) {

            for (int columan = 0; columan < 8; columan++) {

                if (casillas[fila][columan].isDesactivado() == false) {

                    casillas[fila][columan].setTipoFicha(1);
                    casillas[fila][columan].setActivo(false);
                    PintarCasilla.pintarFichaBlanca(fila, columan);
                }
            }
        }
    }

    public static void agregarTipo2() {

        for (int fila = 5; fila < 8; fila++) {
            for (int columan = 0; columan < 8; columan++) {

                if (casillas[fila][columan].isDesactivado() == false) {
                    casillas[fila][columan].setActivo(false);
                    casillas[fila][columan].setTipoFicha(2);
                    PintarCasilla.pintarFichaNegra(fila, columan);
                }
            }
        }
    }

    public static Casillas getCasillas(int filaFicha, int columanFicha) {
        return casillas[filaFicha][columanFicha];
    }

    public static void cambiarTipoFicha(int filaFicha, int columanFicha, int tipoFicha) {
        casillas[filaFicha][columanFicha].setTipoFicha(tipoFicha);
    }
    
    public static void activarFicha(int fila, int columna)
    {
        casillas[fila][columna].setEnabled(true);
    }

    public static void desactivarCasilla(int ficha, int columan)
    {
        casillas[ficha][columan].setEnabled(false);
    }

    public static void aniadirAccion()
    {
        for(int fila=0; fila<8; fila++)
        {
            for(int columna=0; columna <8; columna++ )
            {

                if(casillas[fila][columna].getTipoFicha()!=0)
                {
                    casillas[fila][columna].addActionListener(new AccionDama());
                }
            }
        }
    }
    


}
