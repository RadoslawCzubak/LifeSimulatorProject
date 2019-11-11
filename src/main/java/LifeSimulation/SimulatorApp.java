package LifeSimulation;

import javax.swing.SwingUtilities;


/**
 * Klasa g��wna aplikacji zawieraj�ca metod� main.
 * @author Rados�aw Czubak
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
