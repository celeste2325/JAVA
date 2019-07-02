
public class Perro extends Mascota {
    private String raza;
    // private boolean ladrar;

    // constructor con todos los atributos, excepto el atributo raza

    public Perro(String nombre, int edad, double peso) {
	super(nombre, edad, peso, "Clase PERRO");
	// ladrar= false;
    }
    // segundo constructor con todos los atributos

    public Perro(String raza, String nombre, int edad, double peso) {
	super(nombre, edad, peso, "Clase PERRO");
	this.raza = raza;
	// ladrar= false;
    }

    // metodo ladrar
    @Override
    public String expresarse() {

	return "El perro esta ladrando";
    }

    public String getRaza() {
	return raza;
    }

    public void setRaza(String raza) {
	this.raza = raza;
    }

    // devuelve toString del padre + atributo raza. Operador ternario: devuelve raza
    // callejero, si this.raza==null, si no devuelve el valor del this.raza
    public String toString() {
	return super.toString() + "\n" + "Raza: " + (this.raza == null ? "Callejero" : raza);
    }

}
