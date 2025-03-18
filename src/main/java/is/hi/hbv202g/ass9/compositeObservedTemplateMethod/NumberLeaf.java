package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class NumberLeaf extends Observable implements MathExpression {

    int value;

    public NumberLeaf(int i) {
        value = i;
    }

    @Override
    public int getResult() {
        return value;
    }

    public void setValue (int i) {
        value = i;
        notifyObservers();
    }


}
