import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Password extends JFrame implements ActionListener {
	JTextField name;
	JTextField word;
	JLabel password;
	JLabel pin;
	public static void main(String[] args) {
		Password object1 = new Password();
		object1.setVisible(true);
	}
	
	public Password() {
		super("Password");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel northCanvas = new JPanel();
			northCanvas.setBackground(Color.BLUE);
			JLabel nameLabel = new JLabel("Name:");
			northCanvas.add(nameLabel);
			name = new JTextField(5);
			northCanvas.add(name);
			JLabel wordLabel = new JLabel("Random word:");
			northCanvas.add(wordLabel);
			word = new JTextField(5);
			northCanvas.add(word);
		add(northCanvas,BorderLayout.NORTH);
		
		JPanel centerCanvas = new JPanel();
			password = new JLabel("");
			pin = new JLabel("");
			centerCanvas.add(password);
			centerCanvas.add(pin);
		add(centerCanvas,BorderLayout.CENTER);
		
		JPanel southCanvas = new JPanel();
			JButton calculate = new JButton("Calculate");
			southCanvas.add(calculate);
			calculate.addActionListener(this);
		add(southCanvas,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if (button.equals("Calculate")) {
			password.setText("Password: " + name.getText().charAt((int)(Math.random() * name.getText().length())) + word.getText().charAt((int)(Math.random() * word.getText().length())) + (int)(Math.random() * 10) + (int)(Math.random() * 10));
			String pinText = "";
			for (int i = 0; i < 4; i++) {
				pinText += Integer.toString((int)(Math.random() * 10));
			}
			pin.setText("Pin: " + pinText);
		}
	}
}
