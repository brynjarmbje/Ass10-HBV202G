package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> children=new ArrayList<MathExpression>();

    public void add(MathExpression component) {
        children.add(component);
    }

    public int getResult() {
        int result=0;
        for (MathExpression child : children) {
            child.getResult();
            result+=child.getResult();
        }
        return result;
    }

    public void update() {
        int lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return getResult();
    }
}
