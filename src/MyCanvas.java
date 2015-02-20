import java.awt.Canvas;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MyCanvas extends Canvas { //implements MouseListener, MouseMotionListener {
	public MyCanvas() {
		super();
		JFrame appWindow = new JFrame("Painting Window");
		appWindow.setSize(800, 600);
		appWindow.setBackground(Color.GRAY);
		appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appWindow.setVisible(true);
		appWindow.setLayout(new GridLayout());
	}
}
