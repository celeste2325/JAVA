import javax.swing.JOptionPane;

public class Gui {
    public static void mostrarCartel(Object mensaje) {
	JOptionPane.showMessageDialog(null, mensaje);
    }

    // 2do parametro: se muestra en el cuerpo de la ventana
    // 3er parametro: El mensaje que se mostrara en la barra de titulo.
    // 4to parametro: representa un icono en JOptionPane
    public static void mostrarCartel(Object mensaje, String titulo, int tipoDeMensaje) {
	JOptionPane.showMessageDialog(null, mensaje, titulo, tipoDeMensaje);
    }

    public static void mostrarCartel(String titulo) {
	JOptionPane.showMessageDialog(null, titulo);
    }

    public static int ingresaEntero(Object mensaje, String titulo, int tipoDeMensaje) {
	return Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, tipoDeMensaje));
    }
}
