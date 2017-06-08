package Control.logica;

import java.awt.BufferCapabilities;
import java.io.File;
import java.nio.Buffer;
import java.sql.Date;

import Control.adaptador.GestorUnificado;
import Control.interfaz.IBajas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;

public class Bajas implements IBajas {

	@Override
	public boolean bajaCliente(String dni, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Cliente cliente = null;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			cliente = (Cliente) buscar.obtener();

		}
		return buscar.borra(cliente);

	}

	@Override
	public boolean bajaPedido(String id, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Pedido pedido = null;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			pedido = (Pedido) buscar.obtener();

		}
		return buscar.borra(pedido);
	}

	@Override
	public boolean bajaArticulo(String id, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Articulo articulo = null;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			articulo = (Articulo) buscar.obtener();

		}
		return buscar.borra(articulo);
	}
}
