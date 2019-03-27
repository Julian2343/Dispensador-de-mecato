package co.julian.app;

import java.util.ArrayList;
import java.util.Arrays;

import co.julian.domain.MaquinaDispensadora;
import co.julian.domain.Producto;

public class Main {

	public static void main(String[] args) {
		//maquinas
		MaquinaDispensadora maquina1 = new MaquinaDispensadora("Maquina del sur");
		
		//productos
		Producto chocolatina = new Producto("Chocolatina jet", 200, "A1", 10);
		Producto galleta = new Producto("Galletas oreo", 600, "A2", 0);
		Producto papas = new Producto("De todito", 1800, "A3", 0);
		Producto mani = new Producto("Mani Moto", 1400, "A4", 8);
		
		//lista de productos
		ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(chocolatina, galleta, papas, mani));
		maquina1.setProductos(productos);
		
		maquina1.retirarProducto("Chocolatina jet");
		maquina1.aumentarCantidadUnidadesProducto(papas, 2);
		
		System.out.println(chocolatina.getUnidadesProducto());
		System.out.println(maquina1.consultarProductosAgotados());
		System.out.println(maquina1.consultarTotalUnidadesDeProducto(papas));
		System.out.println(maquina1.consultarTotalUnidadesTodosProductos());
	}

}
