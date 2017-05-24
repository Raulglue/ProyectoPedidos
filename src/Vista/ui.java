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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(UI.class.getResource("/Vista/HomeICO.png")));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_106975984728795");
			}
		});
		btnHome.setBackground(Color.GRAY);
		btnHome.setForeground(Color.BLACK);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		menuBar.add(btnHome);
		
		JMenu mnMen = new JMenu("Men\u00FA");
		mnMen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnMen);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_107006593452389");
			}
		});
		mnMen.add(mntmCliente);
		
		JMenuItem mntmPedido = new JMenuItem("Pedido");
		mntmPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_107034967661443");
			}
		});
		mnMen.add(mntmPedido);
		
		JMenuItem mntmArticulo = new JMenuItem("Art\u00EDculo");
		mntmArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_107059198950418");
			}
		});
		mnMen.add(mntmArticulo);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmClienteAlta = new JMenuItem("Alta");
		mntmClienteAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109289332868835");
			}
		});
		mnCliente.add(mntmClienteAlta);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109307298174363");
			}
		});
		mnCliente.add(mntmConsulta);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenuItem mntmPedidoAlta = new JMenuItem("Alta");
		mntmPedidoAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109310969146127");
			}
		});
		mnPedido.add(mntmPedidoAlta);
		
		JMenuItem mntmPedidoConsulta = new JMenuItem("Consulta");
		mntmPedidoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109313289553643");
			}
		});
		mnPedido.add(mntmPedidoConsulta);
		
		JMenu mnArticulo = new JMenu("Art\u00EDculo");
		menuBar.add(mnArticulo);
		
		JMenuItem mntmArticuloAlta = new JMenuItem("Alta");
		mntmArticuloAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109314960534486");
			}
		});
		mnArticulo.add(mntmArticuloAlta);
		
		JMenuItem mntmArticuloConsulta = new JMenuItem("Consulta");
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
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelPrincipal = new JLabel("Panel de control");
		lblPanelPrincipal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPanelPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblPanelPrincipal, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 1;
		gbc_lblCliente.gridy = 1;
		panel.add(lblCliente, gbc_lblCliente);
		
		JButton btnDarDeAlta = new JButton("Dar de alta cliente");
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
		
		JLabel lblPedido = new JLabel("Pedido");
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedido.gridx = 1;
		gbc_lblPedido.gridy = 3;
		panel.add(lblPedido, gbc_lblPedido);
		
		JButton btnAltaCliente = new JButton("Dar de alta pedido");
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
		
		JLabel lblArticulo = new JLabel("Articulo");
		GridBagConstraints gbc_lblArticulo = new GridBagConstraints();
		gbc_lblArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_lblArticulo.gridx = 1;
		gbc_lblArticulo.gridy = 5;
		panel.add(lblArticulo, gbc_lblArticulo);
		
		JButton btnAltaArticulo = new JButton("Dar de alta articulo");
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
		btnConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_109316913587523");
			}
		});
		GridBagConstraints gbc_btnConsultaArticulo = new GridBagConstraints();
		gbc_btnConsultaArticulo.gridx = 5;
		gbc_btnConsultaArticulo.gridy = 5;
		panel.add(btnConsultaArticulo, gbc_btnConsultaArticulo);
		
		JPanel panelCliente = new JPanel();
		contentPane.add(panelCliente, "name_107006593452389");
		panelCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelCliente = new JLabel("Panel Cliente");
		lblPanelCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panelCliente.add(lblPanelCliente, BorderLayout.NORTH);
		
		JPanel panelClienteBtn = new JPanel();
		panelCliente.add(panelClienteBtn, BorderLayout.CENTER);
		
		JButton btnPanelAltaCliente = new JButton("Dar de alta cliente");
		
		JButton btnPanelConsultaCliente = new JButton("Consultar cliente");
		FlowLayout fl_panelClienteBtn = new FlowLayout(FlowLayout.CENTER, 150, 45);
		panelClienteBtn.setLayout(fl_panelClienteBtn);
		panelClienteBtn.add(btnPanelAltaCliente);
		panelClienteBtn.add(btnPanelConsultaCliente);
		
		JPanel panelPedido = new JPanel();
		contentPane.add(panelPedido, "name_107034967661443");
		panelPedido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelPedido = new JLabel("Panel Pedido");
		lblPanelPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panelPedido.add(lblPanelPedido, BorderLayout.NORTH);
		
		JPanel panelPedidoBtn = new JPanel();
		FlowLayout fl_panelPedidoBtn = (FlowLayout) panelPedidoBtn.getLayout();
		fl_panelPedidoBtn.setVgap(45);
		fl_panelPedidoBtn.setHgap(150);
		panelPedido.add(panelPedidoBtn, BorderLayout.CENTER);
		
		JButton btnPanelAltaPedido = new JButton("Dar de alta pedido");
		panelPedidoBtn.add(btnPanelAltaPedido);
		
		JButton btnPanelConsultaPedido = new JButton("Consultar pedido");
		panelPedidoBtn.add(btnPanelConsultaPedido);
		
		JPanel panelArticulo = new JPanel();
		contentPane.add(panelArticulo, "name_107059198950418");
		panelArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelArticulo = new JLabel("Panel Articulo");
		lblPanelArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelArticulo.add(lblPanelArticulo, BorderLayout.NORTH);
		
		JPanel panelArticuloBtn = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelArticuloBtn.getLayout();
		flowLayout.setVgap(45);
		flowLayout.setHgap(150);
		panelArticulo.add(panelArticuloBtn, BorderLayout.CENTER);
		
		JButton btnPanelAltaArticulo = new JButton("Dar de alta art\u00EDculo");
		panelArticuloBtn.add(btnPanelAltaArticulo);
		
		JButton btnPanelConsultarArticulo = new JButton("Consultar Art\u00EDculo");
		panelArticuloBtn.add(btnPanelConsultarArticulo);
		
		JPanel panelAltaCliente = new JPanel();
		contentPane.add(panelAltaCliente, "name_109289332868835");
		panelAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAltaCliente = new JLabel("Dar de alta cliente");
		lblAltaCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAltaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panelAltaCliente.add(lblAltaCliente, BorderLayout.NORTH);
		
		JPanel panelAltaClienteBtn = new JPanel();
		panelAltaCliente.add(panelAltaClienteBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaClienteBtn = new GridBagLayout();
		gbl_panelAltaClienteBtn.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelAltaClienteBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelAltaClienteBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelAltaClienteBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaClienteBtn.setLayout(gbl_panelAltaClienteBtn);
		
		JLabel lblDatosCliente = new JLabel("Datos del cliente:");
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 1;
		gbc_lblDatosCliente.gridy = 1;
		panelAltaClienteBtn.add(lblDatosCliente, gbc_lblDatosCliente);
		
		JLabel lblDNIAltaCliente = new JLabel("DNI:");
		GridBagConstraints gbc_lblDNIAltaCliente = new GridBagConstraints();
		gbc_lblDNIAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNIAltaCliente.gridx = 1;
		gbc_lblDNIAltaCliente.gridy = 3;
		panelAltaClienteBtn.add(lblDNIAltaCliente, gbc_lblDNIAltaCliente);
		
		txtDNIAltaCliente = new JTextField();
		GridBagConstraints gbc_txtDNIAltaCliente = new GridBagConstraints();
		gbc_txtDNIAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtDNIAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNIAltaCliente.gridx = 3;
		gbc_txtDNIAltaCliente.gridy = 3;
		panelAltaClienteBtn.add(txtDNIAltaCliente, gbc_txtDNIAltaCliente);
		txtDNIAltaCliente.setColumns(10);
		
		JLabel lblNombreAltaCliente = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreAltaCliente = new GridBagConstraints();
		gbc_lblNombreAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreAltaCliente.gridx = 1;
		gbc_lblNombreAltaCliente.gridy = 5;
		panelAltaClienteBtn.add(lblNombreAltaCliente, gbc_lblNombreAltaCliente);
		
		txtNombreAltaCliente = new JTextField();
		GridBagConstraints gbc_txtNombreAltaCliente = new GridBagConstraints();
		gbc_txtNombreAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreAltaCliente.gridx = 3;
		gbc_txtNombreAltaCliente.gridy = 5;
		panelAltaClienteBtn.add(txtNombreAltaCliente, gbc_txtNombreAltaCliente);
		txtNombreAltaCliente.setColumns(10);
		
		JLabel lblDireccionAltaCliente = new JLabel("Direcci\u00F3n:");
		GridBagConstraints gbc_lblDireccionAltaCliente = new GridBagConstraints();
		gbc_lblDireccionAltaCliente.insets = new Insets(0, 0, 0, 5);
		gbc_lblDireccionAltaCliente.gridx = 1;
		gbc_lblDireccionAltaCliente.gridy = 7;
		panelAltaClienteBtn.add(lblDireccionAltaCliente, gbc_lblDireccionAltaCliente);
		
		txtDireccionAltaCliente = new JTextField();
		GridBagConstraints gbc_txtDireccionAltaCliente = new GridBagConstraints();
		gbc_txtDireccionAltaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccionAltaCliente.gridx = 3;
		gbc_txtDireccionAltaCliente.gridy = 7;
		panelAltaClienteBtn.add(txtDireccionAltaCliente, gbc_txtDireccionAltaCliente);
		txtDireccionAltaCliente.setColumns(10);
		
		JPanel panelConsultaCliente = new JPanel();
		contentPane.add(panelConsultaCliente, "name_109307298174363");
		panelConsultaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsultaCliente = new JLabel("Consultar cliente");
		lblConsultaCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelConsultaCliente.add(lblConsultaCliente, BorderLayout.NORTH);
		
		Panel panelConsultaClienteBtn = new Panel();
		panelConsultaCliente.add(panelConsultaClienteBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaClienteBtn = new GridBagLayout();
		gbl_panelConsultaClienteBtn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaClienteBtn.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelConsultaClienteBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelConsultaClienteBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelConsultaClienteBtn.setLayout(gbl_panelConsultaClienteBtn);
		
		JLabel lblDNIConsultaCliente = new JLabel("DNI:");
		GridBagConstraints gbc_lblDNIConsultaCliente = new GridBagConstraints();
		gbc_lblDNIConsultaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNIConsultaCliente.gridx = 1;
		gbc_lblDNIConsultaCliente.gridy = 1;
		panelConsultaClienteBtn.add(lblDNIConsultaCliente, gbc_lblDNIConsultaCliente);
		
		txtDNIConsultaCliente = new JTextField();
		GridBagConstraints gbc_txtDNIConsultaCliente = new GridBagConstraints();
		gbc_txtDNIConsultaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtDNIConsultaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNIConsultaCliente.gridx = 3;
		gbc_txtDNIConsultaCliente.gridy = 1;
		panelConsultaClienteBtn.add(txtDNIConsultaCliente, gbc_txtDNIConsultaCliente);
		txtDNIConsultaCliente.setColumns(10);
		
		JButton btnConsultaClienteBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnConsultaClienteBuscar = new GridBagConstraints();
		gbc_btnConsultaClienteBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultaClienteBuscar.gridx = 5;
		gbc_btnConsultaClienteBuscar.gridy = 1;
		panelConsultaClienteBtn.add(btnConsultaClienteBuscar, gbc_btnConsultaClienteBuscar);
		
		JScrollPane scrollPaneConsultaCliente = new JScrollPane();
		GridBagConstraints gbc_scrollPaneConsultaCliente = new GridBagConstraints();
		gbc_scrollPaneConsultaCliente.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPaneConsultaCliente.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneConsultaCliente.gridx = 3;
		gbc_scrollPaneConsultaCliente.gridy = 3;
		panelConsultaClienteBtn.add(scrollPaneConsultaCliente, gbc_scrollPaneConsultaCliente);
		
		JTextPane textPaneConsultaCliente = new JTextPane();
		scrollPaneConsultaCliente.setViewportView(textPaneConsultaCliente);
		
		JPanel panelAltaPedido = new JPanel();
		contentPane.add(panelAltaPedido, "name_109310969146127");
		panelAltaPedido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAltaPedido = new JLabel("Dar de alta pedido");
		lblAltaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaPedido.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelAltaPedido.add(lblAltaPedido, BorderLayout.NORTH);
		
		JPanel panelAltaPedidoBtn = new JPanel();
		panelAltaPedido.add(panelAltaPedidoBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaPedidoBtn = new GridBagLayout();
		gbl_panelAltaPedidoBtn.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelAltaPedidoBtn.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelAltaPedidoBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelAltaPedidoBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaPedidoBtn.setLayout(gbl_panelAltaPedidoBtn);
		
		JLabel lblIDAltaPedido = new JLabel("ID:");
		GridBagConstraints gbc_lblIDAltaPedido = new GridBagConstraints();
		gbc_lblIDAltaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDAltaPedido.gridx = 1;
		gbc_lblIDAltaPedido.gridy = 1;
		panelAltaPedidoBtn.add(lblIDAltaPedido, gbc_lblIDAltaPedido);
		
		txtIDAltaPedido = new JTextField();
		GridBagConstraints gbc_txtIDAltaPedido = new GridBagConstraints();
		gbc_txtIDAltaPedido.insets = new Insets(0, 0, 5, 0);
		gbc_txtIDAltaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDAltaPedido.gridx = 3;
		gbc_txtIDAltaPedido.gridy = 1;
		panelAltaPedidoBtn.add(txtIDAltaPedido, gbc_txtIDAltaPedido);
		txtIDAltaPedido.setColumns(10);
		
		JLabel lblClienteAltaPedido = new JLabel("Cliente:");
		GridBagConstraints gbc_lblClienteAltaPedido = new GridBagConstraints();
		gbc_lblClienteAltaPedido.insets = new Insets(0, 0, 0, 5);
		gbc_lblClienteAltaPedido.gridx = 1;
		gbc_lblClienteAltaPedido.gridy = 3;
		panelAltaPedidoBtn.add(lblClienteAltaPedido, gbc_lblClienteAltaPedido);
		
		JComboBox comboBoxClienteAltaPedido = new JComboBox();
		GridBagConstraints gbc_comboBoxClienteAltaPedido = new GridBagConstraints();
		gbc_comboBoxClienteAltaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxClienteAltaPedido.gridx = 3;
		gbc_comboBoxClienteAltaPedido.gridy = 3;
		panelAltaPedidoBtn.add(comboBoxClienteAltaPedido, gbc_comboBoxClienteAltaPedido);
		
		JPanel panelConsultaPedido = new JPanel();
		contentPane.add(panelConsultaPedido, "name_109313289553643");
		panelConsultaPedido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsultaPedido = new JLabel("Consultar pedido");
		lblConsultaPedido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsultaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultaPedido.add(lblConsultaPedido, BorderLayout.NORTH);
		
		Panel panelConsultaPedidoBtn = new Panel();
		panelConsultaPedido.add(panelConsultaPedidoBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaPedidoBtn = new GridBagLayout();
		gbl_panelConsultaPedidoBtn.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelConsultaPedidoBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaPedidoBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelConsultaPedidoBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelConsultaPedidoBtn.setLayout(gbl_panelConsultaPedidoBtn);
		
		JLabel lblIDConsultaPedido = new JLabel("ID:");
		GridBagConstraints gbc_lblIDConsultaPedido = new GridBagConstraints();
		gbc_lblIDConsultaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDConsultaPedido.gridx = 1;
		gbc_lblIDConsultaPedido.gridy = 1;
		panelConsultaPedidoBtn.add(lblIDConsultaPedido, gbc_lblIDConsultaPedido);
		
		txtIDConsultaPedido = new JTextField();
		GridBagConstraints gbc_txtIDConsultaPedido = new GridBagConstraints();
		gbc_txtIDConsultaPedido.insets = new Insets(0, 0, 5, 0);
		gbc_txtIDConsultaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDConsultaPedido.gridx = 3;
		gbc_txtIDConsultaPedido.gridy = 1;
		panelConsultaPedidoBtn.add(txtIDConsultaPedido, gbc_txtIDConsultaPedido);
		txtIDConsultaPedido.setColumns(10);
		
		JLabel lblClienteConsultaPedido = new JLabel("Cliente:");
		GridBagConstraints gbc_lblClienteConsultaPedido = new GridBagConstraints();
		gbc_lblClienteConsultaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblClienteConsultaPedido.gridx = 1;
		gbc_lblClienteConsultaPedido.gridy = 3;
		panelConsultaPedidoBtn.add(lblClienteConsultaPedido, gbc_lblClienteConsultaPedido);
		
		JComboBox comboBoxConsultaCliente = new JComboBox();
		GridBagConstraints gbc_comboBoxConsultaCliente = new GridBagConstraints();
		gbc_comboBoxConsultaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxConsultaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxConsultaCliente.gridx = 3;
		gbc_comboBoxConsultaCliente.gridy = 3;
		panelConsultaPedidoBtn.add(comboBoxConsultaCliente, gbc_comboBoxConsultaCliente);
		
		JScrollPane scrollPaneConsultaPedido = new JScrollPane();
		GridBagConstraints gbc_scrollPaneConsultaPedido = new GridBagConstraints();
		gbc_scrollPaneConsultaPedido.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneConsultaPedido.gridx = 3;
		gbc_scrollPaneConsultaPedido.gridy = 5;
		panelConsultaPedidoBtn.add(scrollPaneConsultaPedido, gbc_scrollPaneConsultaPedido);
		
		JTextPane textPaneConsultaPedido = new JTextPane();
		scrollPaneConsultaPedido.setViewportView(textPaneConsultaPedido);
		
		JPanel panelAltaArticulo = new JPanel();
		contentPane.add(panelAltaArticulo, "name_109314960534486");
		panelAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAltaArticulo = new JLabel("Dar de alta art\u00EDculo");
		lblAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaArticulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelAltaArticulo.add(lblAltaArticulo, BorderLayout.NORTH);
		
		Panel panelAltaArticuloBtn = new Panel();
		panelAltaArticulo.add(panelAltaArticuloBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelAltaArticuloBtn = new GridBagLayout();
		gbl_panelAltaArticuloBtn.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelAltaArticuloBtn.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelAltaArticuloBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelAltaArticuloBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelAltaArticuloBtn.setLayout(gbl_panelAltaArticuloBtn);
		
		JLabel lblIDAltaArticulo = new JLabel("ID:");
		GridBagConstraints gbc_lblIDAltaArticulo = new GridBagConstraints();
		gbc_lblIDAltaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDAltaArticulo.gridx = 1;
		gbc_lblIDAltaArticulo.gridy = 1;
		panelAltaArticuloBtn.add(lblIDAltaArticulo, gbc_lblIDAltaArticulo);
		
		txtIDAltaArticulo = new JTextField();
		GridBagConstraints gbc_txtIDAltaArticulo = new GridBagConstraints();
		gbc_txtIDAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_txtIDAltaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDAltaArticulo.gridx = 3;
		gbc_txtIDAltaArticulo.gridy = 1;
		panelAltaArticuloBtn.add(txtIDAltaArticulo, gbc_txtIDAltaArticulo);
		txtIDAltaArticulo.setColumns(10);
		
		JLabel lblClienteAltaArticulo = new JLabel("Cliente:");
		GridBagConstraints gbc_lblClienteAltaArticulo = new GridBagConstraints();
		gbc_lblClienteAltaArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_lblClienteAltaArticulo.gridx = 1;
		gbc_lblClienteAltaArticulo.gridy = 3;
		panelAltaArticuloBtn.add(lblClienteAltaArticulo, gbc_lblClienteAltaArticulo);
		
		JComboBox comboBoxAltaArticulo = new JComboBox();
		GridBagConstraints gbc_comboBoxAltaArticulo = new GridBagConstraints();
		gbc_comboBoxAltaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAltaArticulo.gridx = 3;
		gbc_comboBoxAltaArticulo.gridy = 3;
		panelAltaArticuloBtn.add(comboBoxAltaArticulo, gbc_comboBoxAltaArticulo);
		
		JPanel panelConsultaArticulo = new JPanel();
		contentPane.add(panelConsultaArticulo, "name_109316913587523");
		panelConsultaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsultaArtculo = new JLabel("Consultar art\u00EDculo");
		lblConsultaArtculo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsultaArtculo.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultaArticulo.add(lblConsultaArtculo, BorderLayout.NORTH);
		
		JPanel panelConsultaArticuloBtn = new JPanel();
		panelConsultaArticulo.add(panelConsultaArticuloBtn, BorderLayout.CENTER);
		GridBagLayout gbl_panelConsultaArticuloBtn = new GridBagLayout();
		gbl_panelConsultaArticuloBtn.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelConsultaArticuloBtn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelConsultaArticuloBtn.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelConsultaArticuloBtn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelConsultaArticuloBtn.setLayout(gbl_panelConsultaArticuloBtn);
		
		JLabel lblIDConsultaAticulo = new JLabel("ID:");
		GridBagConstraints gbc_lblIDConsultaAticulo = new GridBagConstraints();
		gbc_lblIDConsultaAticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDConsultaAticulo.gridx = 1;
		gbc_lblIDConsultaAticulo.gridy = 1;
		panelConsultaArticuloBtn.add(lblIDConsultaAticulo, gbc_lblIDConsultaAticulo);
		
		txtIDConsultaArticulo = new JTextField();
		GridBagConstraints gbc_txtIDConsultaArticulo = new GridBagConstraints();
		gbc_txtIDConsultaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_txtIDConsultaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIDConsultaArticulo.gridx = 3;
		gbc_txtIDConsultaArticulo.gridy = 1;
		panelConsultaArticuloBtn.add(txtIDConsultaArticulo, gbc_txtIDConsultaArticulo);
		txtIDConsultaArticulo.setColumns(10);
		
		JLabel lblClienteConsultaArticulo = new JLabel("Cliente:");
		GridBagConstraints gbc_lblClienteConsultaArticulo = new GridBagConstraints();
		gbc_lblClienteConsultaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblClienteConsultaArticulo.gridx = 1;
		gbc_lblClienteConsultaArticulo.gridy = 3;
		panelConsultaArticuloBtn.add(lblClienteConsultaArticulo, gbc_lblClienteConsultaArticulo);
		
		JComboBox comboBoxClienteConsultaArticulo = new JComboBox();
		GridBagConstraints gbc_comboBoxClienteConsultaArticulo = new GridBagConstraints();
		gbc_comboBoxClienteConsultaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxClienteConsultaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxClienteConsultaArticulo.gridx = 3;
		gbc_comboBoxClienteConsultaArticulo.gridy = 3;
		panelConsultaArticuloBtn.add(comboBoxClienteConsultaArticulo, gbc_comboBoxClienteConsultaArticulo);
		
		JScrollPane scrollPaneConultaArticulo = new JScrollPane();
		GridBagConstraints gbc_scrollPaneConultaArticulo = new GridBagConstraints();
		gbc_scrollPaneConultaArticulo.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneConultaArticulo.gridx = 3;
		gbc_scrollPaneConultaArticulo.gridy = 5;
		panelConsultaArticuloBtn.add(scrollPaneConultaArticulo, gbc_scrollPaneConultaArticulo);
		
		JTextPane textPaneConsultaArticulo = new JTextPane();
		scrollPaneConultaArticulo.setViewportView(textPaneConsultaArticulo);
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
