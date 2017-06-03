package Test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Test;

import Control.Alta;
import Control.Consulta;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;
import Utiles.Tipo;

public class ConsultaTest {
	Alta alta;
	Consulta consulta;
	@Test
	public void testConsultaCliente() {
		Cliente buscarC = new Cliente("1", "Juan", "Almendralejo");
		assertTrue(alta.altaCliente(buscarC.getDni(), buscarC.getNombre(), buscarC.getDireccion(), Tipo.cliente));
		Cliente buscado= consulta.consultaCliente(buscarC.getDni(), Tipo.cliente);
		buscado.equals(buscarC);
		
	}



	
	
	
	@Test
	public void testConsultaPedido() {
		Date fecha= new Date(13/05/2017);
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Primeras calidades");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Zero sabor");
		Pedido buscarP = new Pedido(fecha, cliente, linea);
		linea.add(new LineaPedido(1, articulo,2 ));
		linea.add(new LineaPedido(2, segundo, 1));
		assertTrue(alta.altaPedido(buscarP.getId(), buscarP.getCliente(), buscarP.getLineaPedido(), Tipo.pedido));
		Pedido pedidoDos = consulta.consultaPedido(fecha, Tipo.pedido);
		assertTrue(buscarP.equals(pedidoDos));
	}

	@Test
	public void testConsultaArticulo() {
		Articulo articulo = new Articulo("3", "Television de tubo", 500f,"Television vintage");
		assertTrue(alta.altaArticulo(articulo.getId(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articulo));
		Articulo articuloDos = consulta.consultaArticulo(articulo.getId(), Tipo.articulo);
		assertTrue(articuloDos.equals(articulo));
	}

}
