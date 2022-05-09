
package practica2.intento.datos;

import java.io.Serializable;

/**
 *
 * @author Bohem
 */
public class DatosUsuario implements Serializable {

    private String nombre;
    private String password;

    ///// estadistica
    private int totalPartidasGanas = 0;
    private int totalPartidasPerdidas = 0;
    private int totalPartudasJugadas = 0;
    private int totalDeMovimiento = 0;
    public int length;

    public DatosUsuario() {

    }

    @Override
    public String toString() {
        return nombre + " " + password + " " + totalDeMovimiento + " " + totalPartidasGanas + " "
                + totalPartidasPerdidas + " " + totalPartudasJugadas;
    }

    public static void mostar()
    {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalPartudasJugadas() {
        return totalPartudasJugadas;
    }

    public void setTotalPartudasJugadas(int totalPartudasJugadas) {
        this.totalPartudasJugadas = totalPartudasJugadas;
    }

    public int getTotalPartidasGanas() {
        return totalPartidasGanas;
    }

    public void setTotalPartidasGanas(int totalPartidasGanas) {
        this.totalPartidasGanas = totalPartidasGanas;
    }

    public int getTotalPartidasPerdidas() {
        return totalPartidasPerdidas;
    }

    public void setTotalPartidasPerdidas(int totalPartidasPerdidas) {
        this.totalPartidasPerdidas = totalPartidasPerdidas;
    }

    public int getTotalDeMovimiento() {
        return totalDeMovimiento;
    }

    public void setTotalDeMovimiento(int totalDeMovimiento) {
        this.totalDeMovimiento = totalDeMovimiento;
    }

}
