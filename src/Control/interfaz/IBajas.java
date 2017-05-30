package Control.interfaz;

import java.sql.Date;
import java.util.ArrayList;

import Modelo.Cliente;
import Utiles.Tipo;

public interface IBajas {
	public boolean bajaCliente(String dni, Tipo tipo);
	public boolean bajaPedido(Date id, Tipo tipo);
	public boolean bajaArticulo(String id, Tipo tipo);
}
