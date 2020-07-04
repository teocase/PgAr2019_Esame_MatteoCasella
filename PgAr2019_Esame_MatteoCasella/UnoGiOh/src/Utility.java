import java.util.Scanner;


/**
 * Questa classe contiene le frasi necessarie allo svolgimento del gioco e alcuni metodi "banali"
 */

public class Utility {



		public final static int NUMERO_SLOT = 4; //costanti preimpostate
		public final static int NUMERO_GOLEM = 4;
		public final static int TIPI_NANI = 7;
		public final static int SACCO_COMUNE = 35; 
		public final static int LIFE = 15;
		public final static int VALORE_MAX = 15;
		public final static int VALORE_MIN = -VALORE_MAX;
		public final static String CORNICE = "****************************************************************\n";
		public final static String BENVENUTI = "Benvenuti nel  magico mondo dei Golem che si lanciano i 7 nani!!\n";
		public final static String ISTRUZIONI = "--- ISTRUZIONI ---\nSiete due allenatori di speciali Golem in grado di lanciarsi i 7 nani di Biancaneve:\nviene creato CASUALMENTE un equilibrio del mondo magico che stabilisce tutte le interazioni possibili fra i 7 nani;"
				+ " ognuno di loro vincera' lo scontro con alcuni degli altri, ma perdera' contro i rimanenti.\nL'OBIETTIVO di ogni giocatore e' capire come funzionano le interazioni tra i nani all'interno del mondo magico, basandosi sugli esiti degli scontri: le interazioni vengono generate CASUALMENTE "
				+ "a inizio partita e rimangono tali fino alla fine di essa. \nCiascun giocatore avra' a disposizione 4 Golem che si sfideranno sul campo di battaglia.\n" +
				"Ogni giocatore puo' scegliere i 4 nani che il suo Golem utilizzera' nello scontro che avverra' con le seguenti modalita':\n\n1. Sceglierete i nani da assegnare al vostro golem da un sacco comune (formato da 35 nani, 5 scelte per ognuno).\n2. Ogni Golem ha 15 punti vita.\n3. Il primo nano scelto, si sfidera' contro il primo nano scelto "  + 
				"dall'avversario e cosi' vale per i successivi; i nani si sfideranno nello stesso ordine finche' la vita di uno dei due Golem si azzera.\n4. Quando i due nani si scontrano, vince il nano piu' forte, il quale infliggera' " +
				"danni pari all'interazione stabilita dall'equilibrio iniziale.\n5. Quando il golem perde tutta la vita, il suo giocatore potra' evocarne uno nuovo e assegnargli altri 4 nani, presi sempre dal sacco comune.\n6. "
				+ "Vince la partita il giocatore che sconfigge tutti i golem dell'avversario.\n\n\nQuando vedrai questo simbolo: '\\n' significa che dovrai premere invio per andare avanti.\n\n";
		
		public static final String NOME_PLAYER1 = "Inserisci il nome del primo giocatore: ";
		public static final String NOME_PLAYER2 = "Inserisci il nome del secondo giocatore: ";
		public static final String INIZIO_SCONTRO = "I due Golem sono stati evocati nell'arena. E' il momento di combattere!";
		public final static String ELENCO_NANI = " Golem: ";
		public static final String SCORTA_COMUNE = "Prendi il tuo nano da questo sacco:";
		public static final String SCELTA_NANO = "\nScegli il nano ";
		public static final String SACCO_NANI_UGUALE = "Avete davvero scelto tutti i nani uguali? Am I a joke to you?? Rifate la scelta!";
		public static final String NANI_UGUALI = "I nani lanciati sono uguali; nessuno ha perso vita";
		public static final String NUOVA_EVOCAZIONE =", premi invio per evocare un nuovo Gollum!";
		public static final String VINCITORE ="Il vincitore e' ";
		public static final String GOLEM_AVVERSARIO = ", il tuo avversario ha il seguente ";
		public final static String CONSIGLI = "Ti ricordo che l'obiettivo del gioco e' capire come funzionano le interazioni tra i nani: per fare la tua prossima scelta, basati sull'esito dello scontro precedente"
				+ " per riuscire a sconfiggere il Golem dell'avversario";

		public static final String STESSO_NOME = "Non potete inserire un nome uguale, se no come faccio a distinguervi?\n";
		public static final String DATO_SCORRETTO = "Il dato inserito non e' corretto: riprova\n";
		public static final String NUOVA_PARTITA = "\nVuoi giocare una nuova partita?";
		public static final String BRAO = "Bravo, almeno una scelta giusta la fai ogni tanto!\\n";
		public static final String FINE_PARTITA = "Meglio cosi' dai, anche perche' fai pena a questo gioco!\\n";
		
		
		Scanner lettore = new Scanner(System.in);

	/**
	 *
	 */
	public Utility()
		{
			
		}

	/**
	 * Mette in pausa il gioco aspettando un invio da utente.
	 * Utilizzato per rendere piu' scorrevole la lettura
	 */
		public void avanti()
		{
			System.out.println("\n\\n\n");
			lettore.nextLine();
		}

	/**
	 * Metodo che chiede e legge se l'utente voglia giocare un'altra partita
	 * @return "true" quando si vuole giocare una nuova partita
	 */
		public boolean restart ()
		{
			System.out.println(NUOVA_PARTITA);
			String str = InputDati.leggiStringaNonVuota("[YES/NO]: ");
			if(str.equalsIgnoreCase("yes"))
			{
				System.out.println(BRAO);
				return true;
			}
			else
			{
				System.out.println(FINE_PARTITA);
				return false;
			}
		}

	/**
	 * Metodo che stampa a video il benvenuto e le regole iniziali
	 */
		public void inizio()
		{
			System.out.println(Utility.CORNICE);
			System.out.println(Utility.BENVENUTI);
			System.out.println(Utility.CORNICE);
			System.out.println(Utility.ISTRUZIONI);
			System.out.println(Utility.CORNICE);
		}
}
