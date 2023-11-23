public class Punkt {
    private int x;
    private  int y;

    public Punkt(int u, int v){
        this.x = u;
        this.y = v;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void verschiebe(int x, int y){
        this.x += x;
        this.y += y;
    }

    public String toString(){
        return super.toString();
    }
}
