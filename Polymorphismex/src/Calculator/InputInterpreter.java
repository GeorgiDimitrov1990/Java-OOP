package Calculator;

import java.util.ArrayDeque;

public class InputInterpreter {
    private CalculationEngine engine;
    private ArrayDeque<Integer> memory;

    public InputInterpreter(CalculationEngine engine) {
        this.engine = engine;
        this.memory = new ArrayDeque<>();
    }

    public void interpret(String input) {
        if (input.equals("*")) {
            multiplication();
        } else if (input.equals("/")) {
            division();
        } else if (input.equals("ms")) {
            engine.setOperation(new MemorySave(this.memory));
            engine.getOperation().operateWithMemory(engine.getSum());
        } else if (input.equals("mr")) {
            if (engine.isHaveSymbol()) {
                Operation operation = engine.getOperation();
                engine.setOperation(new MemoryRecall(memory));
                int secondNum = engine.getOperation().secondNum();
                engine.setOperation(operation);
                engine.setSum(engine.getOperation().operateWithNum(engine.getSum(), secondNum));
                engine.setHaveSymbol(false);
            } else {
                engine.setOperation(new MemoryRecall(memory));
                engine.setSum(engine.getOperation().secondNum());
            }
        }else {
            if (engine.isHaveSymbol()) {
                int secondNumber = Integer.parseInt(input);
                engine.setSum(engine.getOperation().operateWithNum(engine.getSum(), secondNumber));
                engine.setHaveSymbol(false);
            } else {
                engine.setSum(Integer.parseInt(input));
            }
        }
    }

    private void division() {
        engine.setHaveSymbol(true);
        engine.setOperation(new DivisionOperation());
    }

    private void multiplication() {
        engine.setHaveSymbol(true);
        engine.setOperation(new MultiplicationOperation());
    }
}
