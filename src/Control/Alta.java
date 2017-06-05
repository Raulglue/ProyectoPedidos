package Control;

import java.util.ArrayList;

import Control.adaptador.GestorUnificado;
import Control.interfaz.IAltas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;

public class Alta implements IAltas {

	Consulta consulta;

	@Override

	public boolean altaCliente(String dni, String nombre, String direccion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Cliente MiCliente = new Cliente(dni, nombre, direccion);
		ArrayList listaCliente = (ArrayList) guardar.obtener();
		if (listaCliente == null) {
			listaCliente = new ArrayList();
			if (!listaCliente.contains(MiCliente)) {
				listaCliente.add(MiCliente);
				return guardar.escribir(listaCliente);
			}
		} else if (!listaCliente.contains(MiCliente)) {
			listaCliente.add(MiCliente);
			return guardar.escribir(listaCliente);
		
	}
		return false;
	}
	

	@Override

	public boolean altaArticulo(String id, String nombre, float precio, String descripcion, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Articulo MiArticulo = new Articulo(id, nombre, precio, descripcion);
		ArrayList listaArticulo =  (ArrayList) guardar.obtener();
		if(listaArticulo ==null){
			listaArticulo = new ArrayList();
			if (!listaArticulo.contains(MiArticulo)) {
				listaArticulo.add(MiArticulo);
				return guardar.escribir(listaArticulo);
			}
		}
		return false;
	}
	
	@Override

	public boolean altaPedido(String id, Cliente cliente, ArrayList linea, Tipo tipo) {
		GestorUnificado guardar = new GestorUnificado(tipo);
		Pedido MiPedido = new Pedido(id, cliente, linea);
		return guardar.escribir(MiPedido);

	}
}
