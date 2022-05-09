package practica2.intento.juegos.damas;

import javax.swing.JFrame;

import practica2.intento.juegos.damas.disenio.Tablero;
import practica2.intento.juegos.damas.eventos.AccionDama;
import practica2.intento.juegos.utilidades.Bontones;



public class Damas01 extends JFrame {

    private Tablero tablero;
    private Bontones iniciar;
    
    public Damas01()
    {

        super("Damas :)");

        this.setSize(500,593);
        this.setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocation(300,300);
        tablero = new Tablero();
        iniciar = new Bontones();
        iniciar.setText("Iniciar");
        iniciar.setBounds(20,20,75,30);
        iniciar.addActionListener(new AccionDama());

        add(tablero);
        add(iniciar);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
}
