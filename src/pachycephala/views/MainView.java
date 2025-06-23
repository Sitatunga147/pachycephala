package pachycephala.views;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainView extends JFrame {
	
	public MainView() {
		setTitle("Pachycephala Tournament Manager");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
