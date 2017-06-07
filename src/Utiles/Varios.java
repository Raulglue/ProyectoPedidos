package Utiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Control.Consulta;
import Control.adaptador.GestorUnificado;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;

public class Varios {
	ObjectInputStream adaptadorLectura = null;
	Consulta consulta = new Consulta();
	public ArrayList obtenerClientes() {
		GestorUnificado unif = new GestorUnificado(Tipo.cliente);
		ArrayList listaCliente = (ArrayList) unif.obtener();
		if (listaCliente == null) {
			listaCliente = new ArrayList();
		}
		return listaCliente;
	}
	
public Object[] toArray(Object object ){
	Object [] array = ((ArrayList) object).toArray();
	return array;
}

public ArrayList rellenaLista(ArrayList<LineaPedido> lista, JTable table){
	int filas = table.getRowCount();
	for (int i = 0; i < filas; i++) {
		Articulo articulo = consulta.consultaArticulo((String) table.getValueAt(i,1), Tipo.articulo);
		int cantidad = Integer.valueOf((String) table.getValueAt(i, 2)); 
		lista.add(new LineaPedido(i+1, articulo, cantidad));
	}
	return lista;
}

public String calcularPrecio (JTable table){
	int filas = table.getRowCount();
	float precio=0;
	int cantidad =0 ;
	for (int i = 0; i < filas; i++) {
		Articulo articulo = consulta.consultaArticulo( (String)table.getValueAt(i, 1), Tipo.articulo);
		precio+= articulo.getPrecio()*Integer.valueOf((String) table.getValueAt(i, 2));
	}
	return String.valueOf(precio);
}
	public JComboBox rellenaCombo(JComboBox box) {
		box = new JComboBox<>();
		box.removeAllItems();
		ArrayList listaCliente = obtenerClientes();
		for (int i = 0; i < listaCliente.size(); i++) {
			box.addItem(listaCliente.get(i).toString());
		}
		return box;
	}

	public Object leerPedido(String path, boolean unico, Object obj) {
		File archivo = new File(path);
		Object socio = null;
		boolean encontrado = false;
		try {
			boolean inicial = false;

			if (!archivo.exists()) {
				archivo.createNewFile();
				inicial = true;
			}
			// este es el if que controla si el flujo debe abrirse o no
			if (unico || adaptadorLectura == null) {
				if (archivo.length() > 0) {
					FileInputStream flujoEntrada = new FileInputStream(archivo);
					adaptadorLectura = new ObjectInputStream(flujoEntrada);
					do {
						socio = adaptadorLectura.readObject();

						   encontrado = comparar(socio, obj);
						  } while (!encontrado && socio != null);
					// este controla si debe cerrarse o no
					if (unico)
						adaptadorLectura.close();
					else {
						// si tras una operacion de lectura el resultado ha sido
						// null
						// implica ue el flujo ha llegado al final del fichero
						if (socio == null) {
							adaptadorLectura.close();
						}
					}
				}else{
					socio = new Pedido("pedido no encontrado", new Cliente("null", "null", "null"), new ArrayList<>());
				}
			}

		} catch (FileNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		} catch (IOException e) {
			socio = new Pedido("pedido no encontrado", new Cliente("null", "null", "null"), new ArrayList<>());
			if (Constantes.errores)
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (Constantes.errores)
				e.printStackTrace();
		}
		return socio;
	}

	private boolean comparar(Object comparador, Object obj) {
		return comparador.equals(obj);
	}

	public void precioUnidad(JTable table) {
		
		
	}

	public JTable limpiaTabla(JTable table) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int filas = table.getRowCount();
		for (int i = filas-1; i > 0; i--) {
			model.removeRow(i);
		}
		return table;
		
	}
}
