package Package1;
import java.awt.*;

import javax.swing.*;

public class Welcome extends JPanel {
	public Welcome(){
	setBackground(Color.WHITE);
	//setLayout(new GridLayout(2,1));
	setLayout(null);
	
	JLabel l1 = new JLabel("Welcome to Self-Order where you can place your own order for Restaurant A!");
	l1.setBounds(10, 10, 900, 24);
	l1.setFont(new Font("Tahoma",Font.BOLD,20));


	
	
	
	add(l1);

	
	
	}
}
