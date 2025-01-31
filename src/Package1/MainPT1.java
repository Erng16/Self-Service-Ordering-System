package Package1;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class MainPT1 extends JPanel {
	private JLabel o;
	JTextField n;
	public MainPT1(){
	setBackground(Color.WHITE);
	setLayout(null);
	

	o = new JLabel("Order Name:");
	o.setBounds(10,32,120,20);
	o.setFont(new Font("Tahoma",Font.PLAIN,16));

	n = new JTextField(30);
	n.setFont(new Font("Tahoma",Font.PLAIN,15));
	n.setBounds(110, 32, 140, 20);
	n.addActionListener(null);
	
	
	
	
	

	add(o);
	add(n);
	
	
	}

}
