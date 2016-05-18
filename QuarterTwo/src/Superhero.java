import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Superhero extends JFrame implements ActionListener {
	JLabel superheroName;
	public static void main(String[] args) {
		Superhero obj2 = new Superhero();
		obj2.setVisible(true);
	}
	public Superhero() {
		setTitle("Superhero");
		setSize(550,65);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel superheroLabel = new JLabel("Enter your favorite superhero");
		add(superheroLabel);
		JTextField superheroField = new JTextField(10);
		add(superheroField);
		superheroName = new JLabel();
		add(superheroName);
		JButton changeButton = new JButton("Change");
		changeButton.addActionListener(this);
		add(changeButton);
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(this);
		add(exitButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		if (word.equals("Exit")) {
			System.exit(0);
		}
		else if (word.equals("Change")) {
			superheroName.setText("Jack");
		}
	}
}
