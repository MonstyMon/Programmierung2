public class Figur {
    private Punkt anker;

    public Figur(Punkt p){
        anker = p;
    }

    public void setAnker(Punkt p){
        anker = p;
    }
    public Punkt getAnker(){
        return anker;
    }
    public void verschiebeAnker(int x, int y){
        anker.verschiebe(x, y);
    }


}
