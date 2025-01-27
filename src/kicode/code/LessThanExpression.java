package kicode.code;

import kicode.VirtualMachine;

public class LessThanExpression extends BooleanSymbolExpression {

    public LessThanExpression(NumericExpression lhs, NumericExpression rhs) {
        super(lhs, rhs);
    }

    public LessThanExpression() {
        super();
    }

    @Override
    public Boolean evaluate(VirtualMachine vm) {
        return lhs.evaluate(vm) < rhs.evaluate(vm);
    }

    @Override
    public String getSymbol() {
        return "<";
    }
}
