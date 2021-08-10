package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //КОДЪТ Е УЖАСЕН! РАБОТИ, НО ТРЯБВА ДА СЕ РЕФАКТОРИРА...
        //OPERATION ИНТЕРФЕЙСА ТРЯБВА ДА ИМА ДРУГИ МЕТОДИ ИДЕНТИЧНИ ЗА ВСИЧКИ
        //В ТЕКУЩИЯТ СЛУЧАЙ ИМА МЕТОД ЗА ВСЕКИ ПО ОТДЕЛНО

        CalculationEngine engine = new CalculationEngine();
        InputInterpreter interpreter = Extensions.buildInputInterpreter(engine);
        String[] tokens = scanner.nextLine().split("\\s+");

        for (String token : tokens) {
            if (token.equals("end")){
                break;
            }
            interpreter.interpret(token);
        }
        System.out.println(engine.getSum());

    }
}
