package lv3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;

public class Data {
    // 속성
    final private Queue<Double> resultList = new ArrayDeque<>();

    // 생성자

    // 기능
    public void setData(Double data) {
        resultList.add(data);
    }

    public void getData() {
        System.out.println(resultList);
    }

    public void deleteFirstData() {
        resultList.remove();
    }

    public void getFormatData(int data) {
        System.out.println(resultList.stream().filter(num -> num >= data)
                .toList());
    }
}
