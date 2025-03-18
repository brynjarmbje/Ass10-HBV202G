package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends AbstractComposite {

    @Override
    protected int getInitialValue() {
        return 0;
    }

    @Override
    protected int combine(int a, int b) {
        return a + b;
    }
}
