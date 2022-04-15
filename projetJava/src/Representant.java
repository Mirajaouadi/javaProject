
public class Representant extends Commercial {
    public Representant(String n,String p,String d,int id,int a,double chiffre_affaire)
    {
    	super(n,p,d,id,a,chiffre_affaire);
    }
    public double calculer_salaire()
    {
    	return (0.2*chiffre_affaire)+800;
    }
    public String toString()
    {
    	return "Le representant " + prenom + ' ' + nom;
    }
    
    
}
