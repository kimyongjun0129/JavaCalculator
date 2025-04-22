package lv3;

import java.util.Optional;

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
            default: {
                System.out.println("잘못된 연산자입니다.");
                op = Operator.NONE;
            }
        }
        a = firstNum;
        a1 = secondNum;
    }

    // 기능
    public Optional<Double> calculate() {
        double result;
        switch(op) {
            case Operator.PLUS: {
                result = a.doubleValue() + a1.doubleValue();
                System.out.println(a.doubleValue() + " + " + a1.doubleValue() + " = " + result);
                return Optional.of(result);
            }
            case Operator.MINUS: {
                result = a.doubleValue() - a1.doubleValue();
                System.out.println(a.doubleValue() + " - " + a1.doubleValue() + " = " + result);
                return Optional.of(result);
            }
            case Operator.MULTIPLY: {
                result = a.doubleValue() * a1.doubleValue();
                System.out.println(a.doubleValue() + " * " + a1.doubleValue() + " = " + result);
                return Optional.of(result);
            }
            case Operator.DIVIDE: {
                if(a1.doubleValue() == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return Optional.empty();
                }
                result = a.doubleValue() / a1.doubleValue();
                System.out.println(a.doubleValue() + " / " + a1.doubleValue() + " = " + result);
                return Optional.of(result);
            }
            default: {
                return Optional.empty();
            }
        }
    }
}
