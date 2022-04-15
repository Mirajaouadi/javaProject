
public abstract class Commercial extends Employe {
     protected double chiffre_affaire;
     public Commercial(String n,String p,String d,int id,int a,double chiffre_affaire)
     {
    	 super(n,p,d,id,a);
    	 this.chiffre_affaire=chiffre_affaire;
     }
}

