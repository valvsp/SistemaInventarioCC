package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarLote {

	private JFrame frame;
	private JTextField CantidadField;
	private JTextField ContenidoField;
	private JTextField IdLoteField;
	private JTextField IngresoField;
	private JTextField CaducidadField;
	private JTextField ProveedorField;
	private JTable TablaCategoria;
	private DefaultTableModel modelCategoria;
	private JTextField IdContenidoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarLote window = new RegistrarLote();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrarLote() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 410);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistrarLote = new JLabel("Registrar Lote");
		lblRegistrarLote.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarLote.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblRegistrarLote.setBounds(136, 10, 323, 61);
		frame.getContentPane().add(lblRegistrarLote);
		
		CantidadField = new JTextField();
		CantidadField.setBounds(194, 109, 80, 19);
		frame.getContentPane().add(CantidadField);
		CantidadField.setColumns(10);
		
		ContenidoField = new JTextField();
		ContenidoField.setColumns(10);
		ContenidoField.setBounds(284, 109, 96, 19);
		frame.getContentPane().add(ContenidoField);
		
		IdLoteField = new JTextField();
		IdLoteField.setColumns(10);
		IdLoteField.setBounds(390, 109, 58, 19);
		frame.getContentPane().add(IdLoteField);
		
		IngresoField = new JTextField();
		IngresoField.setColumns(10);
		IngresoField.setBounds(55, 163, 117, 19);
		frame.getContentPane().add(IngresoField);
		
		CaducidadField = new JTextField();
		CaducidadField.setColumns(10);
		CaducidadField.setBounds(202, 163, 140, 19);
		frame.getContentPane().add(CaducidadField);
		
		ProveedorField = new JTextField();
		ProveedorField.setColumns(10);
		ProveedorField.setBounds(352, 163, 96, 19);
		frame.getContentPane().add(ProveedorField);
		
		JCheckBox PerecederoCheck = new JCheckBox("Perecedero");
		PerecederoCheck.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PerecederoCheck.setBounds(456, 162, 96, 21);
		frame.getContentPane().add(PerecederoCheck);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(194, 86, 58, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContenido.setBounds(289, 86, 75, 13);
		frame.getContentPane().add(lblContenido);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(390, 86, 35, 13);
		frame.getContentPane().add(lblId);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de Ingreso");
		lblFechaDeIngreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaDeIngreso.setBounds(55, 138, 122, 13);
		frame.getContentPane().add(lblFechaDeIngreso);
		
		JLabel lblNewLabel_1 = new JLabel("(AAAA/MM/DD)");
		lblNewLabel_1.setBounds(55, 150, 87, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFechaDeCaducidad = new JLabel("Fecha de Caducidad");
		lblFechaDeCaducidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaDeCaducidad.setBounds(202, 138, 126, 13);
		frame.getContentPane().add(lblFechaDeCaducidad);
		
		JLabel lblNewLabel_1_1 = new JLabel("(AAAA/MM/DD)");
		lblNewLabel_1_1.setBounds(202, 150, 87, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblProveedor = new JLabel("RIF Proveedor");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProveedor.setBounds(352, 143, 96, 13);
		frame.getContentPane().add(lblProveedor);
		
		JButton BotonRegistrar = new JButton("Registrar");
		BotonRegistrar.setForeground(Color.WHITE);
		BotonRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonRegistrar.setBackground(new Color(88, 222, 245));
		BotonRegistrar.setBounds(185, 217, 226, 61);
		frame.getContentPane().add(BotonRegistrar);
		
		JButton BotonDescartar = new JButton("Descartar");
		BotonDescartar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CantidadField.setText(null);
				ContenidoField.setText(null);
				IdLoteField.setText(null);
				IdContenidoField.setText(null);
				IngresoField.setText(null);
				CaducidadField.setText(null);
				ProveedorField.setText(null);
				PerecederoCheck.setSelected(false);
			}
		});
		BotonDescartar.setForeground(new Color(1, 166, 194));
		BotonDescartar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonDescartar.setBackground(new Color(177, 239, 250));
		BotonDescartar.setBounds(185, 288, 226, 61);
		frame.getContentPane().add(BotonDescartar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 67, 152, 61);
		frame.getContentPane().add(scrollPane_1);
		
		TablaCategoria = new JTable();
		TablaCategoria = new JTable();
		modelCategoria = new DefaultTableModel();
		TablaCategoria.setModel(modelCategoria);
		
		modelCategoria.addColumn("Categoria");
	
		scrollPane_1.setViewportView(TablaCategoria);
		scrollPane_1.setViewportView(TablaCategoria);
		
		IdContenidoField = new JTextField();
		IdContenidoField.setColumns(10);
		IdContenidoField.setBounds(458, 109, 58, 19);
		frame.getContentPane().add(IdContenidoField);
		
		JLabel lblIdDelContenido = new JLabel("ID del Contenido");
		lblIdDelContenido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdDelContenido.setBounds(456, 88, 117, 13);
		frame.getContentPane().add(lblIdDelContenido);
	}
}
