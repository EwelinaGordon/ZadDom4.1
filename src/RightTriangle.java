public class RightTriangle {

    Triangle trg = new Triangle();

    public boolean isRightTriangle(Triangle trg) {

        boolean result = trg.getMax() * trg.getMax() == (trg.getBokB() * trg.getBokB()) + (trg.getBokC() * trg.getBokC());
        return result;
    }
}
