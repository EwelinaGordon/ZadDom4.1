public class Max {




    Triangle findMax(int a, int b, int c) {
        Triangle trg = new Triangle();
        if (a > b) {
            if (a > c) {
                trg.setMax(a);
                trg.setBokB(b);
                trg.setBokC(c);
            } else {
                trg.setMax(c);
                trg.setBokB(a);
                trg.setBokB(b);
            }
        } else if (b > c) {
            trg.setMax(b);
            trg.setBokB(a);
            trg.setBokC(c);
        } else {
            trg.setMax(c);
            trg.setBokB(a);
            trg.setBokC(b);
        }
        return trg;
    }
}
