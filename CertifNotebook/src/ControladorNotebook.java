import java.util.Date;

public class ControladorNotebook {
    public static void main(String[] args) {
   	 
       //objetos de tipo Notebook.
       Notebook modelo1= new Notebook("hp","1","duo",24F);
       Notebook modelo2= new Notebook("vit","2","dine",23F);
       Notebook modelo3= new Notebook("lenovo","3","dol",22F);
       Notebook modelo4= new Notebook("dual","4","dem",21F);
       
       //objetos de tipo DetalleOrden.
       
       DetalleOrden detalleOrden1= new DetalleOrden(modelo1,3000F,1);
       DetalleOrden detalleOrden2= new DetalleOrden(modelo2,4000F,2);
       DetalleOrden detalleOrden3= new DetalleOrden(modelo3,5000F,3);
       DetalleOrden detalleOrden4= new DetalleOrden(modelo4,6000F,4);
       
       
       //objetos de tipo Orden.
       Orden orden1= new Orden(1,new Date(03-02-1993));
       Orden orden2= new Orden(2,new Date(03-02-1993));
       
       //invocando el metodo agregarItems(agrega 4 DetalleOrden a la lista items de la orden #01) de la clase Orden.
       
       orden1.agregarItems(detalleOrden1);
       orden1.agregarItems(detalleOrden2);
       orden1.agregarItems(detalleOrden3);
       orden1.agregarItems(detalleOrden4);
       
     //invocando el metodo agregarItems(agrega 2 DetalleOrden a la lista items de la orden #02) de la clase Orden.
       
       orden2.agregarItems(detalleOrden4);
       orden2.agregarItems(detalleOrden2);
       
       // imprime cuantos item`s tiene la orden #01
       
       System.out.println(orden1.getNroItems());
       
       // imprime cuantos es el total de la orden #01
       
       System.out.println(orden1.getTotalOrden());
       
    // imprime cuantos es el total de la orden #02
       
       System.out.println(orden2.getTotalOrden());
      
       
   }
}
   
