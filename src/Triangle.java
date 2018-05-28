public class Triangle {
    private int max;
    private int bokB;
    private int bokC;

    public void setMax(int max) {
        this.max = max;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public Triangle(int max, int bokB, int bokC) {
        this.max = max;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public void setBokC(int bokC) {
        this.bokC = bokC;
    }

    public int getMax() {
        return max;
    }

    public int getBokB() {
        return bokB;
    }

    public int getBokC() {
        return bokC;
    }

    void findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                max = a;
                bokB = b;
                bokC = c;
            } else {
                max = c;
                bokB = a;
                bokC = c;
            }
        } else if (b > c) {
            max = b;
            bokB = a;
            bokC = c;
        } else {
            max = c;
            bokB = a;
            bokC = b;
        }


    }
}
