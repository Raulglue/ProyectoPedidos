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

public class UI extends JFrame {
	private JPanel contentPane;

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
		
		JMenu mnMen = new JMenu("Men\u00FA");
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
		
		JMenuItem mntmArticulo = new JMenuItem("Articulo");
		mntmArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contentPane.getLayout()).show(contentPane, "name_107059198950418");
			}
		});
		mnMen.add(mntmArticulo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, "name_106975984728795");
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelPrincipal = new JLabel("Panel Principal");
		lblPanelPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblPanelPrincipal, BorderLayout.CENTER);
		
		JPanel panelCliente = new JPanel();
		contentPane.add(panelCliente, "name_107006593452389");
		panelCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelCliente = new JLabel("Panel Cliente");
		lblPanelCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panelCliente.add(lblPanelCliente, BorderLayout.CENTER);
		
		JPanel panelPedido = new JPanel();
		contentPane.add(panelPedido, "name_107034967661443");
		panelPedido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelPedido = new JLabel("Panel Pedido");
		lblPanelPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panelPedido.add(lblPanelPedido, BorderLayout.CENTER);
		
		JPanel panelArticulo = new JPanel();
		contentPane.add(panelArticulo, "name_107059198950418");
		panelArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPanelArticulo = new JLabel("Panel Articulo");
		lblPanelArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		panelArticulo.add(lblPanelArticulo, BorderLayout.CENTER);
		
		JPanel panelAltaCliente = new JPanel();
		contentPane.add(panelAltaCliente, "name_109289332868835");
		panelAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JPanel panelConsultaCliente = new JPanel();
		contentPane.add(panelConsultaCliente, "name_109307298174363");
		panelConsultaCliente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_109309136607506");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAltaPedido = new JPanel();
		contentPane.add(panelAltaPedido, "name_109310969146127");
		panelAltaPedido.setLayout(new BorderLayout(0, 0));
		
		JPanel panelConsultaPedido = new JPanel();
		contentPane.add(panelConsultaPedido, "name_109313289553643");
		panelConsultaPedido.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAltaArticulo = new JPanel();
		contentPane.add(panelAltaArticulo, "name_109314960534486");
		panelAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JPanel panelConsultaArticulo = new JPanel();
		contentPane.add(panelConsultaArticulo, "name_109316913587523");
		panelConsultaArticulo.setLayout(new BorderLayout(0, 0));
	}

}
