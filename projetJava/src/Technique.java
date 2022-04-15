
public class Technique extends Formation{
       private String description;
       private Employe tab[];
       private int eff=0;
       private String nom;
       
       public Technique(int nb,double prix,int max,String nom)
       {
    	   super(nb,prix,max);
    	   tab=new Employe[max];
    	   description="Recevoir une formation professionnelle technicien d'exploitation peut am�liorer vos perspectives d'emploi dans le secteur des installations hydrauliques et �nerg�tiques et vous permettre plus facilement d��tre promu. Suivre une formation tout en continuant � continuant � travailler en parall�le implique que vous soyez motiv� et capable de bien organiser votre temps";
    	   this.nom=nom;
       }
       
       
       public void ajout(Employe E)
       {
    	   if(eff<tab.length)
    	   {   if((E instanceof Technicien) || (E instanceof Manutentionnaire))
    	     {
    		   tab[eff++]=E;
    	      }
    	   }
       }
       public void afficher()
       {
    	   for(int i=0;i<eff;i++)
    	   {
    		   System.out.println(tab[i].toString());
    	   }
       }
       public void affiche()
       {
    	 	 System.out.println("description :"+description);
       }
       
}
