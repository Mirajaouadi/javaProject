
public class TechnARisque extends Technicien implements ARisque {
    public TechnARisque(String n,String p,String d,int id,int a,int u)
    {
    	super(n,p,d,id,a,u);
    }
    
    public double calculer_salaire()
    {
    	return super.calculer_salaire()+prime;
    }
}
