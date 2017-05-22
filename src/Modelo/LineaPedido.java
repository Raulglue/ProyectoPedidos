package Modelo;

public class LineaPedido {
	private int numeroLinea;
	private Articulo articulo;
	private int cantidad;
	public LineaPedido(int numeroLinea, Articulo articulo, int cantidad) {
		super();
		this.numeroLinea = numeroLinea;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	
}
