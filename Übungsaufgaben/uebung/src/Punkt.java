public class Punkt {
    private float x;
    private float y;

    public Punkt(float u, float v){x = u; y = v;}
    public float getX(){return x;}
    public float getY(){return y;}
    public void verschiebe(float vx, float vy) {
    }

    public void toString(int x, int y){
        String a = "1";
        String b = Integer.toString(y);
        System.out.println("("+a +","+b+")");
    }
}

