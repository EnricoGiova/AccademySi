package giorno4;

import java.util.ArrayList;

public class Pietanza {

	

		private String nome;
		private String ingrediente;
		private double prezzo;
		private ArrayList<String> ingredienti=new ArrayList<String>();
		
		public ArrayList getIngredienti() {
			
			return ingredienti;
		}
		
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public void setIngredienti(String ingrediente) {
			ingredienti.add(ingrediente);
		}


		public Pietanza(String nome,double prezzo){
			this.nome=nome;
			this.prezzo=prezzo;
			ingredienti.add("");
		}
		public String getIngrediente() {
			return ingrediente;
		}

		public void setIngrediente(String ingrediente) {
			this.ingrediente = ingrediente;
			ingredienti.add(ingrediente);
		}

		

		
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		@Override
		public String toString() {
			return "Pietanza [nome=" + nome + ", prezzo=" + prezzo + ", ingredienti=" + ingredienti + "]";
		}
		
		
	}

