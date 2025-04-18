package lv3;

public class ArithmeticCalculator <T extends Number> {
    // 속성
    Operator op;
    T a;
    T a1;

    // 생성자
    public ArithmeticCalculator(T firstNum, char operator, T secondNum) {
        switch(operator) {
            case '+': {
                op = Operator.PLUS;
                break;
            }
            case '-': {
                op = Operator.MINUS;
                break;
            }
            case '*': {
                op = Operator.MULTIPLY;
                break;
            }
            case '/': {
                op = Operator.DIVIDE;
            }
        }
        a = firstNum;
        a1 = secondNum;
    }

    // 기능
    public Double calculate() {
        switch(op) {
            case Operator.PLUS: {
                double sum = a.intValue() + a1.intValue();
                System.out.println(a.intValue() + " + " + a1.intValue() + " = " + sum);
                return sum;
            }
            case Operator.MINUS: {
                double minus = a.intValue() - a1.intValue();
                System.out.println(a.intValue() + " - " + a1.intValue() + " = " + minus);
                return minus;
            }
            case Operator.MULTIPLY: {
                double multi = a.intValue() * a1.intValue();
                System.out.println(a.intValue() + " * " + a1.intValue() + " = " + multi);
                return multi;
            }
            case Operator.DIVIDE: {
                double div = ((double)a.intValue()) / a1.intValue();
                System.out.println(a.intValue() + " / " + a1.intValue() + " = " + div);
                return div;
            }
            default: {
                return null;
            }
        }
    }
}
