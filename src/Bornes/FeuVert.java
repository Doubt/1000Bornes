package Bornes;

public class FeuVert extends Parade {
	
	private static int nbFeuVerts=0;
	
	private FeuVert (){
		nbFeuVerts++;
	}
	
	public FeuVert instanciate()
	{
		FeuVert feuVert = new FeuVert();
		
		if (nbFeuVerts<=5)
		{	
			feuVert.valide=true;
			
		}
		else
		{
			feuVert.valide=false;
		}
		return feuVert;
	}

}
