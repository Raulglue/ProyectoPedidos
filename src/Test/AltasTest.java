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

public class AltasTest {
Alta alta = new Alta();


	@Test
	public void testAltaCliente() {
		GestorUnificado gestor= new GestorUnificado(Tipo.clienteTest);
	
		Cliente clienteDos = new Cliente("2", "Pedro", "Merida");
		Cliente cliente = new Cliente("1", "Juan", "Almendralejo");
		gestor.borraArchivo();
		assertTrue(alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDireccion(), Tipo.clienteTest));
		assertTrue(alta.altaCliente(clienteDos.getDni(), clienteDos.getNombre(), clienteDos.getDireccion(), Tipo.clienteTest));
		ArrayList listaCliente = (ArrayList) gestor.obtener();
		assertTrue(listaCliente.contains(cliente));
		assertTrue(listaCliente.contains(clienteDos));
	}
	
	@Test
	public void testAltaArticulo() { 
		GestorUnificado gestor= new GestorUnificado(Tipo.articuloTest);
		Articulo articulo = new Articulo("3", "Television de tubo", 500f,"Television vintage");
		Articulo articuloDos = new Articulo("888", "xxxxxxxxx", 500f,"yyyyyyyy");
		gestor.borraArchivo();
		assertTrue(alta.altaArticulo(articulo.getId(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articuloTest));
		assertTrue(alta.altaArticulo(articuloDos.getId(), articuloDos.getNombre(), articuloDos.getPrecio(), articuloDos.getDescripcion(), Tipo.articuloTest));
		ArrayList listaArticulo = (ArrayList) gestor.obtener();
		assertTrue(listaArticulo.contains(articulo));
		assertTrue(listaArticulo.contains(articuloDos));
		
	}

	@Test
	public void testAltaPedido() {
		GestorUnificado gestor = new GestorUnificado(Tipo.pedidoTest);
		String fecha= "1";
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Primeras calidades");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Zero sabor");
		linea.add(new LineaPedido(1, articulo,2 ));
		linea.add(new LineaPedido(2, segundo, 1));
		Pedido pedido = new Pedido(fecha, cliente, linea);
		gestor.borraArchivo();
		assertTrue(alta.altaPedido(pedido.getId(), pedido.getCliente(), pedido.getLineaPedido(), Tipo.pedidoTest));
		Pedido pedidoP =(Pedido) gestor.obtener();
		assertTrue(pedido.equals(pedidoP));
		
	}

	

}
