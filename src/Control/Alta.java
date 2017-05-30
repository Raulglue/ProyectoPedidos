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

	public void altaCliente(String dni, String nombre, String direccion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Cliente MiCliente = new Cliente(dni, nombre, direccion);
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(MiCliente);
		guardar.escribir(listaCliente);
	

	
	}
	@Override

	public void altaPedido(Date id, Cliente cliente, ArrayList linea, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Pedido MiPedido = new Pedido(id, cliente);
		

	}

	@Override

	public void altaArticulo(String id, String nombre, float precio, String descripcion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Articulo MiArticulo= new Articulo(id, nombre, precio, descripcion);
		ArrayList<Articulo> listaArticulo = new ArrayList<>();
		listaArticulo.add(MiArticulo);
		guardar.escribir(listaArticulo);
		

	}



}
