
public class Loro extends Mascota {
    private String volumen;
    private String parlotear;

    public Loro(String nombre, int edad, double peso, String volumen) {
	super(nombre, edad, peso, "Clase LORO");
	this.volumen = volumen;
    }

    // metodo parlotear

    @Override
    public String expresarse() {
	if (volumen.equalsIgnoreCase("bajo")) {
	    parlotear = "el loro esta parloteando a volumen: " + volumen + "\n" + "hola hola";

	}
	if (volumen.equalsIgnoreCase("alto")) {

	    parlotear = "el loro esta parloteando a volumen: " + volumen + "\n" + "HOOOLAAAAA HOLAAAAAAA";

	}

	return parlotear;
    }

    public String toString() {
	return super.toString();
    }

    public String isVolumen() {
	return volumen;
    }

    public void setVolumen(String volumen) {
	this.volumen = volumen;
    }

}
