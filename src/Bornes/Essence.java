package Bornes;

public class Essence extends Parade {

	private static int nbEssences=0;
	
	private Essence (){
		nbEssences++;
	}
	
	public Essence instanciate()
	{
		Essence essence = new Essence();
		
		if (nbEssences<=4)
		{	
			essence.valide=true;
			
		}
		else
		{
			essence.valide=false;
		}
		return essence;
	}
}
