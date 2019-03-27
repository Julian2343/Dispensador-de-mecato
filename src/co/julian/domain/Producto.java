package co.julian.domain;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	private int unidadesProducto = 12;
	
	//constructor
	public Producto(String nombre, int precio, String codigo, int unidadesProducto) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.unidadesProducto = unidadesProducto;
	}
	
	//metodo remover producto
	public void removerProducto() {
		this.unidadesProducto = unidadesProducto -1;
	}
	
	//metodo aumentar producto
	public void aumentarProducto(int cantidadAAumentar) {
		this.unidadesProducto = unidadesProducto + cantidadAAumentar;
		
	}
	//getters y setters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidadesProducto() {
		return unidadesProducto;
	}

	public void setUnidadesProducto(int unidadesProducto) {
		this.unidadesProducto = unidadesProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	
}
