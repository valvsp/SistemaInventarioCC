package com.inventario.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class main {

	private JFrame frame;
	static AdminInven VentanaAdminInven = new AdminInven();
	static PedirSuministro VentanaPedirSuministro = new PedirSuministro();
	private final Action action = new SwingAction();

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
		frame.setBounds(100, 100, 610, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrador de Suministros");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(136, 25, 323, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JButton BotonPedir = new JButton("Pedir Suministro");
		BotonPedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedirSuministro.main(null);
			}
		});
		BotonPedir.setForeground(new Color(255, 255, 255));
		BotonPedir.setBackground(new Color(88, 222, 245));
		BotonPedir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonPedir.setBounds(188, 160, 226, 61);
		frame.getContentPane().add(BotonPedir);
		
		JButton BotonEncargado = new JButton("Ingresar como Encargado");
		BotonEncargado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaAdminInven.main(null);
			
			}
			
		});
		BotonEncargado.setForeground(new Color(1, 166, 194));
		BotonEncargado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BotonEncargado.setBackground(new Color(177, 239, 250));
		BotonEncargado.setBounds(188, 253, 226, 61);
		frame.getContentPane().add(BotonEncargado);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
