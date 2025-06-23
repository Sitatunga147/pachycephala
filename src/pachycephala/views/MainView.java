package pachycephala.views;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainView extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel playersPanel;
	private JPanel tournamentsPanel;
	
	public MainView() {
		setTitle("Pachycephala Tournament Manager");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Players", playersPanel);
		tabbedPane.addTab("Tournaments", tournamentsPanel);
		setContentPane(tabbedPane);
	}
	
}
