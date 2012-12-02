package Bornes2;

import Bornes2.Attaque.typeAttaque;
import Bornes2.Botte.typeBotte;
import Bornes2.Parade.typeParade;

public class Joueur {
	
	private JeuDuJoueur jeu;
	private MainDuJoueur main;
	
	protected String nom;
	protected int estAccidente;
	protected int estEnPanne;
	protected int estAuFeuRouge;
	protected int estCreuve;
	protected int estLimite;
	protected int compteurEtape;
	protected int nbEtapes200;
	

	
	
	public Joueur(String nom)
	{
		this.nom=nom;
		this.compteurEtape=0;
		this.estAccidente=0;
		this.estAuFeuRouge=1;	
		this.estCreuve=0;
		this.estEnPanne=0;
		this.estLimite=0;
		this.nbEtapes200=0;
		
	}
	
	public void Attaquer (Attaque.typeAttaque type)
	{
		
		if (type == typeAttaque.accident )
		{
			this.estAccidente=1;
		}
		
		if (type == typeAttaque.creuvaison )
		{
			this.estCreuve=1;
		}
		
		if (type == typeAttaque.feuRouge )
		{
			this.estAuFeuRouge=1;
		}
		
		if (type == typeAttaque.limitationDeVitesse )
		{
			this.estLimite=1;
		}
		
		if (type == typeAttaque.panneDEssence )
		{
			this.estEnPanne=1;
		}
		
	
	}
	
	public void Parer(Parade.typeParade type)
	{
		
		if (type == typeParade.reparation )
		{
			this.estAccidente=0;
		}
		
		if (type == typeParade.roueDeSecours )
		{
			this.estCreuve=0;
		}
		
		if (type == typeParade.feuVert )
		{
			this.estAuFeuRouge=0;
		}
		
		if (type == typeParade.finDeLimitationDeVitesse )
		{
			this.estLimite=0;
		}
		
		if (type == typeParade.essence )
		{
			this.estEnPanne=0;
		}
		
	}
	
	public void Avancer (Etape etape)
	{
		this.compteurEtape+=etape.getVal();
	
	}
	
	public void Avancer (int nb)
	{
		this.compteurEtape+=nb;
	
	}
	
	public void Botter(Botte.typeBotte type)
	{
		
			
			if (type == typeBotte.asDuVolant )
			{
				this.estAccidente=2;
			}
			
			if (type == typeBotte.increuvable )
			{
				this.estCreuve=2;
			}
			
			if (type == typeBotte.prioritaire )
			{
				this.estAuFeuRouge=2;
				this.estLimite=2;
			}
			
			if (type == typeBotte.citerne )
			{
				this.estEnPanne=2;
			}
			
		
	}
	
	
}
