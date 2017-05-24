package Control.interfaz;

import java.sql.Date;
import java.util.ArrayList;

import Modelo.Cliente;
import Utiles.Tipo;

public interface IAltas {
public void altaCliente(String dni, String nombre, String direccion,Tipo tipo);
public void altaPedido(Date id, Cliente cliente, ArrayList linea,Tipo tipo);
public void altaArticulo(String id, String nombre, float precio, String descripcion,Tipo tipo);
}
