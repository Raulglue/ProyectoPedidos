package Control.adaptador;

import Modelo.DAO;
import Utiles.Tipo;

public class GestorUnificado {
	Tipo tipo;
	//obligo al que crea el objeto a decirme que tipo es
	public GestorUnificado(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	public boolean escribir(Object obj) {
		return new DAO().grabar(obj, tipo.getRuta(), tipo.isLista());
	}

	public Object obtener() {
		return new DAO().leer(tipo.getRuta(), tipo.isLista());
	}
}
