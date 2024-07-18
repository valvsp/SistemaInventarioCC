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

public class AdminInven {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminInven window = new AdminInven();
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
	public AdminInven() {
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
		
		JLabel lblAdministradorDeInventario = new JLabel("Administrador de Inventario");
		lblAdministradorDeInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministradorDeInventario.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblAdministradorDeInventario.setBounds(131, 37, 323, 61);
		frame.getContentPane().add(lblAdministradorDeInventario);
		
		JButton BotonInventario = new JButton("Inventario");
		BotonInventario.setForeground(Color.WHITE);
		BotonInventario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonInventario.setBackground(new Color(88, 222, 245));
		BotonInventario.setBounds(38, 146, 226, 61);
		frame.getContentPane().add(BotonInventario);
		
		JButton BotonVencidos = new JButton("Verificar Vencidos");
		BotonVencidos.setForeground(Color.WHITE);
		BotonVencidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonVencidos.setBackground(new Color(88, 222, 245));
		BotonVencidos.setBounds(320, 146, 226, 61);
		frame.getContentPane().add(BotonVencidos);
		
		JButton BotonLote = new JButton("RegistrarLote");
		BotonLote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonLote.setForeground(Color.WHITE);
		BotonLote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonLote.setBackground(new Color(88, 222, 245));
		BotonLote.setBounds(38, 250, 226, 61);
		frame.getContentPane().add(BotonLote);
		
		JButton BotonReporte = new JButton("Crear Reporte");
		BotonReporte.setForeground(Color.WHITE);
		BotonReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonReporte.setBackground(new Color(88, 222, 245));
		BotonReporte.setBounds(320, 250, 226, 61);
		frame.getContentPane().add(BotonReporte);
	}

}
