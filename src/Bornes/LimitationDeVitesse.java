package Bornes;

public class LimitationDeVitesse extends Attaque {
	
	private static int nbLimitationDeVitesses=0;
	
	private LimitationDeVitesse (){
		nbLimitationDeVitesses++;
	}
	
	public LimitationDeVitesse instanciate()
	{
		LimitationDeVitesse limitationDeVitesse = new LimitationDeVitesse();
		
		if (nbLimitationDeVitesses<=2)
		{	
			limitationDeVitesse.valide=true;
			
		}
		else
		{
			limitationDeVitesse.valide=false;
		}
		return limitationDeVitesse;
	}

}
