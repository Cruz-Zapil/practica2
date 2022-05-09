
package practica2.intento;

import practica2.intento.datos.Consultor;
import practica2.intento.datos.GestorArchivo;
import practica2.intento.util.Util;

/**
 *
 * @author Bohem
 */


public class Main {

    public static void main(String[] args) {
        
        
        Consultor.almacerParaMostrar(GestorArchivo.leerArchivos());
        Util.abrirPanelPrincipal();
        Consultor.almacenarDatos();
        GestorArchivo.gestionarArchivos();

    }









}
