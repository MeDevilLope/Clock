import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Display extends JPanel {

	Digit digit1, digit2, digit3, digit4, digit5, digit6, seperator1, seperator2;
	int number;
	Date date;
	Timer timer;
	int second, minute, hour;
	int hour1, hour2;
	int second1, second2;
	int minute1, minute2;

	public Display() {

		setFocusable(true);
		setPreferredSize(new Dimension(635, 180));

		initDigits();
		doTimer();
		timer.start();

	}

	public void doTimer() {

		// Calculate every second time to special Digit

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				second = LocalTime.now().getSecond();
				second2 = second / 10;
				second1 = second - (second2 * 10);

				digit6.setNumber(second1);
				digit5.setNumber(second2);

				minute = LocalTime.now().getMinute();
				minute2 = minute / 10;
				minute1 = minute - (minute2 * 10);

				digit4.setNumber(minute1);
				digit3.setNumber(minute2);

				hour = LocalTime.now().getHour();
				hour2 = hour / 10;
				hour1 = hour - (hour2 * 10);

				digit2.setNumber(hour1);
				digit1.setNumber(hour2);

				seperator2.switchOn();
				seperator1.setOn();

				repaint();
			}

		});

	}

	public void initDigits() {

		digit1 = new Digit(5);
		digit2 = new Digit(100);

		seperator1 = new Digit(195);
		seperator1.setNumber(-2);

		digit3 = new Digit(230);
		digit4 = new Digit(325);

		seperator2 = new Digit(420);
		seperator2.setNumber(-2);

		digit5 = new Digit(455);
		digit6 = new Digit(550);

		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		digit1.paintMe(g2d);
		digit2.paintMe(g2d);

		seperator1.paintMe(g2d);

		digit3.paintMe(g2d);
		digit4.paintMe(g2d);

		seperator2.paintMe(g2d);

		digit5.paintMe(g2d);
		digit6.paintMe(g2d);
	}

}
