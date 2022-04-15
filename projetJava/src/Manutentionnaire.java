

public class Manutentionnaire extends Employe {
   protected int heures;
   public Manutentionnaire(String n,String p,String d,int id,int a,int h)
   {
	   super(n,p,d,id,a);
	   heures=h;
   }
   
   public double calculer_salaire(){
	   return (65.0*heures);
   }
   public String toString()
   {
   	return "Le Manutentionnaire " + prenom + ' ' + nom;
   }
}