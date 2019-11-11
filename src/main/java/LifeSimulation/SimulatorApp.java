package LifeSimulation;

import javax.swing.SwingUtilities;


/**
 * Klasa g³ówna aplikacji zawieraj¹ca metodê main.
 * @author Rados³aw Czubak
 * @version 1.0.0
 * 
 */
public class SimulatorApp {
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
				{
					public void run() {
						new SimulationFrame();
						
					}
				});
	}

}
