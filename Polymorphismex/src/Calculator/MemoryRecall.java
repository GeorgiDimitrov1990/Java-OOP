package Calculator;

import java.util.ArrayDeque;

public class MemoryRecall implements Operation{
    private ArrayDeque<Integer> memory;

    public MemoryRecall(ArrayDeque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public int operateWithNum(int firsNum, int secondNum) {
        return 0;
    }

    @Override
    public void operateWithMemory(int num) {

    }
    @Override
    public int secondNum(){
        return memory.pop();
    }
}
