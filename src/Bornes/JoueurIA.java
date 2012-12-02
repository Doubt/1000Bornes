package Bornes;

public class JoueurIA extends Joueur {
	
	public JoueurIA(String nom)
	{
		this.nom=nom;
		peutAvancer=true;
		compteurEtape=0;
		nbEtapes200=0;
	}

}
