package Bornes;

public class FeuRouge extends Attaque {
	
	private static int nbFeuRouges=0;
	
	private FeuRouge (){
		nbFeuRouges++;
	}
	
	public FeuRouge instanciate()
	{
		FeuRouge feuRouge = new FeuRouge();
		
		if (nbFeuRouges<=2)
		{	
			feuRouge.valide=true;
			
		}
		else
		{
			feuRouge.valide=false;
		}
		return feuRouge;
	}

}
