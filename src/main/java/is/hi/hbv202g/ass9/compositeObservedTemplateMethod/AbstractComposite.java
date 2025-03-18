package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComposite implements MathExpression, Observer {
    // Protected list so subclasses can access it
    protected List<MathExpression> children = new ArrayList<>();

    // Common add method
    public void add(MathExpression component) {
        children.add(component);
    }

    // Template method for calculating the result
    public int getResult() {
        int result = getInitialValue();
        for (MathExpression child : children) {
            result = combine(result, child.getResult());
        }
        return result;
    }

    // Each subclass defines the starting value (e.g., 0 for addition, 1 for multiplication)
    protected abstract int getInitialValue();

    // Each subclass defines how to combine the current result with a child's result
    protected abstract int combine(int a, int b);

    // The update() method is common for both types
    public void update() {
        int lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    // Same common method for both
    public int getLastObservedResult() {
        return getResult();
    }
}
