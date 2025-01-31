package Package1;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWin1  {
	
		JFrame frame2 = new JFrame();
		NewWin1(){
			NewWin2 n = new NewWin2();
			n.setBounds(0,0,600,300);
			frame2.add(n);
			frame2.setTitle("Self-Order");
			frame2.setSize(600, 200);
			frame2.setLocationRelativeTo(null);
			frame2.setLayout(null);
			frame2.setVisible(true);
			frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}
 