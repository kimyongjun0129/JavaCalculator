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
                int firstNum = scanner.nextInt();

                System.out.print("사칙 연산 기호를 입력해주세요 : ");
                char operator = scanner.next().charAt(0);

                System.out.print("두 번째 숫자를 입력해주세요 : ");
                int secondNum = scanner.nextInt();
                scanner.nextLine();

                if (firstNum < 0 || secondNum < 0) {
                    System.out.println("양의 정수만 입력하세요");
                } else {
                    Object result = calculator.calculate(firstNum, secondNum, operator);
                    calculator.setResult(result);
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                scanner.nextLine();
            }

            try {
                System.out.print("저장된 결과값을 보시겠습니까? (y/아무 키 누르세요) ");
                if (scanner.nextLine().charAt(0) == 'y') {
                    calculator.getResult();
                }
            } catch (StringIndexOutOfBoundsException e) {};

            try {
                System.out.print("첫 번째 결과를 삭제하시겠습니까? (y/아무 키 누르세요) ");
                if (scanner.nextLine().charAt(0) == 'y') {
                    calculator.deleteNum();
                    calculator.getResult();
                }
            } catch (StringIndexOutOfBoundsException e) {};

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if (scanner.nextLine().equals("exit")) return;
        }
    }
}