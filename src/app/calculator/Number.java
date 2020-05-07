package app.calculator;

// 초기 버전
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
