package exercicios.e1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Jpanel_Background extends JPanel {
	  private Image backgroundImage;

	  // Some code to initialize the background image.
	  // Here, we use the constructor to load the image. This
	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    try {
			backgroundImage = ImageIO.read(new File("res/bg.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	    // Draw the background image.
	    g.drawImage(backgroundImage, 0, 0, this);
	  }

}
