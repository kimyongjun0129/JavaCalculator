package lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

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
                    ArithmeticCalculator<Integer> calculator = new ArithmeticCalculator<>(firstNum, operator, secondNum);
                    data.setData(calculator.calculate());
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                scanner.nextLine();
            }

            try {
                System.out.print("저장된 결과값을 보시겠습니까? (y/아무 키 누르세요) ");
                if (scanner.nextLine().charAt(0) == 'y') {
                    System.out.print("몇 이상의 저장값을 조회하시겠습니까? ");
                    data.getFormatData(scanner.nextInt());
                    scanner.nextLine();
                }

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println();
            }

            try {
                System.out.print("첫 번째 결과를 삭제하시겠습니까? (y/아무 키 누르세요) ");
                if (scanner.nextLine().charAt(0) == 'y') {
                    data.deleteFirstData();
                    data.getData();
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if (scanner.nextLine().equals("exit")) return;
        }
    }
}
