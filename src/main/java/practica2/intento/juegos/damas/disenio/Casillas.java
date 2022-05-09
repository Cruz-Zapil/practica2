package practica2.intento.juegos.damas.disenio;

import javax.swing.JButton;

public class Casillas extends JButton {

    private boolean activo;
    private int tipoFicha;
    private boolean desactivado;
    private int fila, columan;

    public Casillas (boolean activa , int tipoFicha  , boolean desactivado , int fila , int columan )
    {
        this.activo = activa;
        this.tipoFicha = tipoFicha;
        this.desactivado = desactivado;
        this.fila= fila;
        this.columan =columan;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public boolean isDesactivado() {
        return desactivado;
    }

    public void setDesactivado(boolean desactivado) {
        this.desactivado = desactivado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColuman() {
        return columan;
    }

    public void setColuman(int columan) {
        this.columan = columan;
    }
    
    
}
