package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proveedor {

	private JFrame frame;
	private JTextField RifField;
	private JTextField NombreField;
	private JTextField EmailField;
	private JTextField TlfField;
	private JTextField UbiField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proveedor window = new Proveedor();
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
	public Proveedor() {
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
		
		JLabel lblProveedores = new JLabel("Proveedores");
		lblProveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedores.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblProveedores.setBounds(136, 26, 323, 61);
		frame.getContentPane().add(lblProveedores);
		
		JLabel lblNewLabel = new JLabel("RIF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(115, 114, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		RifField = new JTextField();
		RifField.setBounds(115, 130, 63, 19);
		frame.getContentPane().add(RifField);
		RifField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(245, 114, 63, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		NombreField = new JTextField();
		NombreField.setBounds(245, 130, 96, 19);
		frame.getContentPane().add(NombreField);
		NombreField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(390, 114, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		EmailField = new JTextField();
		EmailField.setColumns(10);
		EmailField.setBounds(390, 130, 96, 19);
		frame.getContentPane().add(EmailField);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(194, 172, 63, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		TlfField = new JTextField();
		TlfField.setColumns(10);
		TlfField.setBounds(194, 186, 96, 19);
		frame.getContentPane().add(TlfField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ubicacion");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(315, 172, 63, 13);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		UbiField = new JTextField();
		UbiField.setColumns(10);
		UbiField.setBounds(315, 186, 114, 19);
		frame.getContentPane().add(UbiField);
		
		JButton btnRegistrarProveedor = new JButton(" Registrar Proveedor");
		btnRegistrarProveedor.setForeground(Color.WHITE);
		btnRegistrarProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarProveedor.setBackground(new Color(88, 222, 245));
		btnRegistrarProveedor.setBounds(204, 215, 226, 61);
		frame.getContentPane().add(btnRegistrarProveedor);
		
		JButton BotonDescartar = new JButton("Descartar");
		BotonDescartar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RifField.setText(null);
				NombreField.setText(null);
				EmailField.setText(null);
				TlfField.setText(null);
				UbiField.setText(null);
			}
		});
		BotonDescartar.setForeground(new Color(1, 166, 194));
		BotonDescartar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonDescartar.setBackground(new Color(177, 239, 250));
		BotonDescartar.setBounds(203, 286, 226, 61);
		frame.getContentPane().add(BotonDescartar);
	}
}
