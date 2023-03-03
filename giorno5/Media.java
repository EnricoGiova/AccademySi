package giorno5;

import java.util.ArrayList;

public class Media {
		private double somma=0;
		private ArrayList<Integer> serieNumeri= new ArrayList<Integer>();

		public Media(ArrayList<Integer> serieNumeri) {
			
			super();
			this.serieNumeri = serieNumeri;
		}
		public double eseguiMedia() {
			for(Integer numero:serieNumeri) {
				somma+=(double)numero.intValue();
				
			}
			somma=somma/serieNumeri.size();
			System.out.println(somma);
			return somma;
		}
		
		
}
