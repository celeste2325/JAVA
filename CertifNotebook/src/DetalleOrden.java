
public class DetalleOrden {
    private Notebook item;
    private float precioUnitario;
    private int cantidad;

    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
	this.item = item;
	this.precioUnitario = precioUnitario;
	this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
	return this.precioUnitario;
    }

    public int getCantidad() {
	return this.cantidad;
    }

    public Notebook getItem() {
	return this.item;
    }

}
