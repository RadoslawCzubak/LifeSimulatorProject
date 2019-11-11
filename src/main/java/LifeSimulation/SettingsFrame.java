package LifeSimulation;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Klasa wy�wietla okno ustawie� symulacji.
 * 
 * @author Rados�aw Czubak
 * @version 1.0.0
 * 
 */
public class SettingsFrame extends JFrame
{

	private static final long serialVersionUID = 1L;
	SettingsPanel settingsPanel;
	
	 /**
	  * Konstruktor okna ustawie�
	  */
	public SettingsFrame()
	{
		super("Organism Spawner");
		settingsPanel = new SettingsPanel();
		settingsPanel.setParent(this);
		add(settingsPanel);
		settingsPanel.acceptBtn.addActionListener(settingsPanel);
		setSize(500,620);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	
	
}
