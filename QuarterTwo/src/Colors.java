import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Colors extends JFrame implements ActionListener {
	JTextField red;
	JTextField green;
	JTextField blue;
	JPanel centerCanvas;
	public static void main(String[] args) {
		Colors object1 = new Colors();
		object1.setVisible(true);
	}
	
	public Colors() {
		super("Colors");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel northCanvas = new JPanel();
			northCanvas.setBackground(Color.BLUE);
			JLabel redLabel = new JLabel("Red:");
			northCanvas.add(redLabel);
			red = new JTextField(5);
			northCanvas.add(red);
			JLabel greenLabel = new JLabel("Green:");
			northCanvas.add(greenLabel);
			green = new JTextField(5);
			northCanvas.add(green);
			JLabel blueLabel = new JLabel("Blue:");
			northCanvas.add(blueLabel);
			blue = new JTextField(5);
			northCanvas.add(blue);
			JButton calculate = new JButton("Calculate");
			northCanvas.add(calculate);
			calculate.addActionListener(this);
		add(northCanvas,BorderLayout.NORTH);
		
		centerCanvas = new JPanel();
			centerCanvas.setBackground(Color.GRAY);
		add(centerCanvas,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		
		if (word.equals("Calculate")) {
			centerCanvas.setBackground(new Color(Integer.parseInt(red.getText()), Integer.parseInt(green.getText()), Integer.parseInt(blue.getText())));
		}
	}
}
