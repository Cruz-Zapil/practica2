package practica2.intento.datos;


import practica2.intento.util.Mensaje;

/**
 *
 * @author Bohem
 */
public class Consultor {

    public static Object almacenaje[][] = new Object[15][6];
    private static DatosUsuario almacenamieto[] = new DatosUsuario[15];
    public static DatosUsuario datoElegido;

    public static void mostrarDatos() {

    }

    public static void almacenarDatos() {

        DatosUsuario a = new DatosUsuario();
        a.setNombre("victor");
        a.setPassword("ab");
        a.setTotalPartidasGanas(1);
        a.setTotalPartidasPerdidas(0);
        a.setTotalPartudasJugadas(20);
        a.setTotalDeMovimiento(15);

        almacenamieto[0] = a;

    }

    public static void almacerParaMostrar( DatosUsuario datoEnvio ) {

        int contador = 0;
        for (int i = 0; i < almacenamieto.length; i++) {
            if (almacenamieto[i] != null) {
                contador++;
            }
        }
        for (int fila = 0; fila < contador; fila++) {

            String[] dividido = datoEnvio.toString().split(" ");


            for (int columna = 0; columna < 6; columna++) {

                almacenaje[fila][columna] = dividido[columna];
            }
        }
    }

    /// almacenamito de datos
    public static void alamacenrNewData(String nombreNew, String password) {
        boolean tmp = analizarNombresGuardados(nombreNew);
        if (tmp == false) {
            for (int i = 0; i < almacenamieto.length; i++) {
                if (almacenamieto[i] == null) {
                    DatosUsuario nuevo = new DatosUsuario();
                    nuevo.setNombre(nombreNew);
                    nuevo.setPassword(password);
                    almacenamieto[i] = nuevo;
                    Mensaje.mostrarMensajeInformation(" registro completado", " bueno");
                   // almacerParaMostrar();
                    break;
                }
            }
        } else {
            Mensaje.mostarMensajeError("Nombre ya registrado, vulva a intentarlo", "Error de registro");
        }
    }

    //// inicion de seseion
    public static void inicioDeSeseion(String nombreBuscar, String password) {
        boolean tmp = analizarNombresGuardados(nombreBuscar);
        if (tmp == true) {
            for (int i = 0; i < almacenaje.length; i++) {
                if (almacenamieto[i] != null) {
                    if (almacenamieto[i].getNombre().equals(nombreBuscar)) {

                        if (almacenamieto[i].getPassword().equals(password)) {
                            Mensaje.mostrarMensajeInformation(nombreBuscar, "Bienvenido");
                            datoElegido = almacenamieto[i];
                        } else {
                            Mensaje.mostarMensajeError("verifice los datos", " Error");
                        }
                    }
                }
            }
        } else {
            Mensaje.mostarMensajeError("Usuario no registaso", " Error");
        }
    }

    /// analiza los datos almacenados si hay alguno que se coincide

    public static boolean analizarNombresGuardados(String nombreBusar) {

        for (int i = 0; i < almacenamieto.length; i++) {

            if (almacenamieto[i] != null) {

                if (almacenamieto[i].getNombre().equals(nombreBusar)) {

                    return true;
                }
            } else {
                break;
            }
        }
        return false;
    }

    public static DatosUsuario getAlmacenamieto() {
        return almacenamieto[0];
    }

    public static void setAlmacenamieto(DatosUsuario[] almacenamieto) {
        Consultor.almacenamieto = almacenamieto;
    }



}
