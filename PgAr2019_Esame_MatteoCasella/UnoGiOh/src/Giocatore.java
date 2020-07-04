/**
 * Con la classe Giocatore inizializzo un giocatore con il suo nome ed il suo mazzo
 */


public class Giocatore {
	
	private String nome;
	private Mazzo mioMazzo;

	public Giocatore(String nome) {
		super();
		this.nome = nome;
	}


	/**Confronta i nomi dei giocatori
	 * @param player1 nome del primo giocatore 
	 * @param player2 nome del secondo giocatore 
	 * @return "true" se i nomi sono uguali
	 */
	public boolean nomeUguale(Giocatore player1, Giocatore player2)
	{
		if(player1.nome.equalsIgnoreCase(player2.nome))
			return true;
		else return false;
	}

	/**
	 *
	 * @param player1 nome del Giocatore 1
	 * @param player2 nome del Giocatore 2
	 * @return Stringa avvertimento
	 */
	public String stessoNome(Giocatore player1, Giocatore player2)
	{
		
		if(nomeUguale(player1, player2)==true)
			
			return Utility.STESSO_NOME;
		
		else
			
			return "\nChe la partita tra " + player1.nome + " e " + player2.nome  + " abbia inizio!\n";
			
	}
}
