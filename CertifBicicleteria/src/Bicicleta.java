
public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int year;
    private float precio;

    public Bicicleta(String nroDeSerie, String modelo, int year) {
	this.nroDeSerie = nroDeSerie;
	this.modelo = modelo;
	this.year = year;
    }

    public String getNroDeSerie() {
	return nroDeSerie;
    }

    public float getPrecio() {
	return precio;
    }

    public void setPrecio(float precio) {
	this.precio = precio;
    }

    // revisar
    @Override
    public String toString() {
	return "Modelo = " + modelo + ", year = " + year;
    }

}
