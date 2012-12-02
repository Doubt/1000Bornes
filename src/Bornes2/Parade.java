package Bornes2;

import Bornes2.Attaque.typeAttaque;

public class Parade extends Carte {
	
	public static enum typeParade{reparation, roueDeSecours, feuVert, essence, finDeLimitationDeVitesse};
	private typeParade type;
	
	public Parade(typeParade type)
	{
		this.type=type;
	}
	
	public typeParade getType()
	{
		return this.type;
	}
}
