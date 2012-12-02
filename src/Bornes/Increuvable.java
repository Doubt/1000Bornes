package Bornes;

public class Increuvable extends Botte {
	
	private static Increuvable increuvable;
	private Increuvable (){}
	
	public static Increuvable instanciate ()
	{
		if(Increuvable.increuvable == null)
		{
			Increuvable.increuvable = new Increuvable();
		}
		return Increuvable.increuvable;
	}

}
