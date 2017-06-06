package Control;

import Control.adaptador.GestorUnificado;
import Modelo.Cliente;
import Utiles.Tipo;
import Utiles.Varios;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;

import Control.interfaz.IConsultas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;

public class Consulta implements IConsultas {

	@Override
	public Cliente consultaCliente(String dni, Tipo tipo) {
		gestor guardar = new gestor(tipo);
		GestorUnificado unif = new GestorUnificado(tipo);
		Cliente cliente = new Cliente(dni, "JUAN", "MERIDA");
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			ArrayList listaCliente = (ArrayList) unif.obtener();
			if (listaCliente.contains(cliente)) {
				int posicion = listaCliente.indexOf(cliente);
				return (Cliente) listaCliente.get(posicion);
			}

		}
		return null;
	}

	@Override
	public Pedido consultaPedido(String fecha, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Pedido pedido = new Pedido("null", new Cliente("null", "null", "null"), new ArrayList<>());;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			pedido = (Pedido) new Varios().leerPedido(tipo.getRuta(), tipo.isLista(), fecha);

		}
		return pedido;
	}

	@Override
	public Articulo consultaArticulo(String id, Tipo tipo) {
		gestor guardar = new gestor(tipo);
		GestorUnificado unif = new GestorUnificado(tipo);
		Articulo articulo = new Articulo(id, "tele", 45060f, "tele cara");
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			ArrayList listaArticulo = (ArrayList) unif.obtener();
			if (listaArticulo.contains(articulo)) {
				int posicion = listaArticulo.indexOf(articulo);
				return (Articulo) listaArticulo.get(posicion);
			}

		}
		return null;

	}
}