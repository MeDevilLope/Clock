import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame {

	Display timerDisplay;

	public Window() {
		this.timerDisplay = new Display();
		timerDisplay.setBackground(Color.BLACK);
		add(timerDisplay);
		pack();

		setTitle("Clock");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
