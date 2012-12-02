package Bornes;

public class Citerne extends Botte {
	
	private static Citerne citerne;
	private Citerne (){}
	
	public static Citerne instanciate ()
	{
		if(Citerne.citerne == null)
		{
			Citerne.citerne = new Citerne();
		}
		return Citerne.citerne;
	}

}
