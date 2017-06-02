package Control.interfaz;

import java.sql.Date;

import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;

public interface IConsultas {
public Cliente consultaCliente(String dni, Tipo tipo);
public Pedido consultaPedido(Date id, Tipo tipo);
public Articulo consultaArticulo(String id, Tipo tipo);
}
