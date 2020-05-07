package app.calculator;

/**
 * @since       2020.05.07
 * @author      pollra
 * @description Number
 **********************************************************************************************************************/
public class Number {
    private int no;

    public Number(int no) {
        this.no = no;
    }

    public Number calculate(String expression, Number number) {
        if ("+".equals(expression)) {
            return new Number(this.no + number.no);
        }

        if ("-".equals(expression)) {
            return new Number(this.no - number.no);
        }

        if ("*".equals(expression)) {
            return new Number(this.no * number.no);
        }

        if ("/".equals(expression)) {
            return new Number(this.no / number.no);
        }

        throw new IllegalArgumentException();
    }
}
