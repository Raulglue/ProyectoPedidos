package Control;

import java.sql.Date;
import java.util.ArrayList;

import Control.adaptador.GestorUnificado;
import Control.interfaz.IAltas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.DAO;
import Modelo.Pedido;
import Utiles.Tipo;

public class Alta implements IAltas{
	

	@Override

	public boolean altaCliente(String dni, String nombre, String direccion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Cliente MiCliente = new Cliente(dni, nombre, direccion);
		ArrayList listaCliente = new ArrayList();
		listaCliente.add(MiCliente);
		return guardar.escribir(listaCliente);
	

	
	}
	@Override

	public boolean altaPedido(Date id, Cliente cliente, ArrayList linea, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Pedido MiPedido = new Pedido(id, cliente, linea);
		return guardar.escribir(MiPedido);
		

	}

	@Override

	public boolean altaArticulo(String id, String nombre, float precio, String descripcion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Articulo MiArticulo= new Articulo(id, nombre, precio, descripcion);
		ArrayList<Articulo> listaArticulo = new ArrayList<>();
		listaArticulo.add(MiArticulo);
		return guardar.escribir(listaArticulo);
		

	}



}
