package LifeSimulation;

import java.awt.Color;

import javax.swing.JSlider;
/**
 * Klasa okre�la parametry dla Slider�w okre�laj�cych ilo�� organizm�w
 * @author Rados�aw Czubak
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
	 * Konstruktor okre�la domy�ln� warto�� ustawion� na sliderze oraz jego maxymaln� oraz minimaln� warto��
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
