package Calculator;

import java.util.ArrayDeque;

public class MemorySave implements Operation{
    private ArrayDeque<Integer> memory;

    public MemorySave(ArrayDeque<Integer> memory) {
        this.memory = memory;
    }

    @Override
    public int operateWithNum(int firsNum, int secondNum) {
        return 0;
    }

    @Override
    public void operateWithMemory(int num) {
        memory.push(num);
    }

    @Override
    public int secondNum() {
        return 0;
    }
}
