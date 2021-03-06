import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Prime extends JFrame implements ActionListener {
	JTextField number;
	JButton analyze;
	JLabel parity;
	JLabel prime;
	public static void main(String[] args) {
		Prime object =  new Prime();
		object.setVisible(true);
	}
	public Prime() {
		super("Number Checker");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
			number = new JTextField(10);
			panel1.add(number);
			analyze = new JButton("Analyze");
			panel1.add(analyze);
			analyze.addActionListener(this);
		add(panel1,BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
			parity = new JLabel("");
			panel2.add(parity);
			prime = new JLabel("");
			panel2.add(prime);
		add(panel2,BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		
		if (word.equals("Analyze")) {
			int num = Integer.parseInt(number.getText());
			if (num % 2 == 0) {
				parity.setText(num + " is even");
			} else {
				parity.setText(num + " is odd");
			}
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime.setText("and prime.");
			} else {
				prime.setText("and composite.");
			}
		}
	}
}
