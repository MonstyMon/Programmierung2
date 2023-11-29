public class SiebDesEratosthenes {

    /* Bekommt als Parameter einen Integer-Wert und einen Array überliefert,
    filtert aus dem Array alle Vielfachen der Zahl x und erstellt einen neuen Array der korrekten Länge, welcher
    daraufhin mit x und allen Nicht-Vielfachen gefüllt wird. Dieser Array wird zurückgegeben. */
    public static int[] deleteMultiple(int x, int[] array) throws IllegalArgumentException, NullPointerException {
        if (x <= 0) throw new IllegalArgumentException("x muss positiv sein");
        if (array == null) throw new NullPointerException("Array darf nicht leer sein");
        for(int i = 0; i < array.length; i++){
            if (array[i]<0) throw new IllegalArgumentException("Kein Element des Arrays darf negativ sein");
        }

        int counter = array.length;

        // Liefert einen Array zurück bei dem der Wert aller Vielfachen von x auf 0 gesetzt worden ist
        for (int i = 0; i<array.length; i++) {
            if (array[i] != x) {
                if ((array[i] % x) == 0){
                    array[i] = 0;
                    counter--;
                }
            }
        }

        int[] finalArray = new int[counter];
        int elementInArray = 0;

        // Der neue finalArray wird mit den Werten aus dem Ausgangs-Array gefüllt, welche ungleich 0 sind
            for (int i = 0; i < array.length; i++){
               if(array[i] != 0) {
                   finalArray[elementInArray] = array[i];
                   elementInArray++;
               }
            }
        return finalArray;
    }

    /* Bekommt als Parameter einen Integer-Wert übergeben, erstellt einen Array mit den Zahlen 2 - max und
    "siebt" aus ihm die Primzahlen heraus, wobei die Methode deleteMultiple aufgerufen wird.
    Der Rückgabe-Wert ist ein Array aus all den Primzahlen von 0-max. */
    public static int[] eratoSieve(int max){
        if(max < 0) throw new IllegalArgumentException("max muss 0 oder größer sein");

        if(max == 0){
            max++;
        }

        int[] maxArray = new int[max-1];

        // Dem Array werden die Werte von 2 bis max zugewiesen
        for (int i = 0; i < maxArray.length; i++){
            maxArray[i] = i+2;
        }

        // Für jedes Element in dem Array wird die Methode deleteMultiple aufgerufen
        for(int i=2;i<maxArray.length;i++){
            maxArray = deleteMultiple(i, maxArray);
        }
        return maxArray;
    }
}
