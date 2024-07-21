package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class PedirSuministro {

	private JFrame frame;
	private JTextField IdSuministroField;
	private JTextField CantidadSuministroField;
	private JTable table;
	private DefaultTableModel model;
	private DefaultTableModel modelCategoria;
	private DefaultTableModel modelCentroCosto;
	static main main = new main();
	private JTable TablaCategoria;
	private JTable TablaCentroCosto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedirSuministro window = new PedirSuministro();
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
	public PedirSuministro() {
		//main.CerrarVentana(); para cerrar la ventana anterior
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
		 
		JLabel lblPedir = new JLabel("Suministros");
		lblPedir.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedir.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblPedir.setBounds(136, 25, 323, 61);
		frame.getContentPane().add(lblPedir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 239, 517, 105);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("Lote");
		model.addColumn("Proveedor");
		model.addColumn("Unidades");
		
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(211, 87, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		IdSuministroField = new JTextField();
		IdSuministroField.setBounds(211, 103, 65, 19);
		frame.getContentPane().add(IdSuministroField);
		IdSuministroField.setColumns(10);
		
		CantidadSuministroField = new JTextField();
		CantidadSuministroField.setBounds(296, 103, 96, 19);
		frame.getContentPane().add(CantidadSuministroField);
		CantidadSuministroField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(296, 87, 65, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton botonAgregar = new JButton("Agregar");
		botonAgregar.setForeground(Color.WHITE);
		botonAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		botonAgregar.setBackground(new Color(88, 222, 245));
		botonAgregar.setBounds(60, 168, 226, 61);
		frame.getContentPane().add(botonAgregar);
		
		JButton botonOrdenar = new JButton("Ordenar");
		botonOrdenar.setForeground(Color.WHITE);
		botonOrdenar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		botonOrdenar.setBackground(new Color(80, 163, 254));
		botonOrdenar.setBounds(308, 168, 226, 61);
		frame.getContentPane().add(botonOrdenar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(43, 96, 152, 61);
		frame.getContentPane().add(scrollPane_1);
		
		TablaCategoria = new JTable();
		modelCategoria = new DefaultTableModel();
		TablaCategoria.setModel(modelCategoria);
		
		modelCategoria.addColumn("Categoria");
	
		scrollPane_1.setViewportView(TablaCategoria);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(402, 96, 152, 61);
		frame.getContentPane().add(scrollPane_1_1);
		
		TablaCentroCosto = new JTable();
		modelCentroCosto = new DefaultTableModel();
		TablaCentroCosto.setModel(modelCentroCosto);
		
		modelCentroCosto.addColumn("Departamentos");
	
		scrollPane_1_1.setViewportView(TablaCentroCosto);
	}
}
