package co.julian.domain;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaquinaDispensadora {
	private String nombre;
	private ArrayList<Producto> productos;
	private int cantidadDeProductos = 10;

	//constructor maquina
	public MaquinaDispensadora(String nombre){
		this.nombre = nombre;
		
	}
	
	//retirar por nombre o codigo
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
	//retirar por nombre
//	public void retirarProductoPorNombre(String nombreProducto) {
//			ArrayList<Producto> listaNombres = getProducto();
//			for (int i = 0; i <  listaNombres.size(); i++) {
//				String nombres = listaNombres.get(i).getNombre();
//				if (nombres == nombreProducto){
//					listaNombres.get(i).removerProducto();
//				}
//			}
//	}
	//retirar por codigo
//	public void retirarProductoPorCodigo(String codigoProducto) {
//		ArrayList<Producto> listaCodigos = getProducto();
//		for (int i = 0; i <  listaCodigos.size(); i++) {
//			String codigos = listaCodigos.get(i).getCodigo();
//			if (codigos == codigoProducto ){
//				listaCodigos.get(i).removerProducto();
//			}
//		}
//	}
	
	//consultar nombres de los productos agotados
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
	
	public int consultarTotalUnidadesDeProducto(Producto producto) {
		return producto.getUnidadesProducto();
	}
	
	public int consultarTotalUnidadesTodosProductos() {
		ArrayList<Producto> productos = getProductos();
		int sumatoria = 0;
		for (int i = 0; i < productos.size(); i++) {
			int unidadesPorProducto = productos.get(i).getUnidadesProducto();
			sumatoria = sumatoria + unidadesPorProducto;
		}
		return sumatoria; 
	}
	
	public void aumentarCantidadUnidadesProducto(Producto producto, int cantidadAumentar) {
		producto.aumentarProducto(cantidadAumentar);
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
