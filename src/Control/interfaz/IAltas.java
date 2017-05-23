package Control.interfaz;

import java.sql.Date;
import java.util.ArrayList;

import Modelo.Cliente;

public interface IAltas {
public void altaCliente(String dni, String nombre, String direccion);
public void altaPedido(Date id, Cliente cliente, ArrayList linea);
public void altaArticulo(String id, String nombre, float precio, String descripcion);
}
