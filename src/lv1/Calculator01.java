package lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력해주세요 : ");
                int firstNum = scanner.nextInt();

                System.out.print("사칙 연산 기호를 입력해주세요 : ");
                char operator = scanner.next().charAt(0);

                System.out.print("두 번째 숫자를 입력해주세요 : ");
                int secondNum = scanner.nextInt();
                scanner.nextLine();

                switch(operator) {
                    case '+': {
                        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                        break;
                    }
                    case '-': {
                        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                        break;
                    }
                    case '*': {
                        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                        break;
                    }
                    case '/': {
                        if (secondNum != 0) {
                            System.out.println(firstNum + " / " + secondNum + " = " + ((double) firstNum / secondNum));
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                        }
                        break;
                    }
                    default: {
                        System.out.println("사칙 연산자를 입력해주세요.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                scanner.nextLine();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if(scanner.nextLine().equals("exit")) return;
        }
    }
}
