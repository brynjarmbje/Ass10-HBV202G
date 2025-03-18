package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {

    int value;

    public NumberLeaf(int i) {
        value = i;
    }

    @Override
    public int getResult() {
        return value;
    }

}
