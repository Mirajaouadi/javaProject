
public class Marketing extends Formation{
	  private String description;
      private Employe tab2[];
      private int eff=0;
      private String nom;
      
      public Marketing(int nb,double prix,int max,String nom)
      {
   	   super(nb,prix,max);
   	   tab2=new Employe[max];
   	   description="La formation marketing a pour but de former des professionnels de la relation client dans le domaine de la vente ainsi que de la stratégie commerciale. Grâce à la formation, les étudiants acquièrent une bonne maîtrise des outils et des techniques de la communication.";
   	   this.nom=nom;
      }
      
      
      public void ajout(Employe E)
      {
   	   if(eff<tab2.length)
   	   {   if((E instanceof Vendeur) || (E instanceof Commercial))
   	     {
   		   tab2[eff++]=E;
   	      }
   	   }
      }
      public void afficher()
      {
   	   for(int i=0;i<eff;i++)
   	   {
   		   System.out.println(tab2[i].toString());
   	   }
      }
      public void affiche()
      {
    	 	 System.out.println("description :"+description);
      }
}
