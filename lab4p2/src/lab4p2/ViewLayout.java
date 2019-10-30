package lab4p2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewLayout {
	//attributes
	public  JFrame window;
	public  JPanel panel;
	public  JButton btn;
	public  JLabel  plus;
	public  JTextField varx;
	public  JTextField vary;
	public  JTextField totSum;
	
	public ViewLayout() {
		//textfields
		varx= new JTextField(20);
		varx.setEditable(true);
		vary=new JTextField(20);
		vary.setEditable(true);
		totSum=new JTextField(20);
		totSum.setEditable(false);
		
		//button
		btn= new JButton("=");
		
		//label
		plus= new JLabel("+");
		
		//panel
		panel= new JPanel(new GridLayout(5,0,5,5));
		panel.setBackground(Color.CYAN);
		panel.add(varx);
		panel.add(plus);
		panel.add(vary);
		panel.add(btn);
		panel.add(totSum);
		
		//window
		window=new JFrame("Sumation App");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.pack();
		window.setVisible(true);
		
	}

}
