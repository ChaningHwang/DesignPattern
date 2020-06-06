package calculator;

public class OperationSub extends Operation {
    @Override
    public double GetResult() {
        double result=0;
        result = this.getNumberA() - this.getNumberB();
        return result;
    }
}
