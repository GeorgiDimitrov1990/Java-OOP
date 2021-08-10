package Calculator;

public class DivisionOperation implements Operation{

    @Override
    public int operateWithNum(int firsNum, int secondNum) {
        return firsNum / secondNum;
    }

    @Override
    public void operateWithMemory(int num) {

    }

    @Override
    public int secondNum() {
        return 0;
    }


}
