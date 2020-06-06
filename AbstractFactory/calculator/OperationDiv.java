package calculator;

public class OperationDiv extends Operation {
    @Override
    public double GetResult() {
        double result=0;
        if(this.getNumberB()==0)
            throw new ArithmeticException("dividend cannot be zero, program closed!!");
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
