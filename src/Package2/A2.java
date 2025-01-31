package Package2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class A2 extends A implements MouseListener {
	JLabel me;
	JLabel rec;
 public A2(){
	  setBackground(Color.WHITE);

	 	me = new JLabel("Menu");
	 	me.setBounds(500, 80, 150, 20);
	 	me.setFont(new Font("Tahoma",Font.BOLD,18));
		rec = new JLabel("See Recommendations (Click&Hold Here)");
		rec.setFont(new Font("Tahoma",Font.BOLD,15));
		
		rec.addMouseListener(this);
		rec.setBounds(500, 520, 400, 20);
		setBounds(490,140,600,500);
		setLayout(null);
		
		
		add(me);
		add(rec);
	}


@Override
	public void mouseClicked(MouseEvent e) {}

@Override
	public void mousePressed(MouseEvent e) {

	Graphics g = getGraphics();
	Graphics2D gs = (Graphics2D)g;
	gs.setStroke(new java.awt.BasicStroke(3));
	g.setColor(new Color(177,223,243));
	g.fillRect(500, 110, 300, 400);
	g.setColor(Color.BLACK);
	gs.drawRect(500, 110, 300, 400);
	g.setFont(new Font("Tahoma",Font.BOLD,18));
	g.drawString("Breakfast Set:", 525, 160);
	g.setFont(new Font("Tahoma",Font.PLAIN,18));
	g.drawString("- Ham Sandwich", 525, 180);
	g.drawString("- Iced Latte", 525, 200);
	g.setFont(new Font("Tahoma",Font.BOLD,18));
	g.drawString("Super Set:", 525, 240);
	g.setFont(new Font("Tahoma",Font.PLAIN,18));
	g.drawString("- Beef Burger", 525, 260);
	g.drawString("- Iced Tea", 525, 280);
	g.setFont(new Font("Tahoma",Font.BOLD,18));
	g.drawString("Value Set:", 525, 320);
	g.setFont(new Font("Tahoma",Font.PLAIN,18));
	g.drawString("- Chicken Sandwich", 525, 340);
	g.drawString(" /Pork Burger/Ham Sandwich", 525, 360);
	g.drawString("- Cola", 525, 380);
	}

@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	Graphics g = getGraphics();
	Graphics2D gs = (Graphics2D)g;
	gs.setStroke(new java.awt.BasicStroke(3));
	g.setColor(new Color(249,207,221));
	g.fillRect(500, 110, 300, 400);
	g.setColor(Color.BLACK);
	gs.drawRect(500, 110, 300, 400);
	g.setFont(new Font("Tahoma",Font.PLAIN,18));
	g.drawString("Chicken Sandwich", 525, 160);
	g.drawString("125฿", 725, 160);
	g.drawString("Beef Burger", 525, 200);
	g.drawString("200฿", 725, 200);
	g.drawString("Pork Burger", 525, 240);
	g.drawString("150฿", 725, 240);
	g.drawString("Ham Sandwich", 525, 280);
	g.drawString("125฿", 725, 280);
	g.drawString("Iced Latte", 525, 320);
	g.drawString("80฿", 735, 320);
	g.drawString("Iced Tea",525,360);
	g.drawString("65฿", 735, 360);
	g.drawString("Cola", 525, 400);
	g.drawString("40฿", 735, 400);

	}

@Override
	public void mouseEntered(MouseEvent e) {}

@Override
	public void mouseExited(MouseEvent e) {}
}
