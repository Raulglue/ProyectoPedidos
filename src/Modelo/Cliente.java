package Modelo;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String dni;
	private String nombre;
	private String direccion;


	public Cliente(String dni, String nombre, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	@Override
	public boolean equals(Object obj) {
		return this.dni.equals(((Cliente) obj).dni);
	}
}
