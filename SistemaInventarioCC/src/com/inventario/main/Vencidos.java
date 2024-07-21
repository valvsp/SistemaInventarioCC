package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;

public class Vencidos {

	private JFrame frame;
	private JTable tableVencidos;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vencidos window = new Vencidos();
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
	public Vencidos() {
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
		
		JLabel lblInventario = new JLabel("Vencidos");
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblInventario.setBounds(136, 23, 323, 61);
		frame.getContentPane().add(lblInventario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 75, 517, 187);
		frame.getContentPane().add(scrollPane);
		
		tableVencidos = new JTable();
		model = new DefaultTableModel();
		tableVencidos.setModel(model);
		
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Lote");
		model.addColumn("Caducacion");
		model.addColumn("Dias caducado");
		
		scrollPane.setViewportView(tableVencidos);
		
		JButton BotonEliminar = new JButton("Eliminar Vencidos");
		BotonEliminar.setForeground(Color.WHITE);
		BotonEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonEliminar.setBackground(new Color(88, 222, 245));
		BotonEliminar.setBounds(185, 284, 226, 61);
		frame.getContentPane().add(BotonEliminar);
	}

}
