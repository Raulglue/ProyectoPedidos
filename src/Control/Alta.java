package Control;

import java.sql.Date;
import java.util.ArrayList;

import Control.interfaz.IAltas;
import Modelo.Cliente;
import Utiles.Tipo;

public class Alta implements IAltas{

	@Override
	public void altaCliente(String dni, String nombre, String direccion, Tipo tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altaPedido(Date id, Cliente cliente, ArrayList linea, Tipo tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altaArticulo(String id, String nombre, float precio, String descripcion, Tipo tipo) {
		// TODO Auto-generated method stub
		
	}



}
