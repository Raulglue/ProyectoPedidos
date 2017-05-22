package Modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Pedido {
	private Date id;
	private Cliente cliente;
	private ArrayList lineaPedido;
	public Pedido(Date id, Cliente cliente) {
		super();
		this.id = id;
		this.cliente = cliente;
	}
	
	public ArrayList getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(LineaPedido lineaPedido) {
		this.lineaPedido.add(lineaPedido);
	}

	public Date getId() {
		return id;
	}
	public Cliente getCliente() {
		return cliente;
	}



}
