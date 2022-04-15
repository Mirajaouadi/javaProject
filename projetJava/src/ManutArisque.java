
public class ManutArisque extends Manutentionnaire implements ARisque{
	 
	    public ManutArisque(String n,String p,String d,int id,int a,int h)
	    {
	    	super(n,p,d,id,a,h);
	    }
	    
	    public double calculer_salaire()
	    {
	    	return super.calculer_salaire()+prime;
	    }
}

