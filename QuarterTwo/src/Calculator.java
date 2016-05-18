import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener {
	JLabel screen;
	String op;
	int[] operands = {1, 2};
	public static void main(String[] args) {
		Calculator object1 = new Calculator();
		object1.setVisible(true);
	}
	public Calculator() {
		super("Calculator");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel calc = new JPanel();
			calc.setBackground(Color.GRAY);
			calc.setLayout(new GridBagLayout());
			screen = new JLabel("");
			c.gridx = 0;
			c.gridy = 0;
			calc.add(screen);
			JButton button7 = new JButton("7");
			c.gridy = 1;
			button7.addActionListener(this);
			calc.add(button7, c);
			JButton button8 = new JButton("8");
			c.gridx = 1;
			button8.addActionListener(this);
			calc.add(button8, c);
			JButton button9 = new JButton("9");
			c.gridx = 2;
			button9.addActionListener(this);
			calc.add(button9, c);
			JButton buttonAdd = new JButton("+");
			c.gridx = 3;
			buttonAdd.addActionListener(this);
			calc.add(buttonAdd, c);
			JButton button4 = new JButton("4");
			c.gridx = 0;
			c.gridy = 2;
			button4.addActionListener(this);
			calc.add(button4, c);
			JButton button5 = new JButton("5");
			c.gridx = 1;
			button5.addActionListener(this);
			calc.add(button5, c);
			JButton button6 = new JButton("6");
			c.gridx = 2;
			button6.addActionListener(this);
			calc.add(button6, c);
			JButton buttonSubtract = new JButton("-");
			c.gridx = 3;
			buttonSubtract.addActionListener(this);
			calc.add(buttonSubtract, c);
			JButton button1 = new JButton("1");
			c.gridx = 0;
			c.gridy = 3;
			button1.addActionListener(this);
			calc.add(button1, c);
			JButton button2 = new JButton("2");
			c.gridx = 1;
			button2.addActionListener(this);
			calc.add(button2, c);
			JButton button3 = new JButton("3");
			c.gridx = 2;
			button3.addActionListener(this);
			calc.add(button3, c);
			JButton buttonMultiply = new JButton("*");
			c.gridx = 3;
			buttonMultiply.addActionListener(this);
			calc.add(buttonMultiply, c);
			JButton button0 = new JButton("0");
			c.gridx = 0;
			c.gridy = 4;
			button0.addActionListener(this);
			calc.add(button0, c);
			JButton buttonClear = new JButton("C");
			c.gridx = 1;
			buttonClear.addActionListener(this);
			calc.add(buttonClear, c);
			JButton buttonEquals = new JButton("=");
			c.gridx = 2;
			buttonEquals.addActionListener(this);
			calc.add(buttonEquals, c);
			JButton buttonDivide = new JButton("/");
			c.gridx = 3;
			buttonDivide.addActionListener(this);
			calc.add(buttonDivide, c);
		add(calc);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
	
		if (word.equals("1") || word.equals("2") || word.equals("3") || word.equals("4") || word.equals("5") || word.equals("6") || word.equals("7") || word.equals("8") || word.equals("9") || word.equals("0")) {
			screen.setText(screen.getText() + word);
		} else if (word.equals("+") || word.equals("-") || word.equals("*") || word.equals("/")) {
			op = word;
			operands[0] = Integer.parseInt(screen.getText());
			screen.setText("");
		} else if (word.equals("C")) {
			screen.setText("");
		} else if (word.equals("=")) {
			operands[1] = Integer.parseInt(screen.getText());
			if (op.equals("+")) {
				screen.setText(Integer.toString(operands[0] + operands[1]));
			} else if (op.equals("-")) {
				screen.setText(Integer.toString(operands[0] - operands[1]));
			} else if (op.equals("*")) {
				screen.setText(Integer.toString(operands[0] * operands[1]));
			} else if (op.equals("/")) {
				screen.setText(Integer.toString(operands[0] / operands[1]));
			}
		}
	}
}
