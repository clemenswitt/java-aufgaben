public class Punkt {
    private int x;
    private int y;

    public Punkt(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double gibAbstand(Punkt p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
