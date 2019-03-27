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
		Producto gomitas = new Producto("Ositos gominola", 800, "A5", 3);
		Producto jugo = new Producto("Jugo Hit", 1500, "A6", 6);
		
		//lista de productos
		ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(chocolatina, galleta, papas, mani, gomitas, jugo));
		maquina1.setProductos(productos);
		
		//pruebas
		
		
		//conocer el nombre y precios de un producto
		System.out.println("El primero producto de mi maquina es la " + chocolatina.getNombre() + " y cuesta " + chocolatina.getPrecio() + " pesos" + "\n");
		
		//sacar una unidad de un producto de acuerdo a su nombre
		maquina1.retirarProducto("Chocolatina jet");
		System.out.println(chocolatina.getUnidadesProducto());
		//sacar una unidad de un producto de acuerdo a du codigo
		maquina1.retirarProducto("A4");
		System.out.println(mani.getUnidadesProducto() + "\n");
		
		//consultar el nombre de productos agotados
		System.out.println("Los productos agotados son: " + maquina1.consultarProductosAgotados() + "\n");
		
		//consultar el total de unidades de un producto determinado
		System.out.println("El total de unidades de " + jugo.getNombre() + " que hay son  " + maquina1.consultarTotalUnidadesDeProducto(jugo) + "\n");
		
		//consultar el total de unidades de todos los productos
		System.out.println("El total de unidades de todos los productos es " + maquina1.consultarTotalUnidadesTodosProductos() + "\n");

		//aumentar producto con la condicion de que solo se pueden almacenar 12 productos
		maquina1.aumentarCantidadUnidadesProducto(gomitas, 3);
		System.out.println(gomitas.getUnidadesProducto());
		maquina1.aumentarCantidadUnidadesProducto(chocolatina, 3);
		System.out.println(chocolatina.getUnidadesProducto() + "\n");
	}

}
