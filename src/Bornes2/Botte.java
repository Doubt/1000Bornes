package Bornes2;

import Bornes2.Attaque.typeAttaque;

public class Botte extends Carte {
	
	public static enum typeBotte{asDuVolant, increuvable, prioritaire, citerne};
	private typeBotte type;
	private boolean coupeFourre;
	
	public Botte(typeBotte type)
	{
		this.type=type;
		this.coupeFourre=false;
	}
	
	public void Fourrer()
	{
		this.coupeFourre=true;
	}

}
