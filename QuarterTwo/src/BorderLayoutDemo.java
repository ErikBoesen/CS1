import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class BorderLayoutDemo extends JFrame implements ActionListener {
	JPanel westCanvas = new JPanel();
	JPanel eastCanvas = new JPanel();
	JPanel centerCanvas = new JPanel();
	JPanel southCanvas = new JPanel();
	public static void main(String[] args) {
		BorderLayoutDemo object1 = new BorderLayoutDemo();
		object1.setVisible(true);
	}
	public BorderLayoutDemo() {
		super("BorderLayout");
		setSize(800,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JLabel nameLabel = new JLabel("Erik");
		westCanvas.setBackground(Color.CYAN);
		westCanvas.add(nameLabel);
		add(westCanvas,BorderLayout.WEST);
		
		JRadioButton president = new JRadioButton("president");
		eastCanvas.add(president);
		JRadioButton vicePresident = new JRadioButton("Vice President");
		eastCanvas.setBackground(Color.RED);
		eastCanvas.add(vicePresident);
		add(eastCanvas,BorderLayout.EAST);
		
		JSlider moneySlider = new JSlider();
		centerCanvas.setBackground(Color.GREEN);
		centerCanvas.add(moneySlider);
		add(centerCanvas,BorderLayout.CENTER);
		
		JButton switchOne = new JButton("Switch One");
		southCanvas.add(switchOne);
		switchOne.addActionListener(this);
		JButton switchTwo = new JButton("Switch One");
		southCanvas.add(switchTwo);
		switchTwo.addActionListener(this);
		southCanvas.setBackground(Color.ORANGE);
		add(southCanvas,BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		if (word.equals("Switch One")) {
			westCanvas.setBackground(Color.BLUE);
		}
		else if (word.equals("Switch Two")) {
			centerCanvas.setBackground(Color.WHITE);
		}
	}
}
