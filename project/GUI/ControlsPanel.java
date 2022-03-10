package GUI;
import static GUI.Utils.*;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class ControlsPanel extends JPanel {
	
	private JButton start;
	private JButton stop;
	private JButton reset;
	
	public ControlsPanel(){
		setBackground(black);
		initLayout();
		createComponents();
		addComponents();
	}
	
	private void initLayout() {
		setLayout(new GridLayout());
	}
	
	private void createComponents() {
		ImageIcon icon = new ImageIcon("../images/start.png");
		Image scaled = icon.getImage();
		Image newimg = scaled.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		start = new JButton(icon);
		start.setBackground(grey);
		icon = new ImageIcon("../images/pause.png");
		scaled = icon.getImage();
		newimg = scaled.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		stop = new JButton(icon);
		stop.setBackground(grey);
		icon = new ImageIcon("../images/reset.png");
		scaled = icon.getImage();
		newimg = scaled.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		reset = new JButton(icon);
		reset.setBackground(grey);

	}
	
	private void addComponents() {
		add(start); add(stop); add(reset);
	}
	
}
