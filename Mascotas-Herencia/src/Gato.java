
public class Gato extends Mascota{
	 private String color;
	   
	    public Gato(String nombre, int edad, double peso,String color) {
	        super(nombre, edad, peso, "Clase Gato");
	        this.color= color;
	        
	    }
	   // metodo maullar
	    
	    @Override
	    public String expresarse(){
	        return "El gato esta maullando";
	    }
	    
	   
	    public String toString(){
	        return super.toString()+"\n"+"Color: "+color;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

}
