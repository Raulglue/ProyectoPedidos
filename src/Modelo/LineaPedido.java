package Modelo;

import java.io.Serializable;

public class LineaPedido implements Serializable{
	private int numeroLinea;
	private Articulo articulo;
	private int cantidad;
	public LineaPedido(int numeroLinea, Articulo articulo, int cantidad) {
		super();
		this.numeroLinea = numeroLinea;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	public int getNumeroLinea() {
		return numeroLinea;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	
}
