package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TipoProveedor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoProveedor window = new TipoProveedor();
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
	public TipoProveedor() {
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
		lblProveedores.setBounds(136, 29, 323, 61);
		frame.getContentPane().add(lblProveedores);
		
		JButton btnProveedorRegular = new JButton("Proveedor Regular");
		btnProveedorRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarLote.main(null);
			}
		});
		btnProveedorRegular.setForeground(Color.WHITE);
		btnProveedorRegular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProveedorRegular.setBackground(new Color(88, 222, 245));
		btnProveedorRegular.setBounds(31, 171, 246, 72);
		frame.getContentPane().add(btnProveedorRegular);
		
		JButton btnNuevoProveedor = new JButton("Nuevo Proveedor");
		btnNuevoProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proveedor.main(null);
			}
		});
		btnNuevoProveedor.setForeground(new Color(1, 166, 194));
		btnNuevoProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevoProveedor.setBackground(new Color(177, 239, 250));
		btnNuevoProveedor.setBounds(320, 171, 246, 72);
		frame.getContentPane().add(btnNuevoProveedor);
	}

}
