package Modelo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido implements Serializable{
	private String id;
	private Cliente cliente;
	private ArrayList lineaPedido;
	
	
	public Pedido(String id, Cliente cliente, ArrayList lineaPedido) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.lineaPedido = lineaPedido;
	}

	

	public ArrayList getLineaPedido() {
		return lineaPedido;
	}



	public String getId() {
		return id;
	}
	public Cliente getCliente() {
		return cliente;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	



}
