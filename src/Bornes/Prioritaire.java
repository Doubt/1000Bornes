package Bornes;


public class Prioritaire extends Botte {
	
	private static Prioritaire prioritaire;
	private Prioritaire (){}
	
	public static Prioritaire instanciate ()
	{
		if(Prioritaire.prioritaire == null)
		{
			Prioritaire.prioritaire = new Prioritaire();
		}
		return Prioritaire.prioritaire;
	}

}
