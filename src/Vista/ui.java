package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class UI extends JFrame {
	private JPanel contentPane;
	private JTextField txtDNIAltaCliente;
	private JTextField txtNombreAltaCliente;
	private JTextField txtDireccionAltaCliente;
	private JTextField txtDNIConsultaCliente;
	private JTextField txtIDAltaPedido;
	private JTextField txtIDConsultaPedido;
	private JTextField txtIDAltaArticulo;
	private JTextField txtIDConsultaArticulo;
	private JTextField txtResultadoConsultaPedido;
	private JTextField txtResultadoConsultaArticulo;
	private JTextField txtResultadoConsultaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setTitle("Base de datos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/Vista/DatabaseICO.PNG")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(UI.class.getResource("/Vista/InicioICO.png")));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_106975984728795");
			}
		});
		btnHome.setBackground(Color.GRAY);
		btnHome.setForeground(Color.BLACK);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		menuBar.add(btnHome);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnCliente);
		
		JMenuItem mntmClienteAlta = new JMenuItem("Alta");
		mntmClienteAlta.setIcon(new ImageIcon(UI.class.getResource("/Vista/AltaICO.PNG")));
		mntmClienteAlta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmClienteAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109289332868835");
			}
		});
		mnCliente.add(mntmClienteAlta);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConsultaICO.PNG")));
		mntmConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109307298174363");
			}
		});
		mnCliente.add(mntmConsulta);
		
		JMenu mnPedido = new JMenu("Pedido");
		mnPedido.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnPedido);
		
		JMenuItem mntmPedidoAlta = new JMenuItem("Alta");
		mntmPedidoAlta.setIcon(new ImageIcon(UI.class.getResource("/Vista/AltaICO.PNG")));
		mntmPedidoAlta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmPedidoAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109310969146127");
			}
		});
		mnPedido.add(mntmPedidoAlta);
		
		JMenuItem mntmPedidoConsulta = new JMenuItem("Consulta");
		mntmPedidoConsulta.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConsultaICO.PNG")));
		mntmPedidoConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmPedidoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109313289553643");
			}
		});
		mnPedido.add(mntmPedidoConsulta);
		
		JMenu mnArticulo = new JMenu("Art\u00EDculo");
		mnArticulo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnArticulo);
		
		JMenuItem mntmArticuloAlta = new JMenuItem("Alta");
		mntmArticuloAlta.setIcon(new ImageIcon(UI.class.getResource("/Vista/AltaICO.PNG")));
		mntmArticuloAlta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmArticuloAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109314960534486");
			}
		});
		mnArticulo.add(mntmArticuloAlta);
		
		JMenuItem mntmArticuloConsulta = new JMenuItem("Consulta");
		mntmArticuloConsulta.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConsultaICO.PNG")));
		mntmArticuloConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmArticuloConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109316913587523");
			}
		});
		mnArticulo.add(mntmArticuloConsulta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, "name_106975984728795");
		panelPrincipal.setLayout(new BorderLayout(0, 10));
		
		JLabel lblPanelPrincipal = new JLabel("Panel de control");
		lblPanelPrincipal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPanelPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblPanelPrincipal, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 1;
		gbc_lblCliente.gridy = 1;
		panel.add(lblCliente, gbc_lblCliente);
		
		JButton btnDarDeAlta = new JButton("Dar de alta cliente");
		btnDarDeAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109289332868835");
			}
		});
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 3;
		gbc_btnDarDeAlta.gridy = 1;
		panel.add(btnDarDeAlta, gbc_btnDarDeAlta);
		
		JButton btnConsultaCliente = new JButton("Consultar cliente");
		btnConsultaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109307298174363");
			}
		});
		GridBagConstraints gbc_btnConsultaCliente = new GridBagConstraints();
		gbc_btnConsultaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultaCliente.gridx = 5;
		gbc_btnConsultaCliente.gridy = 1;
		panel.add(btnConsultaCliente, gbc_btnConsultaCliente);
		
		JLabel lblPedido = new JLabel("Pedido:");
		lblPedido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedido.gridx = 1;
		gbc_lblPedido.gridy = 3;
		panel.add(lblPedido, gbc_lblPedido);
		
		JButton btnAltaCliente = new JButton("Dar de alta pedido");
		btnAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109310969146127");
			}
		});
		GridBagConstraints gbc_btnAltaCliente = new GridBagConstraints();
		gbc_btnAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnAltaCliente.gridx = 3;
		gbc_btnAltaCliente.gridy = 3;
		panel.add(btnAltaCliente, gbc_btnAltaCliente);
		
		JButton btnConsultaPedido = new JButton("Consultar pedido");
		btnConsultaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109313289553643");
			}
		});
		GridBagConstraints gbc_btnConsultaPedido = new GridBagConstraints();
		gbc_btnConsultaPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultaPedido.gridx = 5;
		gbc_btnConsultaPedido.gridy = 3;
		panel.add(btnConsultaPedido, gbc_btnConsultaPedido);
		
		JLabel lblArticulo = new JLabel("Articulo:");
		lblArticulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblArticulo = new GridBagConstraints();
		gbc_lblArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_lblArticulo.gridx = 1;
		gbc_lblArticulo.gridy = 5;
		panel.add(lblArticulo, gbc_lblArticulo);
		
		JButton btnAltaArticulo = new JButton("Dar de alta articulo");
		btnAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109314960534486");
			}
		});
		GridBagConstraints gbc_btnAltaArticulo = new GridBagConstraints();
		gbc_btnAltaArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_btnAltaArticulo.gridx = 3;
		gbc_btnAltaArticulo.gridy = 5;
		panel.add(btnAltaArticulo, gbc_btnAltaArticulo);
		
		JButton btnConsultaArticulo = new JButton("Consultar articulo");
		btnConsultaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109316913587523");
			}
		});
		GridBagConstraints gbc_btnConsultaArticulo = new GridBagConstraints();
		gbc_btnConsultaArticulo.gridx = 5;
		gbc_btnConsultaArticulo.gridy = 5;
		panel.add(btnConsultaArticulo, gbc_btnConsultaArticulo);
		
		JPanel panelAltaCliente = new JPanel();
		contentPane.add(panelAltaCliente, "name_109289332868835");
		panelAltaCliente.setLayout(new BorderLayout(0, 10));
		
		JLabel lblAltaCliente = new JLabel("Dar de alta cliente");
		lblAltaCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panelAltaCliente.add(lblAltaCliente, BorderLayout.NORTH);
		
		JPanel panelAltaClienteBtn = new JPanel();
		panelAltaCliente.add(panelAltaClienteBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaClienteBtn = new GridBagLayout();
		gbl_panelAltaClienteBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelAltaClienteBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelAltaClienteBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelAltaClienteBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaClienteBtn.setLayout(gbl_panelAltaClienteBtn);
		
		JLabel lblDatosCliente = new JLabel("Datos del cliente:");
		lblDatosCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatosCliente.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.anchor = GridBagConstraints.EAST;
		gbc_lblDatosCliente.insets = new Insets(0, 10, 5, 5);
		gbc_lblDatosCliente.gridx = 1;
		gbc_lblDatosCliente.gridy = 1;
		panelAltaClienteBtn.add(lblDatosCliente, gbc_lblDatosCliente);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConfirmarICO.PNG")));
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 10);
		gbc_btnConfirmar.gridx = 5;
		gbc_btnConfirmar.gridy = 1;
		panelAltaClienteBtn.add(btnConfirmar, gbc_btnConfirmar);
		
		JLabel dummy1 = new JLabel(" ");
		GridBagConstraints gbc_dummy1 = new GridBagConstraints();
		gbc_dummy1.insets = new Insets(0, 0, 5, 5);
		gbc_dummy1.gridx = 3;
		gbc_dummy1.gridy = 2;
		panelAltaClienteBtn.add(dummy1, gbc_dummy1);
		
		JLabel lblDNIAltaCliente = new JLabel("DNI:");
		lblDNIAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDNIAltaCliente = new GridBagConstraints();
		gbc_lblDNIAltaCliente.anchor = GridBagConstraints.EAST;
		gbc_lblDNIAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNIAltaCliente.gridx = 1;
		gbc_lblDNIAltaCliente.gridy = 3;
		panelAltaClienteBtn.add(lblDNIAltaCliente, gbc_lblDNIAltaCliente);
		
		txtDNIAltaCliente = new JTextField();
		txtDNIAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtDNIAltaCliente = new GridBagConstraints();
		gbc_txtDNIAltaCliente.gridwidth = 3;
		gbc_txtDNIAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNIAltaCliente.insets = new Insets(0, 0, 5, 10);
		gbc_txtDNIAltaCliente.gridx = 3;
		gbc_txtDNIAltaCliente.gridy = 3;
		panelAltaClienteBtn.add(txtDNIAltaCliente, gbc_txtDNIAltaCliente);
		txtDNIAltaCliente.setColumns(10);
		
		JLabel dummy2 = new JLabel(" ");
		GridBagConstraints gbc_dummy2 = new GridBagConstraints();
		gbc_dummy2.insets = new Insets(0, 0, 5, 5);
		gbc_dummy2.gridx = 3;
		gbc_dummy2.gridy = 4;
		panelAltaClienteBtn.add(dummy2, gbc_dummy2);
		
		JLabel lblNombreAltaCliente = new JLabel("Nombre:");
		lblNombreAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreAltaCliente = new GridBagConstraints();
		gbc_lblNombreAltaCliente.anchor = GridBagConstraints.EAST;
		gbc_lblNombreAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreAltaCliente.gridx = 1;
		gbc_lblNombreAltaCliente.gridy = 5;
		panelAltaClienteBtn.add(lblNombreAltaCliente, gbc_lblNombreAltaCliente);
		
		txtNombreAltaCliente = new JTextField();
		txtNombreAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtNombreAltaCliente = new GridBagConstraints();
		gbc_txtNombreAltaCliente.gridwidth = 3;
		gbc_txtNombreAltaCliente.insets = new Insets(0, 0, 5, 10);
		gbc_txtNombreAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreAltaCliente.gridx = 3;
		gbc_txtNombreAltaCliente.gridy = 5;
		panelAltaClienteBtn.add(txtNombreAltaCliente, gbc_txtNombreAltaCliente);
		txtNombreAltaCliente.setColumns(10);
		
		JLabel dummy3 = new JLabel(" ");
		GridBagConstraints gbc_dummy3 = new GridBagConstraints();
		gbc_dummy3.insets = new Insets(0, 0, 5, 5);
		gbc_dummy3.gridx = 3;
		gbc_dummy3.gridy = 6;
		panelAltaClienteBtn.add(dummy3, gbc_dummy3);
		
		JLabel lblDireccionAltaCliente = new JLabel("Direcci\u00F3n:");
		lblDireccionAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDireccionAltaCliente = new GridBagConstraints();
		gbc_lblDireccionAltaCliente.anchor = GridBagConstraints.EAST;
		gbc_lblDireccionAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccionAltaCliente.gridx = 1;
		gbc_lblDireccionAltaCliente.gridy = 7;
		panelAltaClienteBtn.add(lblDireccionAltaCliente, gbc_lblDireccionAltaCliente);
		
		txtDireccionAltaCliente = new JTextField();
		txtDireccionAltaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtDireccionAltaCliente = new GridBagConstraints();
		gbc_txtDireccionAltaCliente.gridwidth = 3;
		gbc_txtDireccionAltaCliente.insets = new Insets(0, 0, 5, 10);
		gbc_txtNombreAltaCliente.insets = new Insets(0, 0, 5, 10);
		gbc_txtDireccionAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccionAltaCliente.gridx = 3;
		gbc_txtDireccionAltaCliente.gridy = 7;
		panelAltaClienteBtn.add(txtDireccionAltaCliente, gbc_txtDireccionAltaCliente);
		txtDireccionAltaCliente.setColumns(10);
		
		JLabel dummy4 = new JLabel(" ");
		dummy4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_dummy4 = new GridBagConstraints();
		gbc_dummy4.insets = new Insets(0, 0, 0, 5);
		gbc_dummy4.gridx = 3;
		gbc_dummy4.gridy = 8;
		panelAltaClienteBtn.add(dummy4, gbc_dummy4);
		
		JPanel panelConsultaCliente = new JPanel();
		contentPane.add(panelConsultaCliente, "name_109307298174363");
		panelConsultaCliente.setLayout(new BorderLayout(0, 10));
		
		JLabel lblConsultaCliente = new JLabel("Consultar cliente");
		lblConsultaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelConsultaCliente.add(lblConsultaCliente, BorderLayout.NORTH);
		
		Panel panelConsultaClienteBtn = new Panel();
		panelConsultaCliente.add(panelConsultaClienteBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaClienteBtn = new GridBagLayout();
		gbl_panelConsultaClienteBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaClienteBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelConsultaClienteBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelConsultaClienteBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelConsultaClienteBtn.setLayout(gbl_panelConsultaClienteBtn);
		
		JLabel lblDNIConsultaCliente = new JLabel("DNI:");
		lblDNIConsultaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDNIConsultaCliente = new GridBagConstraints();
		gbc_lblDNIConsultaCliente.anchor = GridBagConstraints.EAST;
		gbc_lblDNIConsultaCliente.insets = new Insets(0, 10, 5, 5);
		gbc_lblDNIConsultaCliente.gridx = 1;
		gbc_lblDNIConsultaCliente.gridy = 1;
		panelConsultaClienteBtn.add(lblDNIConsultaCliente, gbc_lblDNIConsultaCliente);
		
		txtDNIConsultaCliente = new JTextField();
		txtDNIConsultaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtDNIConsultaCliente = new GridBagConstraints();
		gbc_txtDNIConsultaCliente.insets = new Insets(0, 0, 5, 10);
		gbc_txtDNIConsultaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNIConsultaCliente.gridx = 3;
		gbc_txtDNIConsultaCliente.gridy = 1;
		panelConsultaClienteBtn.add(txtDNIConsultaCliente, gbc_txtDNIConsultaCliente);
		txtDNIConsultaCliente.setColumns(10);
		
		JButton btnConsultaClienteBuscar = new JButton("Buscar");
		btnConsultaClienteBuscar.setIcon(new ImageIcon(UI.class.getResource("/Vista/BuscarICO.PNG")));
		btnConsultaClienteBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnConsultaClienteBuscar = new GridBagConstraints();
		gbc_btnConsultaClienteBuscar.insets = new Insets(0, 0, 5, 10);
		gbc_btnConsultaClienteBuscar.gridx = 5;
		gbc_btnConsultaClienteBuscar.gridy = 1;
		panelConsultaClienteBtn.add(btnConsultaClienteBuscar, gbc_btnConsultaClienteBuscar);
		
		JLabel dummy5 = new JLabel(" ");
		GridBagConstraints gbc_dummy5 = new GridBagConstraints();
		gbc_dummy5.insets = new Insets(0, 0, 5, 0);
		gbc_dummy5.gridx = 5;
		gbc_dummy5.gridy = 2;
		panelConsultaClienteBtn.add(dummy5, gbc_dummy5);
		
		txtResultadoConsultaCliente = new JTextField();
		txtResultadoConsultaCliente.setEditable(false);
		GridBagConstraints gbc_txtResultadoConsultaCliente = new GridBagConstraints();
		gbc_txtResultadoConsultaCliente.gridwidth = 5;
		gbc_txtResultadoConsultaCliente.anchor = GridBagConstraints.NORTH;
		gbc_txtResultadoConsultaCliente.insets = new Insets(0, 10, 5, 10);
		gbc_txtResultadoConsultaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtResultadoConsultaCliente.gridx = 1;
		gbc_txtResultadoConsultaCliente.gridy = 3;
		panelConsultaClienteBtn.add(txtResultadoConsultaCliente, gbc_txtResultadoConsultaCliente);
		txtResultadoConsultaCliente.setColumns(10);
		
		JPanel panelAltaPedido = new JPanel();
		contentPane.add(panelAltaPedido, "name_109310969146127");
		panelAltaPedido.setLayout(new BorderLayout(0, 10));
		
		JLabel lblAltaPedido = new JLabel("Dar de alta pedido");
		lblAltaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaPedido.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelAltaPedido.add(lblAltaPedido, BorderLayout.NORTH);
		
		JPanel panelAltaPedidoBtn = new JPanel();
		panelAltaPedido.add(panelAltaPedidoBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaPedidoBtn = new GridBagLayout();
		gbl_panelAltaPedidoBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelAltaPedidoBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelAltaPedidoBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelAltaPedidoBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaPedidoBtn.setLayout(gbl_panelAltaPedidoBtn);
		
		JLabel lblIDAltaPedido = new JLabel("ID:");
		lblIDAltaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIDAltaPedido = new GridBagConstraints();
		gbc_lblIDAltaPedido.anchor = GridBagConstraints.EAST;
		gbc_lblIDAltaPedido.insets = new Insets(0, 10, 5, 5);
		gbc_lblIDAltaPedido.gridx = 1;
		gbc_lblIDAltaPedido.gridy = 1;
		panelAltaPedidoBtn.add(lblIDAltaPedido, gbc_lblIDAltaPedido);
		
		txtIDAltaPedido = new JTextField();
		txtIDAltaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtIDAltaPedido = new GridBagConstraints();
		gbc_txtIDAltaPedido.gridwidth = 3;
		gbc_txtIDAltaPedido.insets = new Insets(0, 0, 5, 10);
		gbc_txtIDAltaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDAltaPedido.gridx = 3;
		gbc_txtIDAltaPedido.gridy = 1;
		panelAltaPedidoBtn.add(txtIDAltaPedido, gbc_txtIDAltaPedido);
		txtIDAltaPedido.setColumns(10);
		
		JLabel dummy7 = new JLabel(" ");
		GridBagConstraints gbc_dummy7 = new GridBagConstraints();
		gbc_dummy7.insets = new Insets(0, 0, 5, 5);
		gbc_dummy7.gridx = 3;
		gbc_dummy7.gridy = 2;
		panelAltaPedidoBtn.add(dummy7, gbc_dummy7);
		
		JLabel lblClienteAltaPedido = new JLabel("Cliente:");
		lblClienteAltaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblClienteAltaPedido = new GridBagConstraints();
		gbc_lblClienteAltaPedido.anchor = GridBagConstraints.EAST;
		gbc_lblClienteAltaPedido.insets = new Insets(0, 10, 5, 5);
		gbc_lblClienteAltaPedido.gridx = 1;
		gbc_lblClienteAltaPedido.gridy = 3;
		panelAltaPedidoBtn.add(lblClienteAltaPedido, gbc_lblClienteAltaPedido);
		
		JComboBox comboBoxClienteAltaPedido = new JComboBox();
		comboBoxClienteAltaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBoxClienteAltaPedido = new GridBagConstraints();
		gbc_comboBoxClienteAltaPedido.insets = new Insets(0, 0, 5, 10);
		gbc_comboBoxClienteAltaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxClienteAltaPedido.gridx = 3;
		gbc_comboBoxClienteAltaPedido.gridy = 3;
		panelAltaPedidoBtn.add(comboBoxClienteAltaPedido, gbc_comboBoxClienteAltaPedido);
		
		JButton btnAltaPedidoConfirmar = new JButton("Confirmar");
		btnAltaPedidoConfirmar.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConfirmarICO.PNG")));
		btnAltaPedidoConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAltaPedidoConfirmar = new GridBagConstraints();
		gbc_btnAltaPedidoConfirmar.insets = new Insets(0, 0, 5, 10);
		gbc_btnAltaPedidoConfirmar.gridx = 5;
		gbc_btnAltaPedidoConfirmar.gridy = 3;
		panelAltaPedidoBtn.add(btnAltaPedidoConfirmar, gbc_btnAltaPedidoConfirmar);
		
		JLabel dummy8 = new JLabel(" ");
		GridBagConstraints gbc_dummy8 = new GridBagConstraints();
		gbc_dummy8.insets = new Insets(0, 0, 0, 5);
		gbc_dummy8.gridx = 3;
		gbc_dummy8.gridy = 4;
		panelAltaPedidoBtn.add(dummy8, gbc_dummy8);
		
		JPanel panelConsultaPedido = new JPanel();
		contentPane.add(panelConsultaPedido, "name_109313289553643");
		panelConsultaPedido.setLayout(new BorderLayout(0, 10));
		
		JLabel lblConsultaPedido = new JLabel("Consultar pedido");
		lblConsultaPedido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConsultaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultaPedido.add(lblConsultaPedido, BorderLayout.NORTH);
		
		Panel panelConsultaPedidoBtn = new Panel();
		panelConsultaPedido.add(panelConsultaPedidoBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaPedidoBtn = new GridBagLayout();
		gbl_panelConsultaPedidoBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaPedidoBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaPedidoBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelConsultaPedidoBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelConsultaPedidoBtn.setLayout(gbl_panelConsultaPedidoBtn);
		
		JLabel lblIDConsultaPedido = new JLabel("ID:");
		lblIDConsultaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIDConsultaPedido = new GridBagConstraints();
		gbc_lblIDConsultaPedido.anchor = GridBagConstraints.EAST;
		gbc_lblIDConsultaPedido.insets = new Insets(0, 10, 5, 5);
		gbc_lblIDConsultaPedido.gridx = 1;
		gbc_lblIDConsultaPedido.gridy = 1;
		panelConsultaPedidoBtn.add(lblIDConsultaPedido, gbc_lblIDConsultaPedido);
		
		txtIDConsultaPedido = new JTextField();
		txtIDConsultaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtIDConsultaPedido = new GridBagConstraints();
		gbc_txtIDConsultaPedido.insets = new Insets(0, 0, 5, 10);
		gbc_txtIDConsultaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDConsultaPedido.gridx = 3;
		gbc_txtIDConsultaPedido.gridy = 1;
		panelConsultaPedidoBtn.add(txtIDConsultaPedido, gbc_txtIDConsultaPedido);
		txtIDConsultaPedido.setColumns(10);
		
		JButton btnConsultaPedidoBuscar = new JButton("Buscar");
		btnConsultaPedidoBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultaPedidoBuscar.setIcon(new ImageIcon(UI.class.getResource("/Vista/BuscarICO.PNG")));
		GridBagConstraints gbc_btnConsultaPedidoBuscar = new GridBagConstraints();
		gbc_btnConsultaPedidoBuscar.insets = new Insets(0, 0, 5, 10);
		gbc_btnConsultaPedidoBuscar.gridx = 5;
		gbc_btnConsultaPedidoBuscar.gridy = 1;
		panelConsultaPedidoBtn.add(btnConsultaPedidoBuscar, gbc_btnConsultaPedidoBuscar);
		
		JLabel dummy9 = new JLabel(" ");
		GridBagConstraints gbc_dummy9 = new GridBagConstraints();
		gbc_dummy9.insets = new Insets(0, 0, 5, 5);
		gbc_dummy9.gridx = 3;
		gbc_dummy9.gridy = 2;
		panelConsultaPedidoBtn.add(dummy9, gbc_dummy9);
		
		txtResultadoConsultaPedido = new JTextField();
		txtResultadoConsultaPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResultadoConsultaPedido.setEditable(false);
		GridBagConstraints gbc_txtResultadoConsultaPedido = new GridBagConstraints();
		gbc_txtResultadoConsultaPedido.gridwidth = 5;
		gbc_txtResultadoConsultaPedido.insets = new Insets(0, 10, 5, 10);
		gbc_txtResultadoConsultaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtResultadoConsultaPedido.gridx = 1;
		gbc_txtResultadoConsultaPedido.gridy = 3;
		panelConsultaPedidoBtn.add(txtResultadoConsultaPedido, gbc_txtResultadoConsultaPedido);
		txtResultadoConsultaPedido.setColumns(10);
		
		JPanel panelAltaArticulo = new JPanel();
		contentPane.add(panelAltaArticulo, "name_109314960534486");
		panelAltaArticulo.setLayout(new BorderLayout(0, 10));
		
		JLabel lblAltaArticulo = new JLabel("Dar de alta art\u00EDculo");
		lblAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaArticulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelAltaArticulo.add(lblAltaArticulo, BorderLayout.NORTH);
		
		Panel panelAltaArticuloBtn = new Panel();
		panelAltaArticulo.add(panelAltaArticuloBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaArticuloBtn = new GridBagLayout();
		gbl_panelAltaArticuloBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelAltaArticuloBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelAltaArticuloBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelAltaArticuloBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaArticuloBtn.setLayout(gbl_panelAltaArticuloBtn);
		
		JLabel lblIDAltaArticulo = new JLabel("ID:");
		lblIDAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIDAltaArticulo = new GridBagConstraints();
		gbc_lblIDAltaArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblIDAltaArticulo.insets = new Insets(0, 10, 5, 5);
		gbc_lblIDAltaArticulo.gridx = 1;
		gbc_lblIDAltaArticulo.gridy = 1;
		panelAltaArticuloBtn.add(lblIDAltaArticulo, gbc_lblIDAltaArticulo);
		
		txtIDAltaArticulo = new JTextField();
		txtIDAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtIDAltaArticulo = new GridBagConstraints();
		gbc_txtIDAltaArticulo.gridwidth = 3;
		gbc_txtIDAltaArticulo.insets = new Insets(0, 0, 5, 10);
		gbc_txtIDAltaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDAltaArticulo.gridx = 3;
		gbc_txtIDAltaArticulo.gridy = 1;
		panelAltaArticuloBtn.add(txtIDAltaArticulo, gbc_txtIDAltaArticulo);
		txtIDAltaArticulo.setColumns(10);
		
		JLabel dummy12 = new JLabel(" ");
		GridBagConstraints gbc_dummy12 = new GridBagConstraints();
		gbc_dummy12.insets = new Insets(0, 0, 5, 5);
		gbc_dummy12.gridx = 3;
		gbc_dummy12.gridy = 2;
		panelAltaArticuloBtn.add(dummy12, gbc_dummy12);
		
		JLabel lblClienteAltaArticulo = new JLabel("Cliente:");
		lblClienteAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblClienteAltaArticulo = new GridBagConstraints();
		gbc_lblClienteAltaArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblClienteAltaArticulo.insets = new Insets(0, 10, 5, 5);
		gbc_lblClienteAltaArticulo.gridx = 1;
		gbc_lblClienteAltaArticulo.gridy = 3;
		panelAltaArticuloBtn.add(lblClienteAltaArticulo, gbc_lblClienteAltaArticulo);
		
		JComboBox comboBoxAltaArticulo = new JComboBox();
		comboBoxAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBoxAltaArticulo = new GridBagConstraints();
		gbc_comboBoxAltaArticulo.insets = new Insets(0, 0, 5, 10);
		gbc_comboBoxAltaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAltaArticulo.gridx = 3;
		gbc_comboBoxAltaArticulo.gridy = 3;
		panelAltaArticuloBtn.add(comboBoxAltaArticulo, gbc_comboBoxAltaArticulo);
		
		JButton btnAltaArticuloConfirmar = new JButton("Confirmar");
		btnAltaArticuloConfirmar.setIcon(new ImageIcon(UI.class.getResource("/Vista/ConfirmarICO.PNG")));
		btnAltaArticuloConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAltaArticuloConfirmar = new GridBagConstraints();
		gbc_btnAltaArticuloConfirmar.insets = new Insets(0, 0, 5, 10);
		gbc_btnAltaArticuloConfirmar.gridx = 5;
		gbc_btnAltaArticuloConfirmar.gridy = 3;
		panelAltaArticuloBtn.add(btnAltaArticuloConfirmar, gbc_btnAltaArticuloConfirmar);
		
		JLabel dummy13 = new JLabel(" ");
		GridBagConstraints gbc_dummy13 = new GridBagConstraints();
		gbc_dummy13.insets = new Insets(0, 0, 0, 5);
		gbc_dummy13.gridx = 3;
		gbc_dummy13.gridy = 4;
		panelAltaArticuloBtn.add(dummy13, gbc_dummy13);
		
		JPanel panelConsultaArticulo = new JPanel();
		contentPane.add(panelConsultaArticulo, "name_109316913587523");
		panelConsultaArticulo.setLayout(new BorderLayout(0, 10));
		
		JLabel lblConsultaArtculo = new JLabel("Consultar art\u00EDculo");
		lblConsultaArtculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConsultaArtculo.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultaArticulo.add(lblConsultaArtculo, BorderLayout.NORTH);
		
		JPanel panelConsultaArticuloBtn = new JPanel();
		panelConsultaArticulo.add(panelConsultaArticuloBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaArticuloBtn = new GridBagLayout();
		gbl_panelConsultaArticuloBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaArticuloBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaArticuloBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelConsultaArticuloBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelConsultaArticuloBtn.setLayout(gbl_panelConsultaArticuloBtn);
		
		JLabel lblIDConsultaArticulo = new JLabel("ID:");
		lblIDConsultaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIDConsultaArticulo = new GridBagConstraints();
		gbc_lblIDConsultaArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblIDConsultaArticulo.insets = new Insets(0, 10, 5, 5);
		gbc_lblIDConsultaArticulo.gridx = 1;
		gbc_lblIDConsultaArticulo.gridy = 1;
		panelConsultaArticuloBtn.add(lblIDConsultaArticulo, gbc_lblIDConsultaArticulo);
		
		txtIDConsultaArticulo = new JTextField();
		txtIDConsultaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtIDConsultaArticulo = new GridBagConstraints();
		gbc_txtIDConsultaArticulo.insets = new Insets(0, 0, 5, 10);
		gbc_txtIDConsultaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDConsultaArticulo.gridx = 3;
		gbc_txtIDConsultaArticulo.gridy = 1;
		panelConsultaArticuloBtn.add(txtIDConsultaArticulo, gbc_txtIDConsultaArticulo);
		txtIDConsultaArticulo.setColumns(10);
		
		JButton btnConsultaArticuloBuscar = new JButton("Buscar");
		btnConsultaArticuloBuscar.setIcon(new ImageIcon(UI.class.getResource("/Vista/BuscarICO.PNG")));
		btnConsultaArticuloBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnConsultaArticuloBuscar = new GridBagConstraints();
		gbc_btnConsultaArticuloBuscar.insets = new Insets(0, 0, 5, 10);
		gbc_btnConsultaArticuloBuscar.gridx = 5;
		gbc_btnConsultaArticuloBuscar.gridy = 1;
		panelConsultaArticuloBtn.add(btnConsultaArticuloBuscar, gbc_btnConsultaArticuloBuscar);
		
		JLabel dummy14 = new JLabel(" ");
		GridBagConstraints gbc_dummy14 = new GridBagConstraints();
		gbc_dummy14.insets = new Insets(0, 0, 5, 5);
		gbc_dummy14.gridx = 3;
		gbc_dummy14.gridy = 2;
		panelConsultaArticuloBtn.add(dummy14, gbc_dummy14);
		
		txtResultadoConsultaArticulo = new JTextField();
		txtResultadoConsultaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResultadoConsultaArticulo.setEditable(false);
		GridBagConstraints gbc_txtResultadoConsultaArticulo = new GridBagConstraints();
		gbc_txtResultadoConsultaArticulo.gridwidth = 5;
		gbc_txtResultadoConsultaArticulo.insets = new Insets(0, 10, 5, 10);
		gbc_txtResultadoConsultaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtResultadoConsultaArticulo.gridx = 1;
		gbc_txtResultadoConsultaArticulo.gridy = 3;
		panelConsultaArticuloBtn.add(txtResultadoConsultaArticulo, gbc_txtResultadoConsultaArticulo);
		txtResultadoConsultaArticulo.setColumns(10);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
