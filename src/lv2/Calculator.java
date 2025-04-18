package lv2;

import java.util.*;

public class Calculator {
    final private Queue<Object> resultList = new ArrayDeque<>();

    public void getResult() {
        System.out.println(resultList);
    }

    public void setResult(Object result) {
        if(result != null) resultList.add(result);
    }

    public void deleteNum() {
        try {
            resultList.remove();
        } catch (NoSuchElementException e) {
            System.out.println("저장된 값이 없습니다.");
        }
    }

    public Object calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case '+': {
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                return firstNum + secondNum;
            }
            case '-': {
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                return firstNum - secondNum;
            }
            case '*': {
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                return firstNum * secondNum;
            }
            case '/': {
                if (secondNum != 0) {
                    System.out.println(firstNum + " / " + secondNum + " = " + ((double) firstNum / secondNum));
                    return ((double)firstNum) / secondNum;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return null;
                }
            }
            default: {
                System.out.println("사칙 연산자를 입력해주세요.");
                return null;
            }
        }
    }
}
