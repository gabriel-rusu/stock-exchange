package engine;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.*;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class GUI implements ActionListener, Runnable{

	private JFrame frmFinancialAnalysis;
	String tara;
	String luni;
	JComboBox<String> comboBox_1;
	JComboBox<String> comboBox_2;
	JPanel panel;
	JLabel grafic;
	


	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if(action.equals("Plot")) {
			update(Utils.loadChart(comboBox_1.getSelectedItem().toString(), comboBox_2.getSelectedItem().toString()));
		}




		// if (action.equals("Plot")) {
		// 	if (comboBox_1.getSelectedItem().toString().equals("Italy")
		// 			&& comboBox_2.getSelectedItem().toString().equals("1 month")) {
		// 		update(Utils.loadImageIcon("charts/ity1m.jpg"));
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Italy")
		// 			&& comboBox_2.getSelectedItem().toString().equals("3 months")) {
		// 		update(Utils.loadImageIcon("charts/ity3m.jpg"));
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Italy")
		// 			&& comboBox_2.getSelectedItem().toString().equals("6 months")) {
		// 		update("charts/ity6m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Italy")
		// 			&& comboBox_2.getSelectedItem().toString().equals("9 months")) {
		// 		update("charts/ity9m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Italy")
		// 			&& comboBox_2.getSelectedItem().toString().equals("12 months")) {
		// 		update("charts/ity12m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Germany")
		// 			&& comboBox_2.getSelectedItem().toString().equals("1 month")) {
		// 		update("charts/ger1m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Germany")
		// 			&& comboBox_2.getSelectedItem().toString().equals("3 months")) {
		// 		update("charts/ger3m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Germany")
		// 			&& comboBox_2.getSelectedItem().toString().equals("6 months")) {
		// 		update("charts/ger6m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Germany")
		// 			&& comboBox_2.getSelectedItem().toString().equals("9 months")) {
		// 		update("charts/ger9m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("Germany")
		// 			&& comboBox_2.getSelectedItem().toString().equals("12 months")) {
		// 		update("charts/ger12m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("France")
		// 			&& comboBox_2.getSelectedItem().toString().equals("1 month")) {
		// 		update("charts/fra1m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("France")
		// 			&& comboBox_2.getSelectedItem().toString().equals("3 months")) {
		// 		update("charts/fra3m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("France")
		// 			&& comboBox_2.getSelectedItem().toString().equals("6 months")) {
		// 		update("charts/fra6m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("France")
		// 			&& comboBox_2.getSelectedItem().toString().equals("9 months")) {
		// 		update("charts/fra9m.jpg");
		// 	} else if (comboBox_1.getSelectedItem().toString().equals("France")
		// 			&& comboBox_2.getSelectedItem().toString().equals("12 months")) {
		// 		update("charts/fra12m.jpg");
		// 	}
		 if (action.equals("Compare all") && comboBox_2.getSelectedItem().toString().equals("1 month")) {
			update("charts/all1m.jpg");
		} else if (action.equals("Compare all") && comboBox_2.getSelectedItem().toString().equals("3 months")) {
			update("charts/all3m.jpg");
		} else if (action.equals("Compare all") && comboBox_2.getSelectedItem().toString().equals("6 months")) {
			update("charts/all6m.jpg");
		} else if (action.equals("Compare all") && comboBox_2.getSelectedItem().toString().equals("12 months")) {
			update("charts/all12m.jpg");
		}

	}

	@Override
	public void run() {
		
	}

	public void update(ImageIcon icon) {
		grafic.setIcon(icon);
		grafic.validate();
		panel.validate();
	}

	public void update(String FileName) {
		grafic.setIcon(new ImageIcon(FileName));
		grafic.validate();
		panel.validate();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FinTech entery = new FinTech();
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFinancialAnalysis = new JFrame();
		frmFinancialAnalysis.setTitle("Financial Analysis");
		frmFinancialAnalysis.setBounds(100, 100, 999, 594);
		frmFinancialAnalysis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFinancialAnalysis.getContentPane().setLayout(null);
		frmFinancialAnalysis.setVisible(true);
		frmFinancialAnalysis.setLocationRelativeTo(null);
		frmFinancialAnalysis.setResizable(false);
		JLabel lblIndustry = new JLabel("Industry");
		lblIndustry.setFont(new Font("Garamond", Font.PLAIN, 20));
		lblIndustry.setBounds(44, 229, 100, 22);
		frmFinancialAnalysis.getContentPane().add(lblIndustry);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Automobile" }));
		comboBox.setFont(new Font("Garamond", Font.PLAIN, 18));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(44, 264, 115, 22);
		frmFinancialAnalysis.getContentPane().add(comboBox);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(273, 13, 700, 525);
		frmFinancialAnalysis.getContentPane().add(panel);
		grafic = new JLabel(new ImageIcon("Resources/fra1m.jpg"));
		panel.add(grafic);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Garamond", Font.PLAIN, 20));
		lblCountry.setBounds(44, 299, 78, 22);
		frmFinancialAnalysis.getContentPane().add(lblCountry);

		comboBox_1 = new JComboBox<>();
		comboBox_1.setFont(new Font("Garamond", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] { "France", "Germany", "Italy" }));
		comboBox_1.setBounds(44, 334, 115, 22);
		frmFinancialAnalysis.getContentPane().add(comboBox_1);
		comboBox_1.getSelectedItem().toString();

		JLabel lblOverWhatPeriod = new JLabel("Over what period of time");
		lblOverWhatPeriod.setFont(new Font("Garamond", Font.PLAIN, 20));
		lblOverWhatPeriod.setBounds(44, 369, 217, 22);
		frmFinancialAnalysis.getContentPane().add(lblOverWhatPeriod);

		comboBox_2 = new JComboBox<>();
		comboBox_2.setFont(new Font("Garamond", Font.PLAIN, 18));
		comboBox_2.setModel(new DefaultComboBoxModel<>(new String[] { "1 month", "3 months", "6 months", "12 months" }));
		comboBox_2.setBounds(44, 404, 115, 22);
		frmFinancialAnalysis.getContentPane().add(comboBox_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 13, 207, 203);
		frmFinancialAnalysis.getContentPane().add(panel_1);
		JLabel logo = new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("images/logo.png").getPath()));
		panel_1.add(logo);

		JButton btnNewButton = new JButton("Plot");
		btnNewButton.setFont(new Font("Garamond", Font.PLAIN, 18));
		btnNewButton.setBounds(44, 509, 88, 29);
		frmFinancialAnalysis.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);

		JButton btnNewButton_1 = new JButton("Compare all");
		btnNewButton_1.setFont(new Font("Garamond", Font.PLAIN, 18));
		btnNewButton_1.setBounds(144, 509, 117, 29);
		frmFinancialAnalysis.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
	}
}
