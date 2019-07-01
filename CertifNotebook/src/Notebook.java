
public class Notebook {
	private String marca;
	private String modelo;
	private String procesador;
	private float tamanoDisco;

	public Notebook(String marca, String modelo, String procesador, float tamanoDisco){
	this.marca=marca;
	this.modelo=modelo;
	this.procesador=procesador;
	this.tamanoDisco=tamanoDisco;
	}

	public String getMarca(){
	return this.marca;

	}

	public String getModelo(){
	return this.modelo;
	}

	public String getProcesador(){
	return this.procesador;
	}

	public float getTamanoDisco(){
	return this.tamanoDisco;
	}

	}

