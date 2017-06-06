package Utiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;

import Control.adaptador.GestorUnificado;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;

public class Varios {
	ObjectInputStream adaptadorLectura = null;

	public ArrayList obtenerClientes(){
		GestorUnificado unif = new GestorUnificado(Tipo.cliente);
		ArrayList listaCliente = (ArrayList) unif.obtener();
		if (listaCliente == null) {
			listaCliente = new ArrayList();
		} 
		return listaCliente;
	}
	public JComboBox rellenaCombo(JComboBox box){
		box = new JComboBox<>();
		ArrayList listaCliente = obtenerClientes();
		 for (int i = 0; i < listaCliente.size(); i++){
			box.addItem(listaCliente.get(i));
		 }
		return box;
	}
	public Object leerPedido(String path, boolean unico, String id) {
		Cliente cliente = new Cliente("1", "Juan", "Merida");
		Articulo articulo = new Articulo("1", "peine", 5f, " ");
		ArrayList lineaPedido = new ArrayList<>();
		lineaPedido.add(articulo);
		Pedido pedido = new Pedido(id, cliente, lineaPedido);
		File archivo = new File(path);
		Pedido socio = new Pedido("null", new Cliente("null", "null", "null"), new ArrayList<>());
		boolean encontrado = false;
		try {
			boolean inicial = false;
			
				if (!archivo.exists()) {
					archivo.createNewFile();
					inicial = true;
				}
			// este es el if que controla si el flujo debe abrirse o no
			if (unico || adaptadorLectura == null) {
				if (archivo.length()>0) {
				FileInputStream flujoEntrada = new FileInputStream(archivo);
				adaptadorLectura = new ObjectInputStream(flujoEntrada);
				do {
					if((Pedido) adaptadorLectura.readObject()==null){
						encontrado =true;
					}else {
						socio = (Pedido) adaptadorLectura.readObject();
					}
					if(((Pedido)socio).equals(pedido)|| socio ==null)
						encontrado = true;
				} while (!encontrado);
				
				// este controla si debe cerrarse o no
				if (unico)
					adaptadorLectura.close();
				else {
					// si tras una operacion de lectura el resultado ha sido null
					// implica ue el flujo ha llegado al final del fichero
					if (socio == null) {
						adaptadorLectura.close();
					}
				}
				}
			}
			

		} catch (FileNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (IOException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		}
		if(socio!=null){
		return socio;
		}else{
			return socio;
		}
	}
}


