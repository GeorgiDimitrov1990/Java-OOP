package Calculator;

public class CalculationEngine {
    private Operation operation;
    private int sum;
    private boolean haveSymbol;

    public CalculationEngine() {
        operation = null;
        sum = 0;
        haveSymbol = false;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setHaveSymbol(boolean haveSymbol) {
        this.haveSymbol = haveSymbol;
    }

    public Operation getOperation() {
        return operation;
    }

    public int getSum() {
        return sum;
    }

    public boolean isHaveSymbol() {
        return haveSymbol;
    }
}
