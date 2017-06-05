package Test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Test;

import Control.Alta;
import Control.Consulta;
import Control.adaptador.GestorUnificado;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;
import Utiles.Tipo;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class ConsultaTest {
	Alta alta = new Alta();
	Consulta consulta = new Consulta();

	@Test
	public void testConsultaCliente() {
		GestorUnificado gestor = new GestorUnificado(Tipo.clienteTest);
		Cliente cliente = new Cliente("1", "Juan", "Almendralejo");
		gestor.borraArchivo();
		assertTrue(alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDireccion(), Tipo.clienteTest));
		Cliente buscado = consulta.consultaCliente(cliente.getDni(), Tipo.clienteTest);
		assertTrue(buscado.equals(cliente));

	}

	@Test
	public void testConsultaPedido() {
		GestorUnificado gestor = new GestorUnificado(Tipo.pedidoTest);
		String fecha = "1";
		Cliente cliente = new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Primeras calidades");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Zero sabor");
		Pedido buscarP = new Pedido(fecha, cliente, linea);
		linea.add(new LineaPedido(1, articulo, 2));
		linea.add(new LineaPedido(2, segundo, 1));
		gestor.borraArchivo();
		assertTrue(alta.altaPedido(buscarP.getId(), buscarP.getCliente(), buscarP.getLineaPedido(), Tipo.pedidoTest));
		Pedido pedidoDos = consulta.consultaPedido(fecha, Tipo.pedidoTest);
		assertTrue(buscarP.equals(pedidoDos));
	}

	@Test
	public void testConsultaArticulo() {
		GestorUnificado gestor = new GestorUnificado(Tipo.articuloTest);
		Articulo articulo = new Articulo("3", "Television de tubo", 500f, "Television vintage");
		gestor.borraArchivo();
		assertTrue(alta.altaArticulo(articulo.getId(), articulo.getNombre(), articulo.getPrecio(),
				articulo.getDescripcion(), Tipo.articuloTest));
		Articulo articuloDos = consulta.consultaArticulo(articulo.getId(), Tipo.articuloTest);
		assertTrue(articuloDos.equals(articulo));

	}

}
