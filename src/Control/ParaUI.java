package Control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

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
		
		btnCalcularPrecioTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPrecioTotal.setText(varios.calcularPrecio(table)+" €");
				varios.precioUnidad(table);
			}
		});
		
		btnAgregarLineaAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numeroLinea = table.getRowCount()+1;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{numeroLinea, "", ""});
			}
		});

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
				if (clienteb) {
					lblEstadoAltaCliente.setText("Alta realizada con exito");
					txtDNIAltaCliente.setText("");
					txtNombreAltaCliente.setText("");
					txtDireccionAltaCliente.setText("");
				}else{
					lblEstadoAltaCliente.setText("Ha habido algun error, revisa que hayas introducido todo correctamente");
				}
			}
		});

		btnAltaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList lista = new ArrayList<>();
				lista = varios.rellenaLista(lista, table);
				if (!txtIDAltaPedido.getText().isEmpty()) {
					boolean pedidob = altas.altaPedido(txtIDAltaPedido.getText(),
							(Cliente) comboBoxClienteAltaPedido.getSelectedItem(), lista, Tipo.pedido);
					if (pedidob) {
						lblEstadoAltaPedido.setText("Alta realizada con exito");
						txtIDAltaPedido.setText("");
						table=varios.limpiaTabla(table);
					}else{
						lblEstadoAltaPedido.setText("Ha habido algun error, revisa que hayas introducido todo correctamente");
					}
				}else{
					lblEstadoAltaPedido.setText("El campo ID no puede estar vacio");
				}
				
			}

		});

		btnAltaArticuloConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean articulob = altas.altaArticulo(txtIDAltaArticulo.getText(), txtNombreAltaArticulo.getText(),
						Float.parseFloat(txtPrecioAltaArticulo.getText()), textPaneDescripcionAltaArticulo.getText(),
						Tipo.articulo);
				if (articulob) {
					lblEstadoAltaArticulo.setText("Alta realizada con exito");
				}else{
					lblEstadoAltaArticulo.setText("Ha habido algun error, revisa que hayas introducido todo correctamente");
				}
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
						.setText(pedido.toString());
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
