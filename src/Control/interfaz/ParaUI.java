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
				altas.altaPedido(txtIDAltaPedido, comboBoxClienteAltaPedido, linea, Tipo.pedido);
			}
			
		});
		
		btnAltaArticuloConfirmar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				altas.altaArticulo(txtIDAltaArticulo.getText(), txtNombreAltaArticulo.getText(), txtPrecioAltaArticulo, textPaneDescripcionAltaArticulo.getText(), Tipo.articulo);
			}
		});
		
		
	}
	
	IBajas bajas;
	
	public ParaUI(IBajas bajas) {
		super();
		this.bajas=bajas;
		btnBajaClienteConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bajas.bajaCliente(txtDNIBajaCliente, Tipo.cliente);
			}
		});
				
		btnBajaPedidoConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bajas.bajaPedido(txtIDBajaPedido, Tipo.pedido);
			}
			
		});
		
		btnBajaArticuloConfirmar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				bajas.bajaArticulo(txtIDBajaArticulo, Tipo.articulo);
			}
		});
		
				
			
	}
	
	IConsultas consultas;

	public ParaUI(IConsultas consultas) {
		super();
		this.consultas=consultas;
		btnConsultaClienteBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultas.consultaCliente(txtDNIConsultaCliente, Tipo.cliente);
			}
		});
				
		btnConsultaPedidoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultas.consultaPedido(txtIDConsultaPedido, Tipo.pedido);
			}
			
		});
		
		btnConsultaArticuloBuscar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				consultas.consultaArticulo(txtIDConsultaArticulo, Tipo.articulo);
			}
		});
		
				
			
	}
	
	
}
