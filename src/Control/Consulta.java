package Control;

import java.sql.Date;

import Control.interfaz.IConsultas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;

public class Consulta implements IConsultas {

	@Override
	public Cliente consultaCliente(String dni, Tipo tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido consultaPedido(Date id, Tipo tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo consultaArticulo(String id, Tipo tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
