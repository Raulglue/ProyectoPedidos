package Modelo;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String dni;
	private String nombre;
	private String direccion;
	public Cliente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean equals(Object obj) {
		return this.dni == ((Cliente) obj).dni;
	}
}
