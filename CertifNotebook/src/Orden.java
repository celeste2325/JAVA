import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
	this.id = id;
	this.creacion = creacion;
	items = new ArrayList<>();
    }

    public void agregarItems(DetalleOrden detalle) {
	items.add(detalle);
    }

    public int getNroItems() {
	return items.size();
    }

    public void setEnvio(Date envio) {

	this.envio = envio;

    }

    // devuelve el total de la orden
    public float getTotalOrden() {
	float suma = 0F;
	float total = 0F;

	for (DetalleOrden detalleOrden : items) {

	    total = detalleOrden.getCantidad() * detalleOrden.getPrecioUnitario();
	    suma = suma + total;

	}
	return suma;

    }
}
