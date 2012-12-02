package Bornes;

public class RoueDeSecours extends Parade {
	
	private static int nbRoueDeSecourss=0;
	
	private RoueDeSecours (){
		nbRoueDeSecourss++;
	}
	
	public RoueDeSecours instanciate()
	{
		RoueDeSecours roueDeSecours = new RoueDeSecours();
		
		if (nbRoueDeSecourss<=4)
		{	
			roueDeSecours.valide=true;
			
		}
		else
		{
			roueDeSecours.valide=false;
		}
		return roueDeSecours;
	}

}
