package esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ContaOccorrenzeParoleDaKeyboard {

	public static void main(String[] args) {
		ContaOccorrenzeParoleDaKeyboard contaOccorrenzePDK = new ContaOccorrenzeParoleDaKeyboard();
		contaOccorrenzePDK.run();
	}
	
	private void run() {
		Map<String, Integer> wordsOccurrences = new HashMap<>();
		
		// Leggo la stringa digitata dall'utente
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci più parole separati da uno o più spazi: ");
		String userString = readUserInputString(sc);
		System.out.println("\nStringa digitata: \"" + userString + "\"");
		
		// Splitto la stringa dell'utente
		String[] userSplittedString = splitString(userString.trim(), " +");
		
		// Funzione che crea la stringa con tutte le parole digitate
		String wordListString = createWordListString(userSplittedString);
		System.out.println("\n" + wordListString);
		
		// Conto le occorrenze
		wordsOccurrences = occurrencesCounter(userSplittedString);
		System.out.println("Conteggio occorrenze: " + wordsOccurrences);
		
		// Prendo la parola con più occorrenze e la stampo
		String wordWhitMoreOccurrencesSentence = getWordWhitMoreOccurrencesSentence(wordsOccurrences);
		System.out.println(wordWhitMoreOccurrencesSentence);
		
		sc.close();
	}

	
	
	
	// Questa funzione legge la input dell'utente
	private String readUserInputString(Scanner sc) {
		return sc.nextLine();
	}
		
	// Questa funzione splitta la stringa il separatore passati come argomenti
	private String[] splitString(String string, String separator) {
		return string.split(separator);
	}
	
	// Questa funzione crea una stringa con la lista delle parole digitate
	private String createWordListString(String[] splittedString) {
		
		StringBuilder wordListString = new StringBuilder("");
		
		for (String word : splittedString) {
			wordListString.append("- " + word + "\n");
		}
		
		return "Elenco delle parole digitate: \n" + wordListString.toString();
	}
	
	// Questa funzione ritorna una mappa con associazioni stringa-numero di occorrenze
	private Map<String, Integer> occurrencesCounter(String[] arrStringsToCount) {
		Map<String, Integer> occurrences = new HashMap<>();
		
		/* Per ogni parola dell'array SE è presente la chiave incremento
		 * il suo valore, altrimenti creo un nuovo elemento con la stringa
		 * come chiave e inizializzo il valore a 1.
		 */
		for (String string : arrStringsToCount) {
			
			String stringLC = string.toLowerCase();
			
			if (occurrences.containsKey(stringLC)) {
				
				// Prendo il numero di occorrenze della stringa corrente
				int occurrencesNumber = occurrences.get(stringLC);
				
				// Incremento di 1 il counter di occorrenze
				occurrences.put(stringLC, ++occurrencesNumber);
				
			} else {
				// Creo un nuovo elemento e lo inizializzo a 1
				occurrences.put(stringLC, 1);
			}
			
		}
		
		return occurrences;
	}
	
	// Questa funzione crea una frase che contiene la parola con più occorrenze e il numero di occorrenze
	private String getWordWhitMoreOccurrencesSentence(Map<String, Integer> wordsOccurrencesMap) {
		
		String word = "";
		int wordOccurrences = 0;
		
		/* Per ogni parola dell'entrySet SE è presente la chiave
		 * incremento il valore, ALTRIMENTI creo un elemento e 
		 * inizializzo il valore a 1.
		 */
		for (Entry<String, Integer> singleWord : wordsOccurrencesMap.entrySet()) {
			// Se il valore è maggiore di wordOccurrences salva la chiave e il valore
			
			if (singleWord.getValue() > wordOccurrences) {
				word = singleWord.getKey();
				wordOccurrences = singleWord.getValue();
			}
		}
		
		// Costruisco la stringa con "word" e "wordOccurrences"
		return "La parola \"" + word + "\" è quella con più occorrenze: " + wordOccurrences;

	}
 
}























