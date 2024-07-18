package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrador de Suministros");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(140, 38, 323, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pedir Suministro");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(88, 222, 245));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(188, 160, 226, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIngresarComoEncargado = new JButton("Ingresar como Encargado");
		btnIngresarComoEncargado.setForeground(new Color(1, 166, 194));
		btnIngresarComoEncargado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngresarComoEncargado.setBackground(new Color(177, 239, 250));
		btnIngresarComoEncargado.setBounds(188, 253, 226, 61);
		frame.getContentPane().add(btnIngresarComoEncargado);
	}
}
