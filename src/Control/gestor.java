package Control;

import java.util.Set;

import Control.adaptador.GestorUnificado;
import Utiles.Tipo;

public class gestor {

	Tipo tipo;

	public gestor(Tipo tipo) {
		super();
		this.tipo = tipo;
	}

	public boolean insertar(Object obj){
		return new GestorUnificado(tipo).escribir(obj);
	}
	/**
	 * busca un objeto en un fichero
	 * 
	 * @param obj
	 *            el objeto a buscar
	 * @return el valor de la posicion enla que se encuentra o -1 si no existe
	 */
	public int buscar(Object obj) {
		if (tipo.isLista())
			return buscaLista(obj);
		else
			return buscaObjeto(obj);
	}

	private int buscaObjeto(Object obj) {
		GestorUnificado buscador = new GestorUnificado(tipo);
		int contador = -1;
		Object comparador = null;
		boolean encontrado = false;
		do {
			contador++;
			comparador = buscador.obtener();
			encontrado = comparar(comparador, obj);
		} while (!encontrado && comparador != null);
		buscador.finalizar();
		if (encontrado)
			return contador;
		else
			return -1;
	}

	private boolean comparar(Object comparador, Object obj) {
		return comparador.equals(obj);
	}

	private int buscaLista(Object obj) {
		Set col = (Set) new GestorUnificado(tipo).obtener();
		if (col.contains(obj))
			return 0;
		else
			return -1;
	}
}
