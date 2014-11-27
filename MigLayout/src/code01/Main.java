package code01;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MigLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,200);		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("GUI"));
		frame.add(panel);
		
		panel.setLayout(new MigLayout("debug", "[][]", "[] [] []")); //number of columns and rows
		
		JLabel firstnameLabel = new JLabel("First Name: ");
		JLabel surnameLabel = new JLabel("Surname: ");
		JLabel addressLabel = new JLabel("Address:");
		JLabel detailsLabel = new JLabel("Details:");
		JLabel companyLabel = new JLabel("Joe Bloggs");
		JLabel companyAddressLabel = new JLabel("Main st.");
		JLabel companyCityLabel = new JLabel("Galway");
		JLabel companyTelLabel = new JLabel("091 123456");
		
		JTextField firstname = new JTextField(20);
		JTextField surname = new JTextField(20);
		JTextField address = new JTextField(20);
		JTextArea detailsArea = new JTextArea(10,20); //y x
		detailsArea.setBorder(BorderFactory.createEtchedBorder());
		
		panel.add(companyLabel, "center");
		//
		panel.add(firstnameLabel, "left, sg 1, split");	//Align left, ????, split cell
		panel.add(firstname, "pushx, growx, wrap");		//????, can grow, finish row
		
		panel.add(surnameLabel, "left, sg 1, split");
		panel.add(surname, "pushx, growx, wrap");
		
		
		panel.add(addressLabel, "left, sg 1, split");
		panel.add(address, "pushx, growx, wrap");
		
		panel.add(detailsLabel,"left, wrap");
		panel.add(detailsArea, "span2, push, grow, wrap");
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(700,500);
		//frame.pack();
		frame.setVisible(true);
	}

}
