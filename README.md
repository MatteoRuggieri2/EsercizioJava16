# Collection

## ContaOccorrenzeParoleDaKeyboard

L'obiettivo di questo esercizio è l'utilizzo di **Map**, **loop** e **Scanner**.

Creare la classe `ContaOccorrenzeParoleDaKeyboard`, e codificare l'esercizio all'interno del metodo `main()`.
Per questo esercizio i test JUnit **non sono previsti**.

Chiedere all'utente una stringa con **n** parole separate da spazi utilizzando `Scanner(System.in)` e `sc.nextLine()`.

### Output

- Stampare una stringa con le **parole digitate**
_(Utilizzare StringBuilder per comporla)_

- Stampare per ogni parola il **numero di occorrenze**
_Utilizzare `map.entrySet()` all'interno del foreach per iterare nell'HashMap in maniera ottimizzata._

- Stampare la **parola con più occorrenze**
_Se più parole hanno lo stesso numero di
occorrrenze massimo, stampare solo la prima
individuata._

### Consigli

Per comporre la stringa contenente le parole digitate dall'utente, utilizza `StringBuilder`.

Per tenere traccia delle occorrenze e associarle alle parole, utilizza `Map<K,V> myMap = new HashMap<K,V>()`.
