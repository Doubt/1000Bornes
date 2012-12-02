package Bornes;

public class Accident extends Attaque {
	
	private static int nbAccidents=0;
	
	private Accident (){
		nbAccidents++;
	}
	
	public Accident instanciate()
	{
		Accident accident = new Accident();
		
		if (nbAccidents<=2)
		{	
			accident.valide=true;
			
		}
		else
		{
			accident.valide=false;
		}
		return accident;
	}
	
}
