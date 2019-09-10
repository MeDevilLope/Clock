import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	Display timerDisplay;

	public Window() {
		this.timerDisplay = new Display();
		timerDisplay.setBackground(Color.BLACK);
		add(timerDisplay);
		pack();

		setTitle("Timer");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
