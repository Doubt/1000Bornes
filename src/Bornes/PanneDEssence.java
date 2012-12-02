package Bornes;

public class PanneDEssence extends Attaque {
	
	private static int nbPanneDEssenses=0;
	
	private PanneDEssence (){
		nbPanneDEssenses++;
	}
	
	public PanneDEssence instanciate()
	{
		PanneDEssence panneDEssence = new PanneDEssence();
		
		if (nbPanneDEssenses<=2)
		{	
			panneDEssence.valide=true;
			
		}
		else
		{
			panneDEssence.valide=false;
		}
		return panneDEssence;
	}

}
