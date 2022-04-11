package PuntoVenta;

public class LineaDetalle {
	
	//ATRIBUTOS
	private int cantidad;
	private Producto producto;
	
	//CONSTRUCTORES
	public LineaDetalle() {

	}

	public LineaDetalle(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}

	//GETTERS Y SETTERS
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//CALCULO SUB TOTAL
	public int calcularSubtotal() {
		return cantidad * producto.getPrecio();
	}
	
}