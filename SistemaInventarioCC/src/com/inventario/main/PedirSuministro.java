package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
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
	private JTextField DepartamentoField;
	private JTable table;

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
		
		DepartamentoField = new JTextField();
		DepartamentoField.setBounds(419, 103, 115, 19);
		frame.getContentPane().add(DepartamentoField);
		DepartamentoField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(296, 87, 65, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Departamento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(419, 85, 96, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
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
		
		JRadioButton RadioBotonConsumibles = new JRadioButton("Consumibles");
		RadioBotonConsumibles.setBounds(6, 103, 103, 20);
		frame.getContentPane().add(RadioBotonConsumibles);
		
		JRadioButton RadioBotonPapeleria = new JRadioButton("Papeleria");
		RadioBotonPapeleria.setBounds(111, 102, 94, 21);
		frame.getContentPane().add(RadioBotonPapeleria);
		
		JRadioButton RadioBotonElectronicos = new JRadioButton("Electronicos");
		RadioBotonElectronicos.setBounds(6, 126, 103, 21);
		frame.getContentPane().add(RadioBotonElectronicos);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoria.setBounds(69, 82, 76, 19);
		frame.getContentPane().add(lblCategoria);
	}
}
