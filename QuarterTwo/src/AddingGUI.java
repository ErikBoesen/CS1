import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddingGUI extends JFrame implements ActionListener {
	public static void main(String[] args) {
		AddingGUI object1 = new AddingGUI();
		object1.setVisible(true);
	}
	
	public AddingGUI() {
		super("Adding GUI");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel northCanvas = new JPanel();
			northCanvas.setBackground(Color.BLUE);
			JLabel num1Label = new JLabel("Number One");
			northCanvas.add(num1Label);
			JTextField num1Field = new JTextField(5);
			northCanvas.add(num1Field);
			JLabel num2Label = new JLabel("Number Two");
			northCanvas.add(num2Label);
			JTextField num2Field = new JTextField(5);
			northCanvas.add(num2Field);
			JLabel num3Label = new JLabel("Number Three");
			northCanvas.add(num3Label);
			JTextField num3Field = new JTextField(5);
			northCanvas.add(num3Field);
		add(northCanvas,BorderLayout.NORTH);
		
		JPanel centerCanvas = new JPanel();
			centerCanvas.setBackground(Color.GREEN);
			JLabel resultLabel = new JLabel("Result");
			centerCanvas.add(resultLabel);
		add(centerCanvas,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		if (word.equals("Exit")) {
			System.exit(0);
		}
		
	}
}
