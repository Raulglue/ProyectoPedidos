package Control;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Test;


import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Utiles.Tipo;

public class AltasTest {
Alta alta;
	@Test
	public void testAltaCliente() {
		alta.altaCliente("1", "Juan", "Almendralejo", Tipo.cliente);
		//TODO assertrue buscar el cliente en el archivo
	}

	@Test
	public void testAltaPedido() {
		Date fecha= new Date(13/05/2017);
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Peine para calvos");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Agua");
		linea.add(new LineaPedido(1, articulo, 3));
		linea.add(new LineaPedido(2, segundo, 5));
		alta.altaPedido(fecha, cliente, linea, Tipo.pedido);
		// TODO asserttrue buscar el pedido en el archivo
	}

	@Test
	public void testAltaArticulo() {
		alta.altaArticulo("3", "Television de tubo", 500f, "Television vintage", Tipo.articulo);
		//TODO asserttrue buscar el articulo en el archivo
	}

}
