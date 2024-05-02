package com.maintlog.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Application {

	private JFrame frame;
	private JTextField txtPartReplaced;
	private JTextField txtMiles;
	private JTextField txtDate;
	private JTextField txtPartReplaced_1;

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
		frame.setBounds(100, 100, 504, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPartReplaced = new JTextField();
		txtPartReplaced.setText("Part replaced ");
		txtPartReplaced.setBounds(41, 26, 102, 26);
		frame.getContentPane().add(txtPartReplaced);
		txtPartReplaced.setColumns(10);
		
		txtMiles = new JTextField();
		txtMiles.setText("Miles");
		txtMiles.setColumns(10);
		txtMiles.setBounds(213, 26, 49, 26);
		frame.getContentPane().add(txtMiles);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		txtDate.setColumns(10);
		txtDate.setBounds(340, 26, 49, 26);
		frame.getContentPane().add(txtDate);
		
		txtPartReplaced_1 = new JTextField();
		txtPartReplaced_1.setText("part replaced");
		txtPartReplaced_1.setBounds(24, 64, 130, 26);
		frame.getContentPane().add(txtPartReplaced_1);
		txtPartReplaced_1.setColumns(10);
		
		JComboBox partsList = new JComboBox();
		partsList.setBounds(65, 102, 52, 27);
		
		frame.getContentPane().add(partsList);
		
	}
}
