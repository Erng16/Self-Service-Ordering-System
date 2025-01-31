package Package1;
import javax.swing.JFrame;

import Package2.A2;


public class Frame  {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		
		Welcome panel1 = new Welcome();
		panel1.setBounds(5, 5, 900, 40);
		frame.add(panel1);
		
		MainPT1 panel2 = new MainPT2();
		panel2.setBounds(5, 10, 900, 900);
		frame.add(panel2);
		
		
		A2 panel3 = new A2();
		panel3.setBounds(0,0,900,900);
		frame.add(panel3);
		
		
		
		frame.setTitle("Self-Order");
		frame.setSize(900, 900);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
