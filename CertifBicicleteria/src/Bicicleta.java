
public class Bicicleta {
	 private String nroDeSerie;
	    private String modelo;
	    private int a�o;
	    private float precio;

	    public Bicicleta(String nroDeSerie, String modelo, int a�o) {
	        this.nroDeSerie = nroDeSerie;
	        this.modelo = modelo;
	        this.a�o = a�o;
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

	    //revisar
	    @Override
	    public String toString() {
	        return "Modelo = " + modelo + ", a�o = " + a�o ;
	    }
	    
	    
	}


