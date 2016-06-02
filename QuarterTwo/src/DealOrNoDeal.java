import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class DealOrNoDeal extends JFrame implements ActionListener {
	JLabel guessOne;
	JLabel guessTwo;
	JLabel guessThree;
	JPanel choose;
	JPanel eliminate;
	JButton s0;
	JButton s1;
	JButton s2;
	JButton s3;
	JButton s4;
	JButton s5;
	JButton s6;
	JButton s7;
	JButton s8;
	JButton s9;
	JButton s10;
	JButton s11;
	JButton s12;
	JButton s13;
	JButton s14;
	JButton s15;
	JButton s16;
	JButton s17;
	JButton s18;
	JButton s19;
	JButton s20;
	JButton s21;
	JButton s22;
	JButton s23;
	JButton s24;
	JButton s25;
	JButton s26;
	JButton[] suitcases = {
		s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26
	};
	ArrayList<Integer> answers = new ArrayList<Integer>();
	int counter = 0;
	public static void main(String[] args) {
		DealOrNoDeal object =  new DealOrNoDeal();
		object.setVisible(true);
	}
	public DealOrNoDeal() {
		super("Deal or No Deal?");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JTabbedPane panes = new JTabbedPane();
			choose = new JPanel();
				for (int i = 0; i < suitcases.length; i++) {
					suitcases[i] = new JButton("Suitcase " + i);
					choose.add(suitcases[i]);
					suitcases[i].addActionListener(this);
				}
			panes.add(choose, "Choose case");
			
			eliminate = new JPanel();
				for (int i = suitcases.length; i < suitcases.length; i++) {
					suitcases[i] = new JButton(Integer.toString(i));
					eliminate.add(suitcases[i]);
					suitcases[i].addActionListener(this);
				}
			panes.add(eliminate, "Eliminate");
		add(panes);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		
		if (word.substring(0, 9) == "Suitcase ") {
			
		}
	}
}
