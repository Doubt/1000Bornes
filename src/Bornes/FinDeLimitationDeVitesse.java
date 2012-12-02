package Bornes;

public class FinDeLimitationDeVitesse extends Parade {
	
	private static int nbFinDeLimitationDeVitesses=0;
	
	private FinDeLimitationDeVitesse (){
		nbFinDeLimitationDeVitesses++;
	}
	
	public FinDeLimitationDeVitesse instanciate()
	{
		FinDeLimitationDeVitesse finDeLimitationDeVitesse = new FinDeLimitationDeVitesse();
		
		if (nbFinDeLimitationDeVitesses<=4)
		{	
			finDeLimitationDeVitesse.valide=true;
			
		}
		else
		{
			finDeLimitationDeVitesse.valide=false;
		}
		return finDeLimitationDeVitesse;
	}

}
