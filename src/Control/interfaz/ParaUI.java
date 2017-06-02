package Control.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import Modelo.Cliente;
import Utiles.Tipo;
import Vista.UI;

public class ParaUI extends UI {
	IAltas altas;

	public ParaUI(IAltas altas) {
		super();
		this.altas=altas;
		btnAltaClienteConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Apéndice de método generado automáticamente
				//ya esta validado
				//tiene que haber una clase que implement IAltas
				altas.altaCliente(txtDNIAltaCliente.getText(), txtNombreAltaCliente.getText(), txtDireccionAltaCliente.getText(), Tipo.cliente);
				
			}
		});
		
		btnAltaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altas.altaPedido(txtIDAltaPedido, ComboBoxClienteAltaPedido, linea, Tipo.pedido);
			}
			
		});
		
		btnAltaArticuloConfirmar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				altas.altaArticulo(txtIDAltaArticulo.getText(), txtNombreAltaArticulo.getText(), txtPrecioAltaArticulo, textPaneDescripcionAltaArticulo.getText(), Tipo.articulo);
			}
		});
		
		
	}

	
}
