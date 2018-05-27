public class RightTriangle {

    Triangle trg = new Triangle();

    public boolean isRightTriangle(Triangle trg) {

        boolean result = trg.max * trg.max == (trg.bokB * trg.bokB) + (trg.bokC * trg.bokC);
        return result;
    }
}
