package Package2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class A extends JPanel {
 public A(){
	  setBackground(Color.WHITE);
	}
 protected void paintComponent(Graphics g) {
		super.paintComponent(g);
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
		g.drawString("115฿", 725, 280);
		g.drawString("Iced Latte", 525, 320);
		g.drawString("80฿", 735, 320);
		g.drawString("Iced Tea",525,360);
		g.drawString("65฿", 735, 360);
		g.drawString("Cola", 525, 400);
		g.drawString("40฿", 735, 400);
	
	}	

}