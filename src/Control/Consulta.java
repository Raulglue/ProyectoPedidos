package Control;

import Control.adaptador.GestorUnificado;
import Modelo.Cliente;
import Utiles.Tipo;

public class Consulta {

	
	public void consultarCliente(Cliente cliente){
		GestorUnificado buscar = new GestorUnificado(Tipo.cliente);
		buscar.busca(cliente);
	}
}
