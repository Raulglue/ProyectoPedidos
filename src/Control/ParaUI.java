package Control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import Control.adaptador.GestorUnificado;
import Control.interfaz.IAltas;
import Control.interfaz.IBajas;
import Control.interfaz.IConsultas;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Pedido;
import Utiles.Tipo;
import Utiles.Varios;
import Vista.UI;

public class ParaUI extends UI {

	Alta altas = new Alta();
	Bajas bajas = new Bajas();
	Consulta consultas = new Consulta();
	Varios varios = new Varios();

	public ParaUI() {

		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) contentPane.getLayout()).show(contentPane, "name_109310969146127");
			}

		});

		btnAltaClienteConfirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean clienteb = altas.altaCliente(txtDNIAltaCliente.getText(), txtNombreAltaCliente.getText(),
						txtDireccionAltaCliente.getText(), Tipo.cliente);

			}
		});

		btnAltaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList lista = new ArrayList<>();
				lista = varios.rellenaLista(lista, table);
				boolean pedidob = altas.altaPedido(txtIDAltaPedido.getText(),
						(Cliente) comboBoxClienteAltaPedido.getSelectedItem(), lista, Tipo.pedido);
			}

		});

		btnAltaArticuloConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean articulob = altas.altaArticulo(txtIDAltaArticulo.getText(), txtNombreAltaArticulo.getText(),
						Float.parseFloat(txtPrecioAltaArticulo.getText()), textPaneDescripcionAltaArticulo.getText(),
						Tipo.articulo);
			}
		});

		// btnBajaClienteConfirmar.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// bajas.bajaCliente(txtDNIBajaCliente.getText(), Tipo.cliente);
		// }
		// });

		// btnBajaPedidoConfirmar.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// bajas.bajaPedido(txtIDBajaPedido, Tipo.pedido);
		// }
		//
		// });

		// btnBajaArticuloConfirmar.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// bajas.bajaArticulo(txtIDBajaArticulo.getText(), Tipo.articulo);
		// }
		// });

		btnConsultaClienteBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = consultas.consultaCliente(txtDNIConsultaCliente.getText(), Tipo.cliente);
				if (cliente != null)
					txtResultadoConsultaCliente.setText("ID: " + cliente.getDni() + ",nombre: " + cliente.getNombre()
							+ ", direccion: " + cliente.getDireccion());
			}
		});

		btnConsultaPedidoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido = consultas.consultaPedido(txtIDConsultaPedido.getText(), Tipo.pedido);
				txtResultadoConsultaPedido
						.setText("id: " + pedido.getId() + ", cliente : " + pedido.getCliente().getNombre());
			}

		});

		btnConsultaArticuloBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articulo articulo = consultas.consultaArticulo(txtIDConsultaArticulo.getText(), Tipo.articulo);
				if (articulo != null)
					txtResultadoConsultaArticulo.setText(
							"ID: " + articulo.getId() + " , nombre: " + articulo.getNombre() + " , descripcion: "
									+ articulo.getDescripcion() + " , precio: " + articulo.getPrecio());
			}
		});

	}

}
