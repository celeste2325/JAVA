
public abstract class Mascota{
	  private String nombre;
	    private int edad;
	    private double peso;
	    private String tipo_mascota;
	    
	    public Mascota(String nombre, int edad, double peso, String tipo_mascota) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.peso = peso;
	        this.tipo_mascota=tipo_mascota;
	    }
	    
	    //metodo abstracto para ser implementado en las clases hijas
	    public abstract String expresarse();
	       
	    
	    public String toString(){
	        
	        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Peso: "+peso+"\n"+expresarse();
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public String getTipo_mascota() {
	        return tipo_mascota;
	    }

	    public void setTipo_mascota(String tipo_mascota) {
	        this.tipo_mascota = tipo_mascota;
	    }
	    
	    
	    
	    
	}

