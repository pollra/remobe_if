package app.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

// 람다식 사용
public class Calculator {
    private static final Map<String, BiFunction<Integer, Integer, Integer>> actions = new HashMap<>();

    static {
        actions.put("+", (a, b) -> a + b);
        actions.put("-", (a, b) -> a - b);
        actions.put("*", (a, b) -> a * b);
        actions.put("/", (a, b) -> a / b);
    }

    public static Integer calculate(String expression, int firstNumber, int secondNumber) {
        return actions.get(expression).apply(firstNumber, secondNumber);
    }
}
