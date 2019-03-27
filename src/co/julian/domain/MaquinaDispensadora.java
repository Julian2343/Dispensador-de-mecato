package co.julian.domain;


import java.util.ArrayList;

public class MaquinaDispensadora {
	private String nombre;
	private ArrayList<Producto> productos;
	private int cantidadDeProductos = 10;

	//constructor maquina
	public MaquinaDispensadora(String nombre){
		this.nombre = nombre;
		
	}
	

	//metodo para retirar producto por nombre o codigo
	public void retirarProducto(String nombreOCodigoProducto) {
		ArrayList<Producto> listaProductos = getProductos();
		for (int i = 0; i <  listaProductos.size(); i++) {
			String nombres = listaProductos.get(i).getNombre();
			String codigos = listaProductos.get(i).getCodigo();
			if (nombres == nombreOCodigoProducto || codigos == nombreOCodigoProducto ){
				listaProductos.get(i).removerProducto();
			}
		}
}
	
	//metodo para consultar nombres de los productos agotados
	public ArrayList<String> consultarProductosAgotados() {
		ArrayList<String> nombresProductosAgotados = new ArrayList<String>();
		ArrayList<Producto> productos = getProductos();
		for (int i = 0; i < productos.size(); i++) {
			int unidadesPorProducto = productos.get(i).getUnidadesProducto();
			if (unidadesPorProducto <= 0 ) {
				String nombresProductos = productos.get(i).getNombre();
				nombresProductosAgotados.add(nombresProductos);
			}
		}
		return nombresProductosAgotados;
	}
	
	//metodo para consultar el total de unidades de un producto en especifico
	public int consultarTotalUnidadesDeProducto(Producto producto) {
		return producto.getUnidadesProducto();
	}
	
	//metodo para consultar el total de unidades de todos los productos
	public int consultarTotalUnidadesTodosProductos() {
		ArrayList<Producto> productos = getProductos();
		int sumatoria = 0;
		for (int i = 0; i < productos.size(); i++) {
			int unidadesPorProducto = productos.get(i).getUnidadesProducto();
			sumatoria = sumatoria + unidadesPorProducto;
		}
		return sumatoria; 
	}
	
	//metodo para aumentar la cantidad de un producto
	public void aumentarCantidadUnidadesProducto(Producto producto, int cantidadAumentar) {
		producto.aumentarUnidadesProducto(cantidadAumentar);
	}
	
	//getters y setters
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
	
	
	//getters y setters
	
}
