package giorno5;

import java.util.ArrayList;

public class MainEsercitazione {
	public static void main(String[] args) {
		
	
	Somma somma1=new Somma();
	somma1.setA(1);
	somma1.setB(3);
	//somma generica fra i variabili passati con i metodi o con il costruttore
	
	System.out.println(somma1.sommaNumeri());
	
	
	Somma somma2=new Somma();
	somma2.sommaNumeri(5,7);
	
	
	Contrario contrario=new Contrario("Ciao");
	System.out.println(contrario.inverti());
	
	Integer numero;
	Integer numero1=2;
	Integer numero2=4;
	Integer numero3=6;
	Integer numero4=8;
	Integer numero5=10;
	
	ArrayList numeriMedia=new ArrayList<>();
	numeriMedia.add(numero1);
	numeriMedia.add(numero2);
	numeriMedia.add(numero3);
	numeriMedia.add(numero4);
	numeriMedia.add(numero5);
	Media provaMedia=new Media(numeriMedia);
	provaMedia.eseguiMedia();
	
	
			
	
	int[] a = {2,4,6,8,10};
	System.out.println(media(a));
	
	
		
	}
	//metodo più intelligente di quello fatto nella classe
	//questa vlta inseriamo un array invece che un arraylist
	//cicliamo l'array e aggiungiamo i valori nella somma
	//per poi dividerla senza scordarsi di castarla
	//in realtà non ci sarebbe stato bisogno ma ho preferito farlo 
	
	public static double media(int[] a) {
		int somma=0;
		double media=0;
		for(int i=0;i<a.length;i++)	{
			somma+=a[i];
		}
		//somma=somma/a.length;
		//media=(double)somma;
		media=(double)(somma/a.length);
		return media;
	}
}
	
	

