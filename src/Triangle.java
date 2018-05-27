public class Triangle {
    int max;
    int bokB;
    int bokC;

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
