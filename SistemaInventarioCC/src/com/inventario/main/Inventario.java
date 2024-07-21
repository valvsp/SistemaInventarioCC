package com.inventario.main;

import java.util.ArrayList;
import java.util.Scanner;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Inventario {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario window = new Inventario();
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
	public Inventario() {
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
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblInventario.setBounds(136, 22, 323, 61);
		frame.getContentPane().add(lblInventario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 576, 215);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Categoria");
		model.addColumn("Lote");
		model.addColumn("Ingreso");
		model.addColumn("Caducidad");
		model.addColumn("Descripcion");
		model.addColumn("Cantidad");
		model.addColumn("Proveedor");
		
		scrollPane.setViewportView(table);
	}
}
