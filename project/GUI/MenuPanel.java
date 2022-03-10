package GUI;
import javax.swing.*;

import static GUI.Utils.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.lang.reflect.Array;
import java.util.Vector;

public final class MenuPanel extends Panel {
	
	private Vector<JCheckBoxMenuItem> items;
	private JMenu menu;
	private JButton startButton;
	
	MenuPanel(){
		super();
	}


	@Override
	protected void createComponents() {
		menu = new JMenu("Choix des régions");
		items = new Vector<JCheckBoxMenuItem>();
		for(int i = 0; i < NB_ZONES; i++) {
			items.add(i, new JCheckBoxMenuItem());
			items.elementAt(i).setText("Region " + i);
		}
		startButton = new JButton("Start");
	}

	@Override
	protected void addComponents() {
		add(menu, BorderLayout.CENTER);
		for(int i = 0; i < items.size(); i++) {
			menu.add(items.get(i));
		}
		
//		add(startButton, BorderLayout.EAST);
//		startButton.setPreferredSize(new Dimension(100,40));
		
	}

	@Override
	protected void styleComponents() {
		// TODO Auto-generated method stub
		
	}
}
