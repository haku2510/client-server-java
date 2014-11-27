package code03;

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
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,200);	
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		//Panel 1
		panel1.setLayout(new MigLayout());
		panel1.setBorder(BorderFactory.createTitledBorder("Company"));
		panel1.add(new JLabel("Joe Bloggs Hardware"),"center, wrap");
		panel1.add(new JLabel("Shop Street,"),"center, wrap");
		panel1.add(new JLabel("Galway"),"center, wrap");
		panel1.add(new JLabel("091 - 123456"),"center, wrap");
	
		
		
		//Panel 2
		panel2.setLayout(new MigLayout());
		panel2.setBorder(BorderFactory.createTitledBorder("Customer Details"));
		JLabel firstnameLabel = new JLabel("First Name: ");
		JLabel surnameLabel = new JLabel("Surname: ");
		JLabel addressLabel = new JLabel("Address:");
		JLabel detailsLabel = new JLabel("Invoice:");
		
		JTextField firstname = new JTextField(20);
		JTextField surname = new JTextField(20);
		JTextField address = new JTextField(20);
		JTextArea detailsArea = new JTextArea(10,20); //y x
		detailsArea.setBorder(BorderFactory.createEtchedBorder());
		
		//
		panel2.add(firstnameLabel, "left, sg 1, split");	//Align left, ????, split cell
		panel2.add(firstname, "pushx, growx, wrap");		//????, can grow, finish row
		
		panel2.add(surnameLabel, "left, sg 1, split");
		panel2.add(surname, "pushx, growx, wrap");
		
		
		panel2.add(addressLabel, "left, sg 1, split");
		panel2.add(address, "pushx, growx, wrap");
		
		panel2.add(detailsLabel,"left, wrap");
		panel2.add(detailsArea, "span2, push, grow, wrap");
		
		//Panel 3
		panel3.setLayout(new MigLayout());
		panel3.setBorder(BorderFactory.createTitledBorder("Purchases"));
		JLabel BoughtShitLabel = new JLabel("Items");
		JTextField shitBought = new JTextField(5);
		
		panel3.add(BoughtShitLabel,"left, split");
		panel3.add(shitBought,"wrap");
		
		
		
		frame.add(panel1, BorderLayout.WEST);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.EAST);
		frame.setSize(700,500);
		frame.setVisible(true);
		
		
	}

}
