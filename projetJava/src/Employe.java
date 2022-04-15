
public abstract class Employe {
    protected String nom,prenom,date_entree;
    protected int id,age;
    
    public Employe(String n,String p,String d,int id,int a)
    {
    	nom=n;
    	prenom=p;
    	date_entree=d;
    	this.id=id;
    	age=a;
    }
    public abstract double calculer_salaire();
    public String toString()
    {
    	return "L'employé " + prenom + ' ' + nom;
    }
    
    public int getid()
    {
    	return id;
    }
    
    
}
