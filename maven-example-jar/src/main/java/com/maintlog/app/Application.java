package com.maintlog.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Application {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Brand:");
		lblNewLabel.setBounds(17, 29, 39, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(56, 24, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(122, 98, 88, 29);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(311, 98, 88, 29);
		frame.getContentPane().add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel("Brand:");
		lblNewLabel_1.setBounds(198, 29, 39, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(237, 24, 130, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Brand:");
		lblNewLabel_2.setBounds(379, 29, 39, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(418, 24, 65, 26);
		frame.getContentPane().add(textField_2);
		
	}
}
