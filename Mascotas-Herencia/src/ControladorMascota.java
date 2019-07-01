
public class ControladorMascota {

	public static void main(String[] args) {
		
		// 2 objetos de tipo gato
		  Gato betoben= new Gato("Betoben",4,10.2,"Amarillo");
	      Gato mia=new Gato("Mia",2,10.3,"gris");
	      
	   // 2 objetos de tipo perro
	      Perro princesa= new Perro("Princesa",2,6.3);
	      Perro blacky= new Perro("Poodle","Blacky",3,5.2);
	      
	   // 2 objetos de tipo loro
	      Loro lorito= new Loro ("Lorito",5,2.1,"bajo");
	      Loro du= new Loro("Du",3,1.2,"alto");
	      
	      Imprimir imprimir=new Imprimir();// objeto de la clase Imprimir
	      
	//Agregando objetos de tipo Mascota a la lista
	      
	      imprimir.paraImpimir(betoben);
	      imprimir.paraImpimir(mia);
	      imprimir.paraImpimir(princesa);
	      imprimir.paraImpimir(blacky);
	      imprimir.paraImpimir(lorito);
	      imprimir.paraImpimir(du);
	    
	    //Muestra los objetos
	    
	      imprimir.mostrar();
	    
	    }
	    
	}

