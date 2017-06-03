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

public class AltasTest {
Alta alta;
Consulta consulta;


	@Test
	public void testAltaCliente() {
		GestorUnificado gestor= new GestorUnificado(Tipo.cliente);
		Cliente cliente = new Cliente("1", "Juan", "Almendralejo");
		assertTrue(alta.altaCliente(cliente.getDni(), cliente.getNombre(), cliente.getDireccion(), Tipo.cliente));
		ArrayList listaCliente = (ArrayList) gestor.obtener();
		assertTrue(listaCliente.contains(cliente));
	}
	
	@Test
	public void testAltaArticulo() { 
		GestorUnificado gestor= new GestorUnificado(Tipo.articulo);
		Articulo articulo = new Articulo("3", "Television de tubo", 500f,"Television vintage");
		assertTrue(alta.altaArticulo(articulo.getId(), articulo.getNombre(), articulo.getPrecio(), articulo.getDescripcion(), Tipo.articulo));
		ArrayList listaArticulo = (ArrayList) gestor.obtener();
		assertTrue(listaArticulo.contains(articulo));
		
	}
	
	@Test
	public void testAltaPedido() {
		GestorUnificado gestor= new GestorUnificado(Tipo.articulo);
		String fecha= "1";
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		ArrayList linea = new ArrayList();
		Articulo articulo = new Articulo("1", "Peine", 20f, "Primeras calidades");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Zero sabor");
		linea.add(new LineaPedido(1, articulo,2 ));
		linea.add(new LineaPedido(2, segundo, 1));
		Pedido pedido = new Pedido(fecha, cliente, linea);		
		assertTrue(alta.altaPedido(pedido.getId(), pedido.getCliente(), pedido.getLineaPedido(), Tipo.pedido));
		Pedido pedidoP =(Pedido) gestor.obtener();
		assertTrue(pedido.equals(pedidoP));
		
	}

	

}
