package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import Control.interfaz.IAltas;
import Control.interfaz.IBajas;
import Control.interfaz.IConsultas;
import Modelo.Cliente;
import Utiles.Tipo;
import Vista.UI;

public class ParaUI extends UI {
	Alta altas = new Alta();
	Bajas bajas = new Bajas();
	Consulta consultas = new Consulta();
	public ParaUI() {
		
		btnAltaClienteConfirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean clienteb = altas.altaCliente(txtDNIAltaCliente.getText(), txtNombreAltaCliente.getText(),
						txtDireccionAltaCliente.getText(), Tipo.cliente);

			}
		});

		btnAltaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				boolean pedidob = altas.altaPedido(fecha, (Cliente)comboBoxClienteAltaPedido.getSelectedItem(), new ArrayList(), Tipo.pedido);
			}

		});

		btnAltaArticuloConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean articulob = altas.altaArticulo(txtIDAltaArticulo.getText(), txtNombreAltaArticulo.getText(),
						Float.parseFloat(txtPrecioAltaArticulo.getText()), textPaneDescripcionAltaArticulo.getText(),
						Tipo.articulo);
			}
		});

	


		
		btnBajaClienteConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bajas.bajaCliente(txtDNIBajaCliente.getText(), Tipo.cliente);
			}
		});

		btnBajaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bajas.bajaPedido(txtIDBajaPedido, Tipo.pedido);
			}

		});

		btnBajaArticuloConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bajas.bajaArticulo(txtIDBajaArticulo.getText(), Tipo.articulo);
			}
		});

	



		
		btnConsultaClienteBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultas.consultaCliente(txtDNIConsultaCliente.getText(), Tipo.cliente);
			}
		});

		btnConsultaPedidoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultas.consultaPedido((Date) txtIDConsultaPedido.getText(), Tipo.pedido);
			}

		});

		btnConsultaArticuloBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultas.consultaArticulo(txtIDConsultaArticulo.getText(), Tipo.articulo);
			}
		});

	}

}
