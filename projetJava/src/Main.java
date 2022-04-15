
public class Main {
   public static void main(String [] args)
   {
	   Employe E1=new Technicien("technicien1","nomtechn1","12/11/2020",1234,30,20);
	   Employe E2=new Vendeur("vend1","pre","14/5/2021",2145,30,40);
	   System.out.println(E1.calculer_salaire());
	   System.out.println(E1);
	   System.out.println(E2.calculer_salaire());
	   System.out.println(E2);
	   Formation F1=new Technique(4,12.0,100,"formation Technicien");
	   F1.ajout(E1);
	   F1.ajout(E2);
	   F1.affiche();
	   F1.afficher();
	   Formation F2=new Marketing(5,14.0,50,"formation Marketing");
	   F2.ajout(E1);
	   F2.ajout(E2);
	   F2.affiche();
	   F2.afficher();
	   
	   
   }
}
