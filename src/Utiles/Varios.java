package Utiles;

import java.util.ArrayList;

import javax.swing.JComboBox;

import Control.adaptador.GestorUnificado;

public class Varios {
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
}


