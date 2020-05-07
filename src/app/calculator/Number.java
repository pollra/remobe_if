package app.calculator;

import java.util.HashMap;
import java.util.Map;

// 람다식 미사용
public class Number {
    private static Map<String, Calculate> actions = new HashMap<>();

    static {
        actions.put(Calculation.PLUS.expression,     Calculation.PLUS.calculate);
        actions.put(Calculation.SUBTRACT.expression, Calculation.SUBTRACT.calculate);
        actions.put(Calculation.MULTIPLY.expression, Calculation.MULTIPLY.calculate);
        actions.put(Calculation.DIVISION.expression, Calculation.DIVISION.calculate);
    }

    private enum Calculation {
        PLUS("+", new Calculate(){
            @Override
            public int apply(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }
        }),
        SUBTRACT("-", new Calculate(){
            @Override
            public int apply(int firstNumber, int secondNumber) {
                return firstNumber - secondNumber;
            }
        }),
        MULTIPLY("*", new Calculate(){
            @Override
            public int apply(int firstNumber, int secondNumber) {
                return firstNumber * secondNumber;
            }
        }),
        DIVISION("/", new Calculate(){
            @Override
            public int apply(int firstNumber, int secondNumber) {
                return firstNumber / secondNumber;
            }
        });

        Calculation(String expression, Calculate calculate) {
            this.expression = expression;
            this.calculate = calculate;
        }

        public String expression;
        public Calculate calculate;

    }

    public interface Calculate{
        public int apply(int firstNumber, int secondNumber);
    }

    public int calculate(String expression, int firstNumber, int secondNumber) {
        return actions.get(expression).apply(firstNumber, secondNumber);
    }
}
