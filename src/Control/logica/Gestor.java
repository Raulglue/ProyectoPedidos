package Control.logica;

import Modelo.DAO;
import Utiles.Tipo;

public class Gestor {


	public boolean escrbirObjeto(Object obj, Tipo tipo) {
		return new DAO().grabar(obj, tipo.getRuta(), tipo.isLista());
	}

	public Object obtenerObjeto(Tipo tipo) {
		return new DAO().leer(tipo.getRuta(), tipo.isLista());
	}
}

