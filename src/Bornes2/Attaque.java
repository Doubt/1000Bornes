package Bornes2;

public class Attaque extends Carte {
	
	public static enum typeAttaque{accident, creuvaison, feuRouge, panneDEssence, limitationDeVitesse};
	private typeAttaque type;
	
	public Attaque(typeAttaque type)
	{
		
		this.type=type;
		
	}
	
	public typeAttaque getType()
	{
		return this.type;
	}
	

}
