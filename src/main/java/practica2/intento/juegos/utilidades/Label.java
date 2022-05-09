package practica2.intento.juegos.utilidades;

import javax.swing.JLabel;

public class Label extends JLabel {

    private  int x ,y ,sX ,sY;
    private boolean ad;
    public Label( int x ,int y,int sx, boolean ad )
    {
        this.x=x;
        this.y= y;
        this.sX= sx;
        this.ad= ad;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getsX() {
        return sX;
    }
    public void setsX(int sX) {
        this.sX = sX;
    }
    public int getsY() {
        return sY;
    }
    public void setsY(int sY) {
        this.sY = sY;
    }
    public boolean isAd() {
        return ad;
    }
    public void setAd(boolean ad) {
        this.ad = ad;
    }

    
}
