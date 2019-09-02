import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Digit {

	int number, x, y;
	Color color;
	boolean on;

	public Digit(int x) {
		this.number = -1;
		this.y = 10;
		this.x = x;
		this.color = new Color(20, 255, 10, 255);
		this.on = false;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setOn() {
		this.on = true;
	}

	public boolean switchOn() {

		// turns Digit on and off

		if (this.on) {
			this.on = false;
		} else if (!on) {
			this.on = true;
		}
		return this.on;
	}

	public void paintMe(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		paintDigit(g2d);
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void paintDigit(Graphics2D g2d) {

		if (this.number == -2) {
			// for Separator ":"
			g2d.setColor(new Color(20, 255, 255));
			g2d.fillRect(this.x, this.y, 30, 175);
			g2d.setColor(new Color(70, 70, 70, 240));
			g2d.fillRect(this.x, this.y, 30, 175);

			if (this.on) {
				g2d.setColor(this.color);
			} else {
				g2d.setColor(new Color(90, 50, 90, 50));

			}

			g2d.fillRect(10 + this.x, 60 + this.y, 10, 10);
			g2d.fillRect(10 + this.x, 115 + this.y, 10, 10);

			g2d.setColor(new Color(20, 80, 80, 30));
			g2d.fillRect(this.x, this.y, 30, 175);

		} else if (this.number == -3) {
			// For Seperator "."
			g2d.setColor(new Color(20, 255, 255));
			g2d.fillRect(this.x, this.y, 30, 175);
			g2d.setColor(new Color(70, 70, 70, 240));
			g2d.fillRect(this.x, this.y, 30, 175);

			g2d.setColor(this.color);

			g2d.fillRect(10 + this.x, 150 + this.y, 10, 10);

			g2d.setColor(new Color(20, 80, 80, 30));
			g2d.fillRect(this.x, this.y, 30, 175);

		} else {
			g2d.setColor(new Color(20, 255, 255));
			g2d.fillRect(this.x, this.y, 90, 175);
			g2d.setColor(new Color(70, 70, 70, 240));
			g2d.fillRect(this.x, this.y, 90, 175);
			g2d.setColor(new Color(90, 50, 90, 50));

			g2d.fillRect(25 + this.x, 10 + this.y, 40, 10);
			g2d.fillRect(70 + this.x, 15 + this.y, 10, 70);
			g2d.fillRect(10 + this.x, 15 + this.y, 10, 70);
			g2d.fillRect(25 + this.x, 80 + this.y, 40, 10);
			g2d.fillRect(10 + this.x, 90 + this.y, 10, 70);
			g2d.fillRect(70 + this.x, 90 + this.y, 10, 70);
			g2d.fillRect(25 + this.x, 155 + this.y, 40, 10);

			g2d.setColor(this.color);

			if (this.number == 0 || this.number == 2 || this.number == 3 || this.number == 5 || this.number == 6
					|| this.number == 7 || this.number == 8 || this.number == 9) {
				g2d.fillRect(25 + this.x, 10 + this.y, 40, 10);
			} // Segment Top
			if (this.number == 1 || this.number == 0 || this.number == 2 || this.number == 3 || this.number == 4
					|| this.number == 7 || this.number == 8 || this.number == 9) {
				g2d.fillRect(70 + this.x, 15 + this.y, 10, 70);
			} // Segment TopLeft
			if (this.number == 0 || this.number == 4 || this.number == 5 || this.number == 6 || this.number == 8
					|| this.number == 9) {
				g2d.fillRect(10 + this.x, 15 + this.y, 10, 70);
			} // Segment TopRight
			if (this.number == 2 || this.number == 3 || this.number == 4 || this.number == 5 || this.number == 6
					|| this.number == 8 || this.number == 9) {
				g2d.fillRect(25 + this.x, 80 + this.y, 40, 10);
			} // Segment Middle
			if (this.number == 0 || this.number == 2 || this.number == 6 || this.number == 8) {
				g2d.fillRect(10 + this.x, 90 + this.y, 10, 70);
			} // Segment ButtomLeft
			if (this.number == 1 || this.number == 0 || this.number == 3 || this.number == 4 || this.number == 5
					|| this.number == 6 || this.number == 7 || this.number == 8 || this.number == 9) {
				g2d.fillRect(70 + this.x, 90 + this.y, 10, 70);
			} // Segment ButtomRight
			if (this.number == 0 || this.number == 2 || this.number == 3 || this.number == 5 || this.number == 6
					|| this.number == 8 || this.number == 9) {
				g2d.fillRect(25 + this.x, 155 + this.y, 40, 10);
			} // Segment Buttom
			g2d.setColor(new Color(20, 80, 80, 30));
			g2d.fillRect(this.x, this.y, 90, 175);

		}

	}

}
