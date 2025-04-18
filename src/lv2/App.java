package lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력해주세요 : ");
                double firstNum = scanner.nextDouble();

                System.out.print("사칙 연산 기호를 입력해주세요 : ");
                char operator = scanner.next().charAt(0);

                System.out.print("두 번째 숫자를 입력해주세요 : ");
                double secondNum = scanner.nextDouble();
                scanner.nextLine();

                if (firstNum < 0 || secondNum < 0) {
                    System.out.println("양의 정수만 입력하세요");
                } else {
                    Double result = calculator.calculate(firstNum, secondNum, operator);
                    calculator.setResult(result);
                    calculator.getResult();
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                scanner.nextLine();
                calculator.deleteNum();
                calculator.getResult();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if (scanner.nextLine().equals("exit")) return;
        }
    }
}