
public class Technicien extends Employe {
   protected int unites;
   public Technicien(String n,String p,String d,int id,int a,int u)
   {
	   super(n,p,d,id,a);
	   unites=u;
   }
   
   public double calculer_salaire(){
	   return (0.5*unites);
   }
   public String toString()
   {
   	return "Le technicien " + prenom + ' ' + nom;
   }
}

