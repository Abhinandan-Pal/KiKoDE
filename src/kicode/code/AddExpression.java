package kicode.code;

import kicode.VirtualMachine;

public class AddExpression extends NumericSymbolExpression {
    
    public AddExpression(NumericExpression lhs, NumericExpression rhs) {
        super(lhs, rhs);
    }
    
    public AddExpression() {
        super();
    }

    @Override
    public Double evaluate(VirtualMachine vm) {
        return lhs.evaluate(vm) + rhs.evaluate(vm);
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}
