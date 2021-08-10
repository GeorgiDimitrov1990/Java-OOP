package Calculator;

public class Extensions {
    public static InputInterpreter buildInputInterpreter(CalculationEngine engine){
        return new InputInterpreter(engine);
    }
}
