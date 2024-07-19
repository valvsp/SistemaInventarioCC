package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class RegistrarLote {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		lblRegistrarLote.setBounds(136, 28, 323, 61);
		frame.getContentPane().add(lblRegistrarLote);
		
		textField = new JTextField();
		textField.setBounds(136, 109, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 109, 96, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(363, 109, 75, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(55, 163, 117, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 163, 140, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(352, 163, 96, 19);
		frame.getContentPane().add(textField_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Perecedero");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(456, 162, 96, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(136, 86, 58, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContenido.setBounds(252, 86, 75, 13);
		frame.getContentPane().add(lblContenido);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(363, 86, 58, 13);
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
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProveedor.setBounds(352, 143, 75, 13);
		frame.getContentPane().add(lblProveedor);
		
		JButton BotonRegistrar = new JButton("Registrar");
		BotonRegistrar.setForeground(Color.WHITE);
		BotonRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonRegistrar.setBackground(new Color(88, 222, 245));
		BotonRegistrar.setBounds(185, 217, 226, 61);
		frame.getContentPane().add(BotonRegistrar);
		
		JButton BotonDescartar = new JButton("Descartar");
		BotonDescartar.setForeground(new Color(1, 166, 194));
		BotonDescartar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonDescartar.setBackground(new Color(177, 239, 250));
		BotonDescartar.setBounds(185, 288, 226, 61);
		frame.getContentPane().add(BotonDescartar);
	}
}
