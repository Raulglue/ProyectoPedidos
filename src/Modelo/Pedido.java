package Modelo;

import java.sql.Date;

public class Pedido {
	private Date id;
	private Cliente cliente;
	private LineaPedido lineaPedido;

	public Pedido(Date id, Cliente cliente, LineaPedido lineaPedido) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.lineaPedido = lineaPedido;
	}

}
