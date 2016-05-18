import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPanes extends JFrame implements ActionListener {
	public static void main(String[] args) {
		TabbedPanes object =  new TabbedPanes();
		object.setVisible(true);
	}
	public TabbedPanes() {
		super("Tabbed Pane Example");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane panes = new JTabbedPane();
			JPanel panel1 = new JPanel();
				ImageIcon light = new ImageIcon("lightning-icon.png");
				JButton split1 = new JButton("Split 1");
				panel1.add(split1);
				split1.addActionListener(this);
				JButton steal1 = new JButton("Steal 1");
				panel1.add(steal1);
				split1.addActionListener(this);
			panes.add("Panel One", panel1);
			JPanel panel2 = new JPanel();
				JButton split2 = new JButton("Split 2");
				panel2.add(split2);
				split2.addActionListener(this);
				JButton steal2 = new JButton("Steal 2");
				panel2.add(steal2);
				steal2.addActionListener(this);
			panes.add("Panel Two", panel2);
			
		add(panes);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String word = e.getActionCommand();
		
		if (word.equals("Split 1")) {
			
		}
		else if (word.equals)
	}
	
}
