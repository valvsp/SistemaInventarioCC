package com.inventario.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reporte {

	private JFrame frame;
	private JTextField FechaInicioField;
	private JTextField FechaFinalField;
	static JRadioButton IngresoRadioBoton = new JRadioButton("Ingreso");
	static 	JRadioButton PedidosRadioBoton = new JRadioButton("Pedidos");
	static JRadioButton VencidosRadioBoton = new JRadioButton("Vencidos");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte window = new Reporte();
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
	public Reporte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblReporte = new JLabel("Reporte");
		lblReporte.setHorizontalAlignment(SwingConstants.CENTER);
		lblReporte.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblReporte.setBounds(136, 27, 323, 61);
		frame.getContentPane().add(lblReporte);
		
		JLabel lblNewLabel = new JLabel("Fecha de inicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 93, 104, 13);
		frame.getContentPane().add(lblNewLabel);
		
		FechaInicioField = new JTextField();
		FechaInicioField.setBounds(10, 110, 129, 19);
		frame.getContentPane().add(FechaInicioField);
		FechaInicioField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha Final");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 151, 104, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		FechaFinalField = new JTextField();
		FechaFinalField.setBounds(10, 168, 129, 19);
		frame.getContentPane().add(FechaFinalField);
		FechaFinalField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de reporte");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 227, 129, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		IngresoRadioBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedidosRadioBoton.setSelected(false);
				VencidosRadioBoton.setSelected(false);
			}
		});
		IngresoRadioBoton.setBounds(10, 246, 103, 21);
		frame.getContentPane().add(IngresoRadioBoton);
		
		PedidosRadioBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoRadioBoton.setSelected(false);
				VencidosRadioBoton.setSelected(false);
			}
		});
		
	
		PedidosRadioBoton.setBounds(10, 269, 103, 21);
		frame.getContentPane().add(PedidosRadioBoton);
		
		VencidosRadioBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedidosRadioBoton.setSelected(false);
				IngresoRadioBoton.setSelected(false);
			}
		});
		
		
		VencidosRadioBoton.setBounds(10, 290, 103, 21);
		frame.getContentPane().add(VencidosRadioBoton);
		
		
		
		
		JButton botonCrearReporte = new JButton("Crear Reporte");
		botonCrearReporte.setForeground(Color.WHITE);
		botonCrearReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		botonCrearReporte.setBackground(new Color(88, 222, 245));
		botonCrearReporte.setBounds(278, 149, 226, 61);
		frame.getContentPane().add(botonCrearReporte);
	}
}