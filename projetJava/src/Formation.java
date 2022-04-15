
public abstract class Formation {
     protected int nombreH;
     protected String description;
     protected double prix;
     protected int max;
     
     public Formation(int nb,double prix,int max)
     {
    	nombreH=nb;
    	this.prix=prix;
    	this.max=max;
    	
     }
     public abstract void ajout(Employe E);
     public abstract void afficher();
     public void affiche()
     {
    	 System.out.println("nombre d'heures d'une formation: "+nombreH+" prix: "+prix);
   
     }
     
}
