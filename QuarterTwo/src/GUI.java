import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {
	public static void main(String[] args) {
		GUI obj1 = new GUI();
		obj1.setVisible(true);
	}
	// Constructor Method
	public GUI() {
		setTitle("Demo window");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel firstLabel = new JLabel("Hello there");
		add(firstLabel);
		JLabel secondLabel = new JLabel("I wish my bottle was full");
		add(secondLabel);
		JLabel nameLabel = new JLabel("Enter in your first name");
		add(nameLabel);
		JTextField nameField = new JTextField("Enter your name", 10);
		add(nameField);
		JTextArea essayArea = new JTextArea(3,20);
		add(essayArea);
		JButton submitButton = new JButton("Submit");
		add(submitButton);
		JButton exitButton = new JButton("Exit");
		exitButton.setForeground(Color.BLUE);
		add(exitButton);
		JButton clearButton = new JButton("Clear");
		add(clearButton);
	}
}
