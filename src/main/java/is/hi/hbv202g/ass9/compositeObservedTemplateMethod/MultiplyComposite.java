package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends AbstractComposite {

    @Override
    protected int getInitialValue() {
        return 1;
    }

    @Override
    protected int combine(int a, int b) {
        return a * b;
    }
}
