package Control.interfaz;

import java.sql.Date;
import java.util.ArrayList;

import Modelo.Cliente;
import Utiles.Tipo;

public interface IAltas {
public boolean altaCliente(String dni, String nombre, String direccion,Tipo tipo);
public boolean altaPedido(String id, Cliente cliente, ArrayList linea,Tipo tipo);
public boolean altaArticulo(String id, String nombre, float precio, String descripcion,Tipo tipo);
}
