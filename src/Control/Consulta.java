package Control;


import Control.adaptador.GestorUnificado;
import Modelo.Cliente;
import Utiles.Tipo;

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
	public ArrayList consultaCliente(String dni, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Cliente cliente = null;
		File file = new File(tipo.getRuta());
		if(file.exists()){
		cliente = (Cliente) buscar.obtener();
			}
		
			return cliente;
	}

	@Override
	public Pedido consultaPedido(Date id, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Pedido pedido = null;
		File file = new File(tipo.getRuta());
		if (file.exists()) {
			pedido = (Pedido) buscar.obtener();

		}
		return pedido;
	}

	@Override
	public Articulo consultaArticulo(String id, Tipo tipo) {
		GestorUnificado buscar = new GestorUnificado(tipo);
		Articulo articulo = null;
		File file = new File(tipo.getRuta());
		if(file.exists()){
		articulo = (Articulo) buscar.obtener();
			}
		return articulo;
	}


}
