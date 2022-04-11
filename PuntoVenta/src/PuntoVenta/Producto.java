package PuntoVenta;

public class Producto {
	
	//ATRIBUTOS
	private String nombre;
	private String codigo;
	private int precio;
	
	//CONSTRUCTORES
	public Producto() {
		
	}
	
	public Producto(String codigo, String nombre, int precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
