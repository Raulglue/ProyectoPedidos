package Modelo;

import java.io.Serializable;

public class Articulo implements Serializable {
	private String id;
	private String nombre;
	private float precio;
	private String descripcion;

	public Articulo(String id, String nombre, float precio, String descripcion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
