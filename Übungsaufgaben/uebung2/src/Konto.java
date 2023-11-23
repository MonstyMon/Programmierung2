public class Konto {

    public static final int BONUS = 15;
    float temp = 0f;
    private float kontostand;
    public float getKontostand() {
        return kontostand;
    }
    public void abheben(float summe) {
        kontostand = kontostand - summe;
    }
    public void einzahlen(float summe) {
        kontostand = kontostand + summe;
    }
    public boolean kontoIstLeer(){
        return kontostand <= 0;
    }
    public void kontoInitialisierung(){
        einzahlen(BONUS);
    }
    public void kontoLeeren(){
        kontostand = 0;
    }
    //fix abheben ohne dispo!
    public void abhebenOhneDispo(){

        do{
            abheben(1.5f);
        } while (kontostand >= 1.5f);
    }
}
