import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders extends JFrame implements ActionListener, ChangeListener {
	JLabel results;
	public static void main(String[] args) {
		Sliders object1 = new Sliders();
		object1.setVisible(true);
	}
	
	public Sliders() {
		super("Sliders");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel centerCanvas = new JPanel();
			centerCanvas.setBackground(Color.WHITE);
			results = new JLabel("This is where the results will be");
			centerCanvas.add(results);
			JSlider people = new JSlider();
			centerCanvas.add(people);
			JSlider persons = new JSlider(JSlider.VERTICAL, 10, 30, 25);
			persons.addChangeListener((ChangeListener) this);
			persons.setMajorTickSpacing(5);
			persons.setMinorTickSpacing(1);
			persons.setPaintTicks(true);
			persons.setPaintLabels(true);
			centerCanvas.add(persons);
		add(centerCanvas,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
		results.setText("The value on the slider is " + source.getValue());
	}
}
