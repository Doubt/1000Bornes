package Bornes;

public class Reparation extends Parade {
	
	private static int nbReparations=0;
	
	private Reparation (){
		nbReparations++;
	}
	
	public Reparation instanciate()
	{
		Reparation reparation = new Reparation();
		
		if (nbReparations<=4)
		{	
			reparation.valide=true;
			
		}
		else
		{
			reparation.valide=false;
		}
		return reparation;
	}

}
