package Bornes;

public class JoueurSecondaire extends JoueurHumain {
	
	public JoueurSecondaire(String nom)
	{
		this.nom=nom;
		peutAvancer=true;
		compteurEtape=0;
		nbEtapes200=0;
	}

}
