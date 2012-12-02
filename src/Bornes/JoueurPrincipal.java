package Bornes;

public class JoueurPrincipal extends JoueurHumain {
	
	public JoueurPrincipal(String nom)
	{
		this.nom=nom;
		peutAvancer=true;
		compteurEtape=0;
		nbEtapes200=0;
	}

}
