package Package1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWin2 extends JPanel implements ActionListener{
	String display="    	  Thank you for ordering with us!";
	Timer time = new Timer(3000,this);
	
	NewWin2(){	
		setLayout(null);
		time.start();
		}
		protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(146, 70, 10, 10);
		g.fillOval(448, 70, 10, 10);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Tahoma",Font.PLAIN,16));
		g.drawString(display, 160, 80);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			display = "Please pay for your order at the counter";
			repaint();
		}



}
