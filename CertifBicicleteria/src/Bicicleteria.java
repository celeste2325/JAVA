
import java.util.ArrayList;
import java.util.List;
public class Bicicleteria {
	private List<Bicicleta>bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
        this.bicicletas= new ArrayList<Bicicleta>();
        this.ganancias=0;
        this.cantidadDeVentas=0;
    }
    
    public void addBicicleta(Bicicleta nvaBici){
        this.bicicletas.add(nvaBici);
      
    }
    
   
    public void venderBicicleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        this.cantidadDeVentas++;
        this.ganancias=this.ganancias+bicicleta.getPrecio();
    
    
    }
  
    public Bicicleta buscarBicicleta(String nroDeSerie){
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getNroDeSerie().equals(nroDeSerie)) {
                System.out.println(""+bicicleta);
                
            }
  
        }
    
        return null;

    }
    
    
    
}


