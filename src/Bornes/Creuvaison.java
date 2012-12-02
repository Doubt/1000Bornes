package Bornes;

public class Creuvaison extends Attaque {
	
	private static int nbCreuvaisons=0;
	
	private Creuvaison (){
		nbCreuvaisons++;
	}
	
	public Creuvaison instanciate()
	{
		Creuvaison creuvaison = new Creuvaison();
		
		if (nbCreuvaisons<=2)
		{	
			creuvaison.valide=true;
			
		}
		else
		{
			creuvaison.valide=false;
		}
		return creuvaison;
	}

}
