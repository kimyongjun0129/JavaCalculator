package lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            try {
            System.out.print("1. 계산하기 2.조회하기 3.삭제하기 4.종료하기 : ");
            int option = scanner.nextInt();
            switch(option) {
                case 1: {
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
                        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>(firstNum, operator, secondNum);
                        data.setData(calculator.calculate());
                    }
                    break;
                }
                case 2: {
                    System.out.print("몇 이상의 저장값을 조회하시겠습니까? ");
                    data.getFormatData(scanner.nextInt());
                    scanner.nextLine();
                    break;
                }
                case 3: {
                    data.deleteFirstData();
                    data.getData();
                    break;
                }
                case 4: {
                    return;
                }
                default: {
                    System.out.println("올바른 메뉴를 선택해주세요.");
                }
            }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요!");
                scanner.nextLine();
            }
        }
    }
}
