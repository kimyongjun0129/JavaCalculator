package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // for 명령형 스타일 : 각 요소 * 10 처리
        ArrayList<Object> result1 = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer nultipliedNum = num * 10;
            result1.add(nultipliedNum);
        }
        System.out.println("result1 = " + result1);

        // stream 선언형 스타일: 각 요소 * 10 처리
        List<Integer>result2 = arrayList.stream()       // 1. 데이터 흐름 준비
                .map(num -> num * 10)            // 2. 중간 연산 등록
                .collect(Collectors.toList());          // 3. 최종 연산 단계
        System.out.println("result2 = " + result2);

        // 1. 익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> function = new Function<>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };

        List<Integer>result3 = arrayList.stream()       // 1. 데이터 흐름 준비
                .map(function)            // 2. 중간 연산 등록
                .collect(Collectors.toList());          // 3. 최종 연산 단계
        System.out.println("result3 = " + result3);

        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> functionalLambda = (interger -> interger * 10);

        List<Integer>result4 = arrayList.stream()       // 1. 데이터 흐름 준비
                .map(functionalLambda)            // 2. 중간 연산 등록
                .collect(Collectors.toList());          // 3. 최종 연산 단계
        System.out.println("result4 = " + result4);

        // 3. 람다식을 직접 매개변수로 전달
        List<Integer>result5 = arrayList.stream()       // 1. 데이터 흐름 준비
                .map(num -> num * 10)            // 2. 중간 연산 등록
                .collect(Collectors.toList());          // 3. 최종 연산 단계
        System.out.println("result5 = " + result5);
    }
}
