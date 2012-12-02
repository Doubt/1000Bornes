package Bornes;

public class Etape extends Carte {
	
	private static int nbEtapes25 = 0;
	private static int nbEtapes50 = 0;
	private static int nbEtapes75 = 0;
	private static int nbEtapes100 = 0;
	private static int nbEtapes200 = 0;
	
	private int valeurEtape;
	private  Etape (int val)
	{
		this.valeurEtape=val;
	}
	
	public Etape instanciate (int val)
	{
		Etape etape = new Etape(val);
		etape.valide=false;
		
		
		switch (val)
		{
		case 25 :  if (nbEtapes25<6) 
			{
				etape.valide=true;
				nbEtapes25++;
			}
		break;
		
		case 50 :  if (nbEtapes50<6) 
			{
				etape.valide=true;
				nbEtapes50++;
			}
		break;
		
		case 75 :  if (nbEtapes75<6) 
			{
				etape.valide=true;
				nbEtapes75++;
			}
		break;
		
		case 100 :  if (nbEtapes100<9) 
			{
				etape.valide=true;
				nbEtapes100++;
			}
		break;
		
		case 200 :  if (nbEtapes200<3)
			{
				etape.valide=true;
				nbEtapes200++;
			}
		break;
		
		default:
			{
				etape.valeurEtape=0;
			
		
			}
		break;
		}
		
		return etape;
	}
}
	
	




