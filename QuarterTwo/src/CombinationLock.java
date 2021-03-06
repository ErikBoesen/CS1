import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CombinationLock extends JFrame implements ActionListener {
	JLabel guessOne;
	JLabel guessTwo;
	JLabel guessThree;
	JPanel panel1;
	JButton b0;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton[] buttons = {
		b0, b1, b2, b3, b4, b5, b6, b7, b8, b9
	};
	JButton reset;
//	int[] locks = new int[3];
	int[] locks = {5, 2, 9};
	ArrayList<Integer> answers = new ArrayList<Integer>();
	int counter = 0;
	public static void main(String[] args) {
		CombinationLock object =  new CombinationLock();
		object.setVisible(true);
	}
	public CombinationLock() {
		super("Combination Lock");
		setSize(1000,60);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		panel1 = new JPanel();
			panel1.setBackground(Color.GRAY);
			guessOne = new JLabel("_");
			guessTwo = new JLabel("_");
			guessThree = new JLabel("_");
			panel1.add(guessOne);
			panel1.add(guessTwo);
			panel1.add(guessThree);
			for (int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton(Integer.toString(i));
				panel1.add(buttons[i]);
				buttons[i].addActionListener(this);
			}
			reset = new JButton("Reset");
			panel1.add(reset);
			reset.addActionListener(this);
		add(panel1,BorderLayout.NORTH);
	}
	public void initiate() {
		/*for (int i = 0; i < 3; i++) {
			locks[i] = (int)(Math.random() * 10);
		}*/
		answers.clear();
		counter = 0;
		guessOne.setText("_");
		guessTwo.setText("_");
		guessThree.setText("_");
		panel1.setBackground(Color.GRAY);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		int num;
		try {
			num = Integer.parseInt(word);
		} catch (NumberFormatException Ex) {
			num = 0;
		}

		System.out.println(counter);
		System.out.println(num);
		if (word.equals("Reset")) {
			initiate();
		} else {
			answers.add(num);
			
			if (counter == 0) {
				guessOne.setText(num + "");
			} else if (counter == 1) {
				guessTwo.setText(num + "");
			} else if (counter == 2) {
				guessThree.setText(num + "");
				
				System.out.println("Counter is 2");
				System.out.println(answers.get(0));
				boolean listsSame = false;
				for (int i = 0; i < 3; i++) {
					if (locks[i] == answers.get(i) || answers.get(i) == 0) {
						listsSame = true;
					} else {
						listsSame = false;
					}
				}
				if (listsSame) {
					panel1.setBackground(Color.GREEN);
				} else {
					panel1.setBackground(Color.RED);
				}
			}
			if (counter > 2) {
				counter = 2;
			}
			counter++;
		}
	}
}
