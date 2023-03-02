package Giorno4;

import java.util.ArrayList;
import java.util.Scanner;

import giorno3.Pietanza;

public class EsMenu {

	public static void main(String[] args) {
		ArrayList<Pietanza> menuTotale=new ArrayList<Pietanza>();
		ArrayList<Pietanza> Ordinazione=new ArrayList<Pietanza>();
		double somma=0;
		boolean cicloMenu=true;
		
		Pietanza piatto1= new Pietanza ("Pasta al sugo",4.00);
		Pietanza piatto2= new Pietanza ("Lasagna",6.15);
		Pietanza piatto3= new Pietanza ("Pollo",7.35);
		Pietanza piatto4= new Pietanza ("Pesce",9.95);
		Pietanza piatto5= new Pietanza ("Vino",100.10);
		
		piatto1.setIngredienti("pasta");
		piatto1.setIngredienti("sugo");
		System.out.println(piatto1.toString());
		
		piatto2.setIngrediente("pasta sfoglia");
		piatto2.setIngrediente("ragu");
		menuTotale.add(piatto1);
		menuTotale.add(piatto2);
		
		
		
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		 System.out.println("Benvenuto");
		System.out.println("Vuoi ordinare? Premi 1");
		 System.out.println("Sei entrato per sbaglio?");
		int a=x.nextInt();
		int b;
		
		if (a>0 && a<3) {
			
			while (cicloMenu=true) {
		switch (a) {		
		
				case 1:
					System.out.println("Bene, scegli cosa fare");
					System.out.println("Premi 1 se sai già cosa scegliere");
					System.out.println("Premi 2 se vuoi leggere ");
					System.out.println("il menu e visualizzare la lista ingredienti");
					System.out.println("premi 3 se vuoi pagare il conto");
					System.out.println("premi 4 se vuoi uscire");
					
					b=x.nextInt();
					while(b<5) {
						switch(b) {
						case 1:
							System.out.println("Bene, inserisci cosa vuoi ordinare");
							String c=x.nextLine();
							for( Pietanza d:menuTotale) {
								if(c.equals(d.getNome())) {
									System.out.println("hai ordinato");
									System.out.println(d.getNome());
									System.out.println("il suo prezzo è:");
									System.out.println(d.getPrezzo());
									somma+=d.getPrezzo();
									System.out.println("Vuoi Ordinare altro?");
									System.out.println("Yes/No");
									String scelta=x.nextLine();
									
									if(scelta.equals("Yes")||scelta.equals("yes")){
												b=1;								
									} else{
										
										
										cicloMenu=false;
										
									}
								}
							}
									break;
									
						case 2:
							for(Pietanza d:menuTotale) {
								System.out.println(d.toString());
								b=4;
								break;
							}		
						case 3:
							System.out.println("Bene, procediamo al pagamento");
							System.out.println("Il totale da pagare è: "+somma);
						
						case 4:
							b=4;
							break;
							
						}
					}
					break;
				case 2:
					System.out.println("Ciao Ciao, alla prossima, ti aspettiamo");
		}
		}
		}
		else {
			System.out.println("Hai sbagliato a inserire numeri");
			
		}
		
					
	}

}
