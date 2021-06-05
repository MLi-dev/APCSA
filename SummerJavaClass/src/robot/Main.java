package robot;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Welcome to Robot park!");
		jFrame.getContentPane().add(new Controller());
		jFrame.setSize(400, 420);
		jFrame.setVisible(true);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
