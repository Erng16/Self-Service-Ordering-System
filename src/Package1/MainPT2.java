package Package1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import static java.lang.Math.sqrt;

public class MainPT2 extends MainPT1 implements ActionListener, ItemListener{
	JLabel c1;
	JLabel v;
	JLabel c2;
	JRadioButton il;
	JRadioButton it;
	JRadioButton cl;
	JRadioButton nd;
	ButtonGroup g1;
	JCheckBox lettuce;
	JCheckBox onion;
	JCheckBox pickles;
	JCheckBox tomato;
	JComboBox f;
	JButton confirm;
	JTextField Total;
	JLabel tt;
	JLabel baht;
	double subtotal1=0;
	double subtotal2=0;
	private double total=0;
	int counter;
	String drink;
	Graphics g;
	

	
	
	MainPT2(){
		
		setBackground(Color.WHITE);
		c1 = new JLabel("1.Choose your Main Dish");
		c1.setBounds(10, 65, 300, 20);
		c1.setFont(new Font("Tahoma",Font.BOLD,18));
		
		String[] menu = {"Select","Chicken Sandwich","Pork Burger","Beef Burger","Ham Sandwich"};
		f = new JComboBox(menu);
		f.setBounds(10, 100, 180, 22);
		f.setFont(new Font("Tahoma",Font.PLAIN,16));
		f.addItemListener(this);
		
		
		v = new JLabel("2.Choose your Vegetables:");
		v.setBounds(10, 140, 300, 20);
		v.setFont(new Font("Tahoma",Font.BOLD,18));
		
		lettuce = new JCheckBox("Lettuce");
		lettuce.setBounds(10, 165, 300, 20);
		lettuce.setFont(new Font("Tahoma",Font.PLAIN,16));
		lettuce.setBackground(Color.WHITE);

		
		onion = new JCheckBox("Onion");
		onion.setBounds(10, 205, 300, 20);
		onion.setFont(new Font("Tahoma",Font.PLAIN,16));
		onion.setBackground(Color.WHITE);
	
		
		pickles = new JCheckBox("Pickles");
		pickles.setBounds(10, 245, 300, 20);
		pickles.setFont(new Font("Tahoma",Font.PLAIN,16));
		pickles.setBackground(Color.WHITE);
		
		
		tomato = new JCheckBox("Tomato");
		tomato.setBounds(10, 285, 300, 20);
		tomato.setFont(new Font("Tahoma",Font.PLAIN,16));
		tomato.setBackground(Color.WHITE);
	

		c2 = new JLabel("3.Choose 1 Drink");
		c2.setBounds(10, 340, 300, 20);
		c2.setFont(new Font("Tahoma",Font.BOLD,18));
		
		il = new JRadioButton("Iced Latte");
		il.setBounds(10, 380, 300, 20);
		il.setFont(new Font("Tahoma",Font.PLAIN,16));
		il.setBackground(Color.WHITE);
		il.addActionListener(this);
		
		it = new JRadioButton("Iced Tea");
		it.setBounds(10, 420, 300, 20);
		it.setFont(new Font("Tahoma",Font.PLAIN,16));
		it.setBackground(Color.WHITE);
		it.addActionListener(this);
		
		cl = new JRadioButton("Cola");
		cl.setBounds(10, 460, 300, 20);
		cl.setFont(new Font("Tahoma",Font.PLAIN,16));
		cl.setBackground(Color.WHITE);
		cl.addActionListener(this);
		
		nd = new JRadioButton("No drink");
		nd.setBounds(10, 500, 300, 20);
		nd.setFont(new Font("Tahoma",Font.PLAIN,16));
		nd.setBackground(Color.WHITE);
		nd.addActionListener(this);
		
		confirm = new JButton("Confirm");
		confirm.setBounds(670, 680, 120, 30);
		confirm.setFont(new Font("Tahoma",Font.PLAIN,15));
		confirm.addActionListener(this);
		
		
		
		Total = new JTextField(10);
		Total.setEditable(false);
		Total.setBounds(700, 550, 70, 20);
		Total.setFont(new Font("Tahoma",Font.PLAIN,18));
		Total.setHorizontalAlignment(JTextField.RIGHT);
		
		tt = new JLabel("Total:");
		tt.setFont(new Font("Tahoma",Font.PLAIN,18));
		tt.setBounds(650, 550, 70, 20);
		baht = new JLabel("฿");
		baht.setFont(new Font("Tahoma",Font.PLAIN,18));
		baht.setBounds(780, 550, 70, 20);
		
	
		
		
		lettuce.setFocusable(false);
		onion.setFocusable(false);
		pickles.setFocusable(false);
		tomato.setFocusable(false);
		it.setFocusable(false);
		il.setFocusable(false);
		cl.setFocusable(false);
		nd.setFocusable(false);
		
		
		g1 = new ButtonGroup();
		g1.add(il);
		g1.add(it);
		g1.add(cl);
		g1.add(nd);
		
		
		
		add(c1);
		add(v);
		add(lettuce);
		add(onion);
		add(pickles);
		add(tomato);
		add(c2);
		add(il);
		add(it);
		add(cl);
		add(nd);
		add(f);
		add(confirm);
		add(Total);
		add(tt);
		add(baht);
	}
	public void paintComponent(Graphics g) {
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource()== f) {
			if (f.getSelectedItem() == "Chicken Sandwich") {
					subtotal2 = 125;
			}
		if (f.getSelectedItem() == "Beef Burger") {
					subtotal2 = 200;
			}
		if (f.getSelectedItem() == "Pork Burger") {
			subtotal2 = 150;
			}
		if (f.getSelectedItem() == "Ham Sandwich") {
			subtotal2 = 115;
	}
		if (f.getSelectedItem() == "Select") {
			subtotal2 = 0;
	}}}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == confirm) {
			counter = counter +1;
			String text = super.n.getText();
			System.out.println("Order#"+counter+" Name: "+text);
			System.out.println("- "+f.getSelectedItem());
			total = Math.sqrt(1)*(subtotal1+subtotal2);
			Total.setText(Double.toString(total));
			NewWin1 thankyou = new NewWin1();
			
		
			if (lettuce.isSelected()) {
			System.out.println(" *Lettuce");
			}
			if (onion.isSelected()) {
				System.out.println(" *Onion");
				}
			if (pickles.isSelected()) {
				System.out.println(" *Pickles");
				}
			if (tomato.isSelected()) {
				System.out.println(" *Tomato");
				}
			System.out.println(drink);
			System.out.println("- "+total);
			lettuce.setSelected(false);
			onion.setSelected(false);
			pickles.setSelected(false);
			tomato.setSelected(false);
			g1.clearSelection();
			f.setSelectedIndex(0);
			super.n.setText("");
			
			
		}
			if (il.isSelected()) {
			subtotal1 = 80;
			drink = "- Ice Latte";
		}	if (cl.isSelected()) { 
			subtotal1 = 40;
			drink = "- Cola";
		}	if (nd.isSelected()) {
			subtotal1 = 0;
			drink = "- No drink";
		}	if (it.isSelected()) {
			subtotal1 = 65;
			drink = "- Iced Tea";
		}
			
		
		
	}

	}

