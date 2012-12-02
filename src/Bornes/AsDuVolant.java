package Bornes;

public class AsDuVolant extends Botte {
	
	private static AsDuVolant asDuVolant;
	private AsDuVolant (){}
	
	public static AsDuVolant instanciate ()
	{
		if(AsDuVolant.asDuVolant == null)
		{
			AsDuVolant.asDuVolant = new AsDuVolant();
		}
		return AsDuVolant.asDuVolant;
	}

}
