import java.util.ArrayList;

public class Imprimir {

    // lista de tipo mascota
    // polimorfismo
    ArrayList<Mascota> paraImprimir = new ArrayList<Mascota>();

    public void paraImpimir(Mascota c) {
	paraImprimir.add(c);

    }

    public void mostrar() {
	for (Mascota mascotas : paraImprimir) {
	    // llama Gui.mostrarCartel porq es un metodo estatico
	    // devuelve c/u de las mascotas, el tipo de mascota que es
	    Gui.mostrarCartel(mascotas, mascotas.getTipo_mascota(), -1);
	}

    }
}
