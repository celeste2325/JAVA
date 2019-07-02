
public class ControladorBicicleteria {
	  public static void main(String[] args) {
		  
		  //3 objetos de tipo Bicicleta
	       Bicicleta biciOrbeaAvant= new Bicicleta("H30","Orbea Avant",2018);
	       Bicicleta biciOrbeaAqua= new Bicicleta("H31","Orbea Aqua",2019);
	       Bicicleta biciMtbOlmo= new Bicicleta("R26","MTB Olmo",2017);
	       
	      // objeto de tipo Bicicleteria
	       Bicicleteria bicicleteria= new Bicicleteria();
	       
	      // Agregando 3 bicicletas a la lista bicicletas
	       bicicleteria.addBicicleta(biciMtbOlmo);
	       bicicleteria.addBicicleta(biciOrbeaAqua);
	       bicicleteria.addBicicleta(biciOrbeaAvant);
	       
	       //devuelve modelo, year de, bicicleta con el numero de serie H30
	       bicicleteria.buscarBicicleta("H30");
	       
	    }
	    
	}


