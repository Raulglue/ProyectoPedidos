package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Control.Alta;
import Control.Bajas;
import Control.Consulta;
import Control.adaptador.GestorUnificado;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;
import Utiles.Tipo;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class BajasTest {
	Alta alta = new Alta();
	Consulta consulta = new Consulta();
	Bajas baja = new Bajas();
	@Test
	public void testBajaCliente() {
		GestorUnificado gestor= new GestorUnificado(Tipo.clienteTest);
		
		Cliente clienteDos = new Cliente("2", "Pedro", "Merida");
		Cliente cliente = new Cliente("1", "Juan", "Almendralejo");
		gestor.borraArchivo();
		alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDireccion(), Tipo.clienteTest);
		alta.altaCliente(clienteDos.getDni(), clienteDos.getNombre(), clienteDos.getDireccion(), Tipo.clienteTest);
		assertTrue(baja.bajaCliente(cliente.getDni(), Tipo.clienteTest));
		assertTrue(baja.bajaCliente(clienteDos.getDni(), Tipo.clienteTest));
		ArrayList listaCliente = (ArrayList) gestor.obtener();
		assertFalse(listaCliente.contains(cliente));
		assertFalse(listaCliente.contains(clienteDos));	}

	@Ignore
	public void testBajaPedido() {
		GestorUnificado gestor = new GestorUnificado(Tipo.pedidoTest);
		String fecha= "1";
		String fechaDos= "1";
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Primeras calidades");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Zero sabor");
		linea.add(new LineaPedido(1, articulo,2 ));
		linea.add(new LineaPedido(2, segundo, 1));
		Pedido pedido = new Pedido(fecha, cliente, linea);
		Pedido pedidoDos = new Pedido(fechaDos, cliente, linea);
		gestor.borraArchivo();
		alta.altaPedido(pedido.getId(), pedido.getCliente(), pedido.getLineaPedido(), Tipo.pedidoTest);
		alta.altaPedido(pedidoDos.getId(), pedidoDos.getCliente(), pedidoDos.getLineaPedido(), Tipo.pedidoTest);
		assertTrue(baja.bajaPedido(pedido.getId(), Tipo.pedidoTest));
		assertTrue(baja.bajaPedido(pedidoDos.getId(), Tipo.pedidoTest));
		Pedido pedidoP =consulta.consultaPedido(pedido.getId(), Tipo.pedidoTest);
		Pedido pedidoDosP =consulta.consultaPedido(pedido.getId(), Tipo.pedidoTest);
		String nulo = "null";
		assertTrue(pedidoP.getId().equals(nulo));
		assertTrue(pedidoDosP.getId().equals(nulo));
	}

	@Test
	public void testBajaArticulo() {
		GestorUnificado gestor= new GestorUnificado(Tipo.articuloTest);
		Articulo articulo = new Articulo("3", "Television de tubo", 500f,"Television vintage");
		Articulo articuloDos = new Articulo("888", "xxxxxxxxx", 500f,"yyyyyyyy");
		gestor.borraArchivo();
		alta.altaArticulo(articulo.getId(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articuloTest);
		alta.altaArticulo(articuloDos.getId(), articuloDos.getNombre(), articuloDos.getPrecio(), articuloDos.getDescripcion(), Tipo.articuloTest);
		assertTrue(baja.bajaArticulo(articulo.getId(), Tipo.articuloTest));
		assertTrue(baja.bajaArticulo(articuloDos.getId(), Tipo.articuloTest));
		ArrayList listaArticulo = (ArrayList) gestor.obtener();
		assertFalse(listaArticulo.contains(articulo));
		assertFalse(listaArticulo.contains(articuloDos));
	}

}
