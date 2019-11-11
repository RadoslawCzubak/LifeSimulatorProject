package LifeSimulation;

import java.awt.Color;

import javax.swing.JSlider;
/**
 * Klasa okreœla parametry dla Sliderów okreœlaj¹cych iloœæ organizmów
 * @author Rados³aw Czubak
 * @version 1.0.0
 * 
 */
public class OrganismSlider extends JSlider
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int ORG_MIN = 0;
	public static final int ORG_MAX = 15;
	public static final int ORG_INIT = 7;
	
	/**
	 * Konstruktor okreœla domyœln¹ wartoœæ ustawion¹ na sliderze oraz jego maxymaln¹ oraz minimaln¹ wartoœæ
	 * 
	 */
	public OrganismSlider()
	{
		super(JSlider.HORIZONTAL, ORG_MIN, ORG_MAX, ORG_INIT);
		setBackground(Color.DARK_GRAY);
		
		setMajorTickSpacing(15);
		setMinorTickSpacing(1);
		setPaintTicks(true);
		setPaintLabels(true);
	}
}
